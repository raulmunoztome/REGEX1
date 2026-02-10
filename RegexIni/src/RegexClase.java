import java.util.regex.Pattern;

public class RegexClase {
	
	public static boolean ValidarDNI(String texto) {
		return Pattern.matches("[0-9]{8}[A-Za-z]",texto);
	}
	public static boolean ValidarEMAIL(String em) {
		return Pattern.matches("^[A-Za-z0-9\\.]*@[A-Za-z]{3,}\\.[A-Za-z]{2,}", em);
	}
	
}
