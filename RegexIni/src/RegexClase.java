import java.util.regex.Pattern;

public class RegexClase {
	
	public static boolean ValidarDNI(String texto) {
		return Pattern.matches("[0-9]{8}[A-Za-z]",texto);
	}
	public static boolean ValidarEMAIL(String em) {
		return Pattern.matches("^[A-Za-z0-9\\.]{3,}@[A-Za-z]{3,}\\.[A-Za-z]{2,}", em);
	}
	public static boolean numeroLetras(String intro) {
		return Pattern.matches("[A-Za-z0-9\s]{1,}", intro);
	}
	public static boolean validarTLF(String num) {
		return Pattern.matches("\\+?[0-9\s]{8,}", num);
	}
	public static boolean passCorrect(String contra) {
		return Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%&-]).{8,}$", contra);
	}
	
}
