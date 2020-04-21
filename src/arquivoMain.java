import Canguru.Canguru;
import Filos.*;

public class arquivoMain {
	public static void main(String[] args) {
		Canguru canguru = new Canguru();
		
		System.out.println("Sobre as aves...");
		Ave ave = new Ave();
		ave.alimentar();
		ave.fazerNinho();
		ave.emitirSom();
		ave.locomover();
		
		System.out.println();
		
		System.out.println("Sobre os repteis...");
		Reptil reptil = new Reptil();
		reptil.alimentar();
		reptil.emitirSom();
		reptil.locomover();

		System.out.println();
		
		System.out.println("Sobre os peixes...");
		Peixe peixe = new Peixe();
		peixe.alimentar();
		peixe.emitirSom();
		peixe.locomover();

		System.out.println();
		
		System.out.println("Sobre os mamimeros...");
		Mamifero mamifero = new Mamifero();
		mamifero.alimentar();
		mamifero.emitirSom();
		mamifero.locomover();

		System.out.println();
		
		System.out.println("Sobre os cangurus...");
		canguru.alimentar();
		canguru.emitirSom();
		canguru.locomover();
		
	}
}
