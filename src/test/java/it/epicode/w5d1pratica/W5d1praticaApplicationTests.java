package it.epicode.w5d1pratica;

import it.epicode.w5d1pratica.bean.Drink;
import it.epicode.w5d1pratica.bean.Pizza;
import it.epicode.w5d1pratica.bean.Tavolo;
import it.epicode.w5d1pratica.bean.Topping;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootTest
class W5d1praticaApplicationTests {

//	static AnnotationConfigApplicationContext ctx;
//	static int contatore=0;
//
//	@BeforeAll
//	static void accediAlContesto(){
//		ctx = new AnnotationConfigApplicationContext(W5d1praticaApplication.class);
//	}
//
//	@Autowired
//	static W5d1praticaApplication controller;
//
//	@Test
//	void numroCopertiMassimi(){
//		Tavolo tavolo1 = ctx.getBean("tavolo1", Tavolo.class);
//		Assertions.assertEquals(5,tavolo1.getNumeroMaxCoperti());
//	}
//
//	@ParameterizedTest
//	@ValueSource(doubles = {4.99})
//	void verificaPrezzoPizze(double prezzo){
//		List<Pizza> pizzaList = ctx.getBean("lista_pizze", List.class);
//		System.out.println(pizzaList.get(contatore));
//		Assertions.assertEquals(prezzo,pizzaList.get(contatore++).getPrezzo());
//	}
//
//	@Test
//	void caloriePizza(){
//		Pizza margherita = ctx.getBean("margherita", Pizza.class);
//		Assertions.assertNotEquals(50,margherita.getCalorie());
//	}
//
//	@Test
//	void verificaBeanNotNull(){
//		Tavolo tavolo1 = ctx.getBean("tavolo1", Tavolo.class);
//		Assertions.assertAll(
//				()-> Assertions.assertNotNull(tavolo1),
//				()-> Assertions.assertNotNull(tavolo1.getStato())
//		);
//	}
//
//	@Test
//	void verificaDrink(){
//		Drink drink = ctx.getBean("water",Drink.class);
//		System.out.println(drink);
//	}
//
//	@Test
//	void verificaCalorieTopping(){
//		Topping topping = ctx.getBean("salame", Topping.class);
//		Assertions.assertNotEquals(55,topping.getCalorie());
//	}
//
//
//
//
//
//	@Test
//	void contextLoads() {
//	}

}
