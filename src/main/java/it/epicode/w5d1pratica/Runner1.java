package it.epicode.w5d1pratica;


import it.epicode.w5d1pratica.bean.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;

@Component
@Order(1)
public class Runner1 implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(W5d1praticaApplication.class);


        Pizza pizza1 = ctx.getBean("margherita",Pizza.class);


        Ordine ordine1 = ctx.getBean("ordine1",Ordine.class);
        ordine1.setElementiMenu(List.of(pizza1));

        System.out.println(ordine1);

    }

}
