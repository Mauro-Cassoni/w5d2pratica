package it.epicode.w5d1pratica.bean;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.time.LocalTime;
import java.util.List;

@Data
public class Ordine {
    @Autowired
    @Qualifier("tavolo1")
    private Tavolo tavolo;
    private List<Item> elementiMenu;
    private int numeroOrdine;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private LocalTime orario;
    private int costoCoperto;
    private double importoTotale;

    @PostConstruct
    public void calcolaImportoTotale() {
        if (elementiMenu != null) {
            importoTotale = (numeroCoperti * costoCoperto) + (elementiMenu.stream().mapToDouble(Item::getPrezzo).sum());
        } else {
            importoTotale = 0;
        }
    }
}


