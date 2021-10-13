package br.com.exercicios;

public class ImprimirAnimal {

	public static void main(String[] args) {
		
		TestaTodos t = new TestaTodos();
		t.AnimalFazSom(new Cavalo());
		t.AnimalFazSom(new Cachorro());
		t.AnimalFazSom(new Preguica());
	}

}
