package it.epicode.w5d1pratica.bean;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Data
public class Topping extends Item{

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "pizza_topping",
            joinColumns = @JoinColumn (name = "topping_id"),
            inverseJoinColumns = @JoinColumn(name = "pizza_id")
    )
    private List<Pizza> pizze;

    @Override
    public String toString() {
        return super.toString() +
                "pizze=" + pizze;
    }
}


