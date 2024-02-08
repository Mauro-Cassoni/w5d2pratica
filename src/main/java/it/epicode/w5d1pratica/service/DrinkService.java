package it.epicode.w5d1pratica.service;

import it.epicode.w5d1pratica.bean.Drink;
import it.epicode.w5d1pratica.bean.Drink;
import it.epicode.w5d1pratica.bean.Pizza;
import it.epicode.w5d1pratica.repository.DrinkRepository;
import it.epicode.w5d1pratica.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService {

    @Autowired
    private DrinkRepository drinkRepository;

    public void salvaDrink(Drink drink){
        drinkRepository.save(drink);
    }

    public void aggiornaDrink(Drink drink){
        Drink p = drinkRepository.findById(drink.getId()).get();
        p.setNome(drink.getNome());
        p.setPrezzo(drink.getPrezzo());
        p.setCalorie(drink.getCalorie());
        drinkRepository.save(drink);
    }

    public Drink cercaById(int id){
        return drinkRepository.findById(id).get();
    }
    
    public void cancellaDrink(int id){
        drinkRepository.deleteById(id);
    }


    public List<Drink> cercaPizzaPerNome(String nome){
        return drinkRepository.findByNome(nome);
    }

    public List<Drink> mostraTutteLePizze(){
        return drinkRepository.findAll();
    }
}
