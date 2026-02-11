import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class RegexClase {
	private static final List<String> CODIGOS_PROVINCIALES = Arrays.asList("A", "AB", "AL", "AV", "B", "BA", "BI", "BU", "C", "CA", "CC", "CS", "CR", "CO", "CU", "GE", "GR", "GU", "H", "HU", "J", "L", "LE", "LO", "LU", "M", "MA", "MU", "O", "OR", "P", "NA", "PM", "PO", "S", "SA", "SS", "SG", "SE", "SO", "T", "TE", "GC", "TF", "TO", "V", "VA", "VI", "Z", "ZA", "CE", "ML", "GI", "OU", "IB");
	
	public static boolean ValidarDNI(String texto) {
		return Pattern.matches("[0-9]{8}[A-Za-z]",texto);
	}
	public static boolean ValidarEMAIL(String email) {
		return Pattern.matches("^[A-Za-z0-9\\.]{3,}@[A-Za-z]{3,}\\.[A-Za-z]{2,}", email);
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
	public static boolean matriculaInfo(String matricula) {
		
		if(Pattern.matches("^[0-9]{4}-[BCDFGHJKLMNPRSTVWXYZ]{3}$", matricula)) {
			
			return true;
		}
		
		int index = 0;
		String codigo;
		
		while(index < CODIGOS_PROVINCIALES.size()){
			
			codigo = CODIGOS_PROVINCIALES.get(index);
			if(Pattern.matches("^"+codigo+"-[0-9]{4}-[A-Z]{1,2}$", matricula)) {
				
				return true;
			}
			else ++index;
		}
		return false;
	}
}
