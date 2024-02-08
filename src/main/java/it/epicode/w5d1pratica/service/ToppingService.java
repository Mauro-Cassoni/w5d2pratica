package it.epicode.w5d1pratica.service;

import it.epicode.w5d1pratica.bean.Pizza;
import it.epicode.w5d1pratica.bean.Topping;
import it.epicode.w5d1pratica.repository.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToppingService {

    @Autowired
    private ToppingRepository toppingRepository;

    public void salvaTopping(Topping topping){
        toppingRepository.save(topping);
    }

    public void aggiornaTopping(Topping topping){
        Topping p = toppingRepository.findById(topping.getId()).get();
        p.setNome(topping.getNome());
        p.setPrezzo(topping.getPrezzo());
        p.setCalorie(topping.getCalorie());
        toppingRepository.save(topping);
    }

    public Topping cercaById(int id){
        return toppingRepository.findById(id).get();
    }

    public void cancellaTopping(int id){
        toppingRepository.deleteById(id);
    }


    public List<Topping> cercaPizzaPerNome(String nome){
        return toppingRepository.findByNome(nome);
    }

    public List<Topping> mostraTutteLePizze(){
        return toppingRepository.findAll();
    }
}
