package Filos;

import Animal.Animal;

public class Mamiferos extends Animal {
    public void corPelo(){

    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de um mamifero");
    }
}
