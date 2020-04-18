package Filos;

import Animal.Animal;

public class Peixe extends Animal {
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de peixe");
    }

    public void corEscama(){

    }

    public void soltarBolha(){

    }
}
