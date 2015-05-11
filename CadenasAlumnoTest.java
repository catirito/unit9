package unit5;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CadenasAlumnoTest {
	public CadenasAlumno cad;
	
	public CadenasAlumnoTest(){
		cad = new CadenasAlumno();
	}
	
	@Test
	public final void testSonIguales() {
		String m = "a", n = "a";
		
		boolean recived = cad.sonIguales(m, n);
		
		assertEquals(true, recived);
		
		m = "ab"; n = "a";
	    recived = cad.sonIguales(m, n);
		
		assertEquals(true, recived);
	}

	@Test
	public final void testEsMayor() {
		//fail("Not yet implemented"); // TODO
	}
/*
	@Test
	public final void testEsMenor() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testComparaIgnorandoMayusculas() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testReemplazaTodos() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testReemplazaPrimero() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testQuitaEspacios() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testConvertirMayusculas() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testConvertirMinusculas() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testLongitudCadena() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testEmpiezaCon() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testAcabaEn() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testCaracterPosicion() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testPosicionPrimeraCadena() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testExtraerSubstringStringInt() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testExtraerSubstringStringIntInt() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testConvertirEnteroString() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testConcatenaCadenas() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testMain() {
		fail("Not yet implemented"); // TODO
	}
*/
}
