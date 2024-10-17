package Exer1.builders;

import Exer1.entidades.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private String massa;
    private String tamanho;
    private List<String> ingredientes = new ArrayList<>();
    private boolean bordaRecheadaDoce;

    public PizzaBuilder setMassa(String massa) {
        this.massa = massa;
        return this;
    }

    public PizzaBuilder setTamanho(String tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    public PizzaBuilder addIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
        return this;
    }

    public PizzaBuilder setBordaRecheadaDoce(boolean bordaRecheadaDoce) {
        this.bordaRecheadaDoce = bordaRecheadaDoce;
        return this;
    }

    public Pizza build() {
        return new Pizza(massa, tamanho, ingredientes, bordaRecheadaDoce);
    }
}