package it.epicode.w5d1pratica.service;

import it.epicode.w5d1pratica.bean.Pizza;
import it.epicode.w5d1pratica.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzeService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public void salvaPizza(Pizza pizza){

        pizzaRepository.save(pizza);
    }

    public void aggiornaPizza(Pizza pizza){
        Pizza p = pizzaRepository.findById(pizza.getId()).get();
        p.setNome(pizza.getNome());
        p.setPrezzo(pizza.getPrezzo());
        p.setCalorie(pizza.getCalorie());
        p.setToppings(pizza.getToppings());
        pizzaRepository.save(pizza);
    }

    public Pizza cercaById(int id){
        return pizzaRepository.findById(id).get();
    }

    public void cancellaPizza(int id){
        pizzaRepository.deleteById(id);
    }

    public List<Pizza> cercaPizzaPerNome(String nome){
        return pizzaRepository.findByNome(nome);
    }

    public List<Pizza> mostraTutteLePizze(){
        return pizzaRepository.findAll();
    }
}
