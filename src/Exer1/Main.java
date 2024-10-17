package Exer1;
import Exer1.entidades.Pizza;
import Exer1.builders.PizzaBuilder;

public class Main {
    public static void main(String[] args) {
        Pizza minhaPizza = new PizzaBuilder()
                .setMassa("Fina")
                .setTamanho("Grande")
                .addIngrediente("Queijo")
                .addIngrediente("Tomate")
                .addIngrediente("Orégano")
                .addIngrediente("Pepperoni")
                .addIngrediente("Lonbinho")
                .addIngrediente("Azeitonas")
                .addIngrediente("Milho")
                .addIngrediente("Ovos")
                .addIngrediente("Palmito")
                .setBordaRecheadaDoce(true)
                .build();

        System.out.println(minhaPizza);
    }
}