package it.epicode.w5d1pratica.repository;

import it.epicode.w5d1pratica.bean.Drink;
import it.epicode.w5d1pratica.bean.Pizza;
import it.epicode.w5d1pratica.bean.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

    @Query("select x from Pizza x where x.nome = :nome")
    public List<Pizza> findByNome(String nome);

    @Query("select x from Pizza x")
    public List<Pizza> findAll();

}
