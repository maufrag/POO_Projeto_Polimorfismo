package Animal;

public abstract class Animal {
    protected double peso;
    protected int indade;
    protected String[] membros;


    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
