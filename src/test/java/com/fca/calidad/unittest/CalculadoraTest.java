package com.fca.calidad.unittest;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

public class CalculadoraTest {
	
	public Calculadora miCalculadora;

	@Before
	public void setUp() throws Exception {
		miCalculadora = new Calculadora();
	}

	

	@Test
	public void sumaPositivosTest() {
		
		//Ejercicio, llamada del codigo que vamos a probar
		double resultadoEjecucion = miCalculadora.suma(1,3);
		double resultadoEsperado = 4;
		
		//verificacion, comparar resultadoEjecucion con resultadoEsperado
		
		assertThat (resultadoEjecucion, is (resultadoEsperado));
	}
	
	@Test
	public void sumaNegativosTest() {
		
		//Ejercicio, llamada del codigo que vamos a probar
		double resultadoEjecucion = miCalculadora.suma(-1,-3);
		double resultadoEsperado = -4;
		
		//verificacion, comparar resultadoEjecucion con resultadoEsperado
		
		assertThat (resultadoEjecucion, is (resultadoEsperado));
	}
	
	@Test
	public void sumaConCeroTest() {
		
		//Ejercicio, llamada del codigo que vamos a probar
		double resultadoEjecucion = miCalculadora.suma(-1,0);
		double resultadoEsperado = -1;
		
		//verificacion, comparar resultadoEjecucion con resultadoEsperado
		
		assertThat (resultadoEjecucion, is (resultadoEsperado));
	}
	
	@Test
	public void restaTest() {
		
		//Ejercicio, llamada del codigo que vamos a probar
		double resultadoEjecucion = miCalculadora.resta(4,1);
		double resultadoEsperado = 3;
		
		//verificacion, comparar resultadoEjecucion con resultadoEsperado
		
		assertThat (resultadoEjecucion, is (resultadoEsperado));
	}
	
	@Test
	public void multiplicacionTest() {
		
		//Ejercicio, llamada del codigo que vamos a probar
		double resultadoEjecucion = miCalculadora.multiplicacion(4,2);
		double resultadoEsperado = 8;
		
		//verificacion, comparar resultadoEjecucion con resultadoEsperado
		
		assertThat (resultadoEjecucion, is (resultadoEsperado));
	}
	
	@Test
	public void divisionPositivoTest() {
		
		//Ejercicio, llamada del codigo que vamos a probar
		double resultadoEjecucion = miCalculadora.division(8,2);
		double resultadoEsperado = 4;
		
		//verificacion, comparar resultadoEjecucion con resultadoEsperado
		
		assertThat (resultadoEjecucion, is (resultadoEsperado));
	}
	
	@Test(expected = ArithmeticException.class)
	public void divisionConCeroTest() {
		
		//Ejercicio, llamada del codigo que vamos a probar
		double resultadoEjecucion = miCalculadora.division(2,0);
	//no necesita assert porque tiene una exception
	}
}