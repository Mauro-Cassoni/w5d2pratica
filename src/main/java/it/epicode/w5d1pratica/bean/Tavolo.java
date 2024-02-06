package it.epicode.w5d1pratica.bean;

import lombok.Data;
import org.springframework.context.annotation.Bean;
@Data
public class Tavolo {
    private int numero;
    private int numeroMaxCoperti;
    private Stato stato;
}
