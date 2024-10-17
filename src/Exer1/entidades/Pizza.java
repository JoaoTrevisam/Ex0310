package Exer1.entidades;

import Exer1.builders.PizzaBuilder;

import java.util.List;

public class Pizza {
    private String massa;
    private String tamanho;
    private List<String> ingredientes;
    private boolean bordaRecheadaDoce;

    public Pizza(String massa, String tamanho, List<String> ingredientes, boolean bordaRecheadaDoce) {
        this.massa = massa;
        this.tamanho = tamanho;
        this.ingredientes = ingredientes;
        this.bordaRecheadaDoce = bordaRecheadaDoce;
    }

    @Override
    public String toString() {
        return "Pizza [Massa: " + massa + ", Tamanho: " + tamanho + ", Ingredientes: " + ingredientes +
                ", Borda recheada doce: " + (bordaRecheadaDoce ? "Sim" : "Não") + "]";
    }

    public String getMassa() {
        return massa;
    }

    public String getTamanho() {
        return tamanho;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public boolean isBordaRecheadaDoce() {
        return bordaRecheadaDoce;
    }

    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }
}