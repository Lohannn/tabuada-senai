package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Tabuada {

	public int numeroMultiplicado;
	public int minMultiplicador;
	public int maxMultiplicador;
	public ArrayList<String> conta = new ArrayList<String>();

	public int getTabuada() {
		return numeroMultiplicado * minMultiplicador;
	}

	public ArrayList<String> getResultados() {

		while (minMultiplicador <= maxMultiplicador) {
			conta.add(numeroMultiplicado + " x " + minMultiplicador + " = " + getTabuada());
			minMultiplicador++;
		}
		return conta;

	}

}