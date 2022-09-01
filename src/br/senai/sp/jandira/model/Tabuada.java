package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Tabuada {
		
	public int numeroMultiplicado;
	public int minMultiplicador;
	public int maxMultiplicador;
	public ArrayList<String> conta = new ArrayList<String>();
	public int resultado = numeroMultiplicado * minMultiplicador;
	
	public void getTabuada() {
		
		while (minMultiplicador < maxMultiplicador) {
			conta.add(numeroMultiplicado + " x " + minMultiplicador + " = " + resultado);
			minMultiplicador++;
		}
		
	}
	
}