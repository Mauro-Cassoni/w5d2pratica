package it.epicode.w5d1pratica.repository;

import it.epicode.w5d1pratica.bean.Drink;
import it.epicode.w5d1pratica.bean.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ToppingRepository extends JpaRepository<Topping, Integer> {


    @Query("select x from Topping x where x.nome = :nome")
    public List<Topping> findByNome(String nome);

    @Query("select x from Topping x")
    public List<Topping> findAll();

}
