package Filos;

import Animal.Animal;

public class Reptil extends Animal {
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo carne...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }

    public void corEscama(){

    }
}
