package unit5;

import static org.junit.Assert.*;
import junit.framework.Assert;
import static java.lang.System.out;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CadenasAlumnoTest {
	public CadenasAlumno cad;  // si no esta fuera del construcctor os test no funcionan
	
	public CadenasAlumnoTest(){
		cad = new CadenasAlumno();
	}
	
	@Test
	public final void testSonIguales() {
		String m = "entornos", n = "ento";
		
		boolean recived = cad.sonIguales(m, n);
		
		assertEquals(false, recived);
		
		m = "ento"; n = "entornos,";
	    recived = cad.sonIguales(m, n);
		
		assertEquals(false, recived);
		
		m = "entornos"; n = "sonrotne";
	    recived = cad.sonIguales(m, n);
		
		assertEquals(false, recived);
		
		m = "entornos"; n = "entornos";
	    recived = cad.sonIguales(m, n);
		
		assertEquals(true, recived);
	}

	@Test
	public final void testEsMayor() {
		
		boolean recived = cad.esMayor("entornos", "ento");
		assertEquals(true, recived);
		
	}

	@Test
	public final void testEsMenor() {
		
		assertEquals(true, cad.esMenor("ento", "entornos"));
		
	}
	
	
	@Test
	public final void testComparaIgnorandoMayusculas() {
		
		assertEquals("Ento".equalsIgnoreCase("entornos"), cad.comparaIgnorandoMayusculas("Ento", "entornos"));
		
	}
	
	@Test
	public final void testReemplazaTodos() {
		
		assertEquals("Entornos".replaceAll("o", "x"), cad.reemplazaTodos("Entornos","o", "x"));
		
		
	}

	
	@Test
	public final void testReemplazaPrimero() {
		assertEquals("Entornos".replaceFirst("o", "x"), cad.reemplazaPrimero("Entornos","o", "x"));
	}
	
	
	@Test
	public final void testQuitaEspacios() {
		
		assertEquals("  Entornos  ".trim(), cad.quitaEspacios("  Entornos     "));
		
	}

	/*
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
