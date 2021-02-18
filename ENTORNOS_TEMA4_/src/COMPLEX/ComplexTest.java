package COMPLEX;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComplexTest {

	@Test
	void testSumar() {
		Complex numero1= new Complex(50,30);
		Complex numero2= new Complex(20,5);
		
		Complex resultado=numero1.sumar(numero2);
		Complex resultado_esperado= new Complex(70,35);
		assertEquals(resultado,resultado_esperado);
	}

	@Test
	void testRestar() {
		Complex numero1= new Complex(100,40);
		Complex numero2= new Complex(20,15);
		Complex resultado=numero1.restar(numero2);
		Complex resultado_esperado= new Complex(80,25);
		assertEquals(resultado,resultado_esperado);
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
	// RESTA Y DIVISIÓN
	@Test
	void testDividir1() {
		Complex numero1=new Complex(3.12,2.14);
		Complex numero2=new Complex(1.1,1.3);
		Complex resultado= numero1.dividir(numero2);
		Complex resultado_esperado=new Complex(2.142758620689655, -0.5868965517241377);
		assertEquals(resultado,resultado_esperado);
		
	}
	@Test
	void testDividir2() {
		Complex numero1=new Complex(-2.1,1.5);
		Complex numero2=new Complex(1.32,-1.98);
		Complex resultado= numero1.dividir(numero2);
		Complex resultado_esperado= new Complex(-1.013986013986014, -0.3846153846153847);
		assertEquals(resultado,resultado_esperado);
	}
	@Test
	void testRestar1() {
		Complex numero1= new Complex(-2,1);
		Complex numero2= new Complex(-2,1.2);
		Complex resultado=numero1.restar(numero2);
		Complex resultado_esperado= new Complex(0, -0.19999999999999996);
		assertEquals(resultado,resultado_esperado);
	}
	@Test
	void testRestar2() {
		Complex numero1= new Complex(1,-5);
		Complex numero2= new Complex(2,-5);
		Complex resultado=numero1.restar(numero2);
		Complex resultado_esperado= new Complex(-1,0);
		assertEquals(resultado,resultado_esperado);
	}

}
