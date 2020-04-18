package Filos;

import Animal.Animal;

public class Ave extends Animal {
    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public void corPena(){

    }

    public void fazerNinho(){

    }
}
