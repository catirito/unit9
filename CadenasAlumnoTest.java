package unit5;

/**
 * @author Bruno Del Greco
 *
 */


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

	
	@Test
	public final void testConvertirMayusculas() {
		
		assertEquals("Entornos".toUpperCase(), cad.convertirMayusculas("entornos"));
	}

	
	
	@Test
	public final void testConvertirMinusculas() {
		
		assertEquals("ENTORNOS".toLowerCase(), cad.convertirMinusculas("ENTORNOS"));
	}

	
	
	@Test
	public final void testLongitudCadena() {
		
		String cadena = "cadena";
		assertEquals(cadena.length(), cad.longitudCadena(cadena));
		
	}

	
	@Test
	public final void testEmpiezaCon() {
		String cadena = "cadena";
		assertEquals(cadena.startsWith("ca"), cad.empiezaCon(cadena, "ca"));
		
	}

	
	
	@Test
	public final void testAcabaEn() {
		String cadena = "cadena";
		assertEquals(!cadena.endsWith("na"), cad.acabaEn(cadena, "na"));
		
	}

	
	@Test
	public final void testPosicionPrimeraCadena() {
		String cadena = "cadena";
		assertEquals(cadena.indexOf("na"), cad.posicionPrimeraCadena(cadena, "na"));
	}
	
	
	@Test
	public final void testExtraerSubstringStringInt() {
		String cadena = "cadena";
		assertEquals(cadena.substring(3), cad.extraerSubstring(cadena, 3));
		assertEquals(cadena.substring(3,5), cad.extraerSubstring(cadena, 3,5));
	}
	

	@Test
	public final void testConcatenaCadenas() {
		String cadena = "cadena", cadena2 = "Entornos";
		assertEquals(cadena.concat(cadena2), cad.concatenaCadenas(cadena, cadena2));
	}


}
