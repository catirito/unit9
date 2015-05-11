/**
 * 
 */
package unit5;


import static java.lang.System.out;
/**
 * @author Bruno Del Greco
 *
 */
public class CadenasAlumno {

	public CadenasAlumno(){
		
	};
	
	public static boolean sonIguales(String cadena1, String cadena2) {
		
		if(cadena1 == cadena2)
			return true;
		
		return false;
	}
	
	public static boolean esMayor(String cadena1, String cadena2) {
		
		if(cadena1.length() > cadena2.length()){
			
			
			return true;
			
		
		}
		
		return false;
	}
	
	public static boolean esMenor(String cadena1, String cadena2) {
		
		if(cadena1.length() < cadena2.length()){
			
			
			return true;
			
		}
		
		return false;
	}
	
	public static boolean comparaIgnorandoMayusculas(String cadena1, String cadena2) {
		
		if(cadena1.length() == cadena2.length()){
			
			for(int i = 0; i<cadena1.length(); i++){
				if(convertirMinusculas(cadena1).charAt(i) < convertirMinusculas(cadena2).charAt(i))
					return true;
			}
		}
		
		return false;
	}
	
	public static String reemplazaTodos(String cadena, String regla, String cambio) {
		
		String resultado="";
		
		for (char c : cadena.toCharArray()){
			
			if(c == regla.charAt(0))
				resultado+=cambio;
			else
				resultado+=c;
			
		}
		
		return resultado;
	}
	public static String reemplazaPrimero(String cadena, String regla, String cambio) {
		
		String resultado="";
		boolean encontrado = false;
		
		for (char c : cadena.toCharArray()){
			
			if(c == regla.charAt(0) && !encontrado){
				resultado+=cambio;
				encontrado=true;
			}
			else
				resultado+=c;
		}
		return resultado;
	}

	public static String quitaEspacios(String cadena){
		String resultadoTemp="";
		String resultado="";
		boolean encontrado = false;
		
		for (char c : cadena.toCharArray()){
			
			if(c == ' ' && !encontrado){
				
			}
			else{
				encontrado=true;
				resultadoTemp+=c;
			}
		}
		// hasta aqui es un LTrim
		encontrado = false;
		for(int i =resultadoTemp.length()-1; i>=0; i--){
			if(resultadoTemp.charAt(i) == ' ' && !encontrado){
				
			}
			else{
				encontrado=true;
				resultado+=resultadoTemp.charAt(i);
			}
		}
		
		resultadoTemp=resultado;
		resultado="";
		for (char c : resultadoTemp.toCharArray()){
			resultado = c + resultado;
			
		}
		
		// Aqui RTrim
		return resultado;
	
	}
	
	public static String convertirMayusculas(String cadena){
		
		String resultado="";
		
		for (char c : cadena.toCharArray()){
			if(c == ' ')
				resultado+=' ';
			else
				resultado+=(char)(c-32);
			
		}
		
		return resultado;
	}
	public static String convertirMinusculas(String cadena){
		String resultado="";
		
		for (char c : cadena.toCharArray()){
			if(c == ' ')
				resultado+=' ';
			else
				resultado+=(char)(c+32);
			
		}
		
		return resultado;
	}

	public static long longitudCadena(String cadena){
		int cont=0;
		for (char c : cadena.toCharArray())
			cont++;
		
		return cont;
	}
	
	
	public static boolean empiezaCon(String cadena, String prefijo){
		char[] cad = cadena.toCharArray();
		char[] pref = prefijo.toCharArray();
		
		boolean igual = true;
		
		for(int i = 0; i<pref.length; i++)
		{
			if(cad[i] != pref[i])
				igual = false;
		}
		
		return igual;
	}
	
	
	public static boolean acabaEn(String cadena, String sufijo){
		char[] cad = cadena.toCharArray();
		char[] suf = sufijo.toCharArray();
		
		boolean igual = true;
		
		for(int i = suf.length-1; i>=0; i--)
		{
			if(cad[cad.length-i-1] != suf[i])
				igual = false;
		}
		
		return igual;
	}
	
	public static char caracterPosicion(String cadena, int indice){
		
		return cadena.charAt(indice);
	}
	public static long posicionPrimeraCadena(String cadena, String letra){
		
		for(int i = 0; i<cadena.length(); i++)
		{
			if(cadena.charAt(i) == letra.charAt(0))
				return i;
		}
		
		return -1;
	}
	public static String extraerSubstring(String cadena, int posicionInicio){
		String resultado="";
		
		for(int i = posicionInicio; i<cadena.length(); i++)
		{
			resultado += cadena.charAt(i);
		}
		
		return resultado;
	}
	public static String extraerSubstring(String cadena, int posicionInicio, int posicionFinal){
		String resultado="";
		
		for(int i = posicionInicio; i<posicionFinal; i++)
		{
			resultado += cadena.charAt(i);
		}
		
		return resultado;
	}
	
	public static String convertirEnteroString(int numero){
		return "cadena";
	}
	

	public static String concatenaCadenas(String cadena1, String cadena2){
		return cadena1+cadena2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1 = "a cc vggAddbax";
		String cadena2 = "x";
		
		out.println(extraerSubstring(cadena1, 3));
	}

}
