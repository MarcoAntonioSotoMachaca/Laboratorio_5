package main;

import modelo.Animal;
import modelo.Perro;
import modelo.Gato;
import modelo.Figura;
import modelo.Circulo;
import modelo.Rectangulo;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PARTE 2: USO DEL POLIMORFISMO CON ANIMALES ===");

        Animal miAnimal = new Animal();
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miAnimal.hacerSonido();
        miPerro.hacerSonido();
        miGato.hacerSonido();

        System.out.println();
        System.out.println("=== PARTE 3: DESAFIO DE FIGURAS ===");

        Figura[] figuras = {
            new Circulo(3.0),
            new Rectangulo(4.0, 5.0),
            new Circulo(2.5),
            new Rectangulo(6.0, 3.0)
        };

        for (int i = 0; i < figuras.length; i++) {
            System.out.printf("Area de la figura %d: %.2f%n", i + 1, figuras[i].calcularArea());
        }
    }
}
