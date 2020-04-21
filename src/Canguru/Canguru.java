package Canguru;

import Filos.Mamifero;

public class Canguru extends Mamifero {

    @Override
    public void locomover() {
        System.out.println("Pulando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo ervas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de um canguru");
    }
}
