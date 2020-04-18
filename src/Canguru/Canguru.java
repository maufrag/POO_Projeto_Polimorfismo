package Canguru;

import Filos.Mamiferos;

import java.awt.desktop.SystemSleepEvent;

public class Canguru extends Mamiferos {

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
