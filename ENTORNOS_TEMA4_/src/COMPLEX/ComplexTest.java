package COMPLEX;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComplexTest {

	@Test
	void testSumar() {
		Complex prueba= new Complex(50,30);
		Complex prueba2= new Complex(20,5);
		
		Complex resultado=prueba.sumar(prueba2);
		Complex resultado_esperado= new Complex(70,35);
		assertEquals(resultado,resultado_esperado);
	}

	@Test
	void testRestar() {
		Complex prueba3= new Complex(100,40);
		Complex prueba4= new Complex(20,15);
		Complex resultado1=prueba3.restar(prueba4);
		Complex resultado_esperado1= new Complex(80,25);
		assertEquals(resultado1,resultado_esperado1);
	}

	@Test
	void testMultiplicarComplex() {
		Complex numero1= new Complex(1,2);
		Complex numero2= new Complex(4,4);
		Complex resultado=numero1.multiplicar(numero2);
		Complex resultado_esperado=new Complex(-4,12);
		assertEquals(resultado,resultado_esperado);
		}

	@Test
	void testMultiplicarDouble() {
		Complex numero1=new Complex(2,3);
		double n=3D;
		Complex resultado= new Complex(6D,9D);
		Complex resultado_esperado= numero1.multiplicar(n);
		assertEquals(resultado,resultado_esperado);
	}

	@Test
	void testDividir() {
		Complex numero1=new Complex(3,5);
		Complex numero2= new Complex(2,0);
		Complex resultado=numero1.dividir(numero2);
		Complex resultado_esperado=new Complex(1.5,2.5);
		assertEquals(resultado,resultado_esperado);
	}

	@Test
	void testToString() {
		Complex prueba11=new Complex(3,4);
		Complex resultado_esperado5= new Complex(3,4);
		String obtenido=prueba11.toString();
	}

	@Test
	void testEqualsObject() {
		Complex numero1= new Complex(5,8);
		Complex numero2= new Complex(5,8);
		Complex numero3= new Complex(3.5,6.7);
	}

}
