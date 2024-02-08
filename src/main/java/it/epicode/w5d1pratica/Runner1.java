package it.epicode.w5d1pratica;


import it.epicode.w5d1pratica.bean.*;
import it.epicode.w5d1pratica.service.DrinkService;
import it.epicode.w5d1pratica.service.PizzeService;
import it.epicode.w5d1pratica.service.ToppingService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import org.slf4j.*;

import java.time.LocalTime;
import java.util.List;
import java.util.logging.Logger;

@Component
@Order(1)
public class Runner1 implements CommandLineRunner {

    @Autowired
    private PizzeService pizzeService;
    @Autowired
    private DrinkService drinkService;
    @Autowired
    private ToppingService toppingService;

    @Override
    public void run(String... args) throws Exception {


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(W5d1praticaApplication.class);


//        Pizza margherita = ctx.getBean("margherita",Pizza.class);
//        pizzeService.salvaPizza(margherita);

//        Topping mozzarella = ctx.getBean("mozzarella", Topping.class);
//        toppingService.salvaTopping(mozzarella);
//
//        Drink water = ctx.getBean("water", Drink.class);
//        drinkService.salvaDrink(water);

        System.out.println(pizzeService.mostraTutteLePizze());
        System.out.println(pizzeService.cercaPizzaPerNome("Pizza Margherita"));




    }

}
