package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.Elevador;

public class ElevadorTeste {

	@Test
	public void entrarElevador220() {
		double num1 = 200.0;
		double num2 = 20.0;
		
		Elevador elevador = new Elevador();
		double numEsperado = 220.0;
		double resultadoReal = elevador.entrarNoelevador(num1, num2);
		
		assertEquals(numEsperado, resultadoReal, 0);
		

		
	}
	
	@Test
	public void entrarElevador2205() {
		double num1 = 200.5;
		double num2 = 20.0;
		
		Elevador elevador = new Elevador();
		double numEsperado = 220.5;
		double resultadoReal = elevador.entrarNoelevador(num1, num2);
		
		assertEquals(numEsperado, resultadoReal, 0);
		

		
	}

	@Test
	public void sairElevador2205() {
		double num1 = 200.5;
		double num2 = 20.0;
		
		Elevador elevador = new Elevador();
		double numEsperado = 200.5;
		double resultadoReal = elevador.sairNoelevador(num1, num2);
		
		assertEquals(numEsperado, resultadoReal, 0);
		

		
	}
	
	

}
