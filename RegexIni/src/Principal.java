
public class Principal {

	public static void main(String[] args) {
		System.out.println("DNI: ");
		System.out.println("47667949N "+RegexClase.ValidarDNI("47667949N"));
		
		System.out.println("EMAILS:");
		System.out.println("raul@hotmail.com "+RegexClase.ValidarEMAIL("raul@hotmail.com"));
		System.out.println("ral@hotl.com "+RegexClase.ValidarEMAIL("ral@hotl.com"));
		System.out.println("rl@hotl.com "+RegexClase.ValidarEMAIL("rl@hotl.com"));
		System.out.println("raul@hotmailes "+RegexClase.ValidarEMAIL("raul@hotmailes"));
		System.out.println("john.doe123@mail.net "+RegexClase.ValidarEMAIL("john.doe123@mail.net"));
		System.out.println("1john.doe123@mail.net "+RegexClase.ValidarEMAIL("1john.doe123@mail.net"));
		
		System.out.println("TEXTO Y NUMEROS:");
		System.out.println("'Este texto tiene 43 numer0s y letras 111' "+RegexClase.numeroLetras("Este texto tiene 43 numer0s y letras 111"));
		System.out.println("'Este texto tiene cositas-p raras - y a90' "+RegexClase.numeroLetras("Este texto tiene cositas raras '- y a90"));
		
		System.out.println("NUMERO DE TELEFONO: ");
		System.out.println("'+34 612345678' "+RegexClase.validarTLF("+34 612345678"));
		System.out.println("'612 34 56 78' "+RegexClase.validarTLF("612 34 56 78"));
		System.out.println("'612345678' "+RegexClase.validarTLF("612345678"));
		System.out.println("'+9555 4' "+RegexClase.validarTLF("+9555 4"));
		
		System.out.println("CONTRASEÑA SEGURA:");
		System.out.println("B-3456a-AN "+RegexClase.passCorrect("B-3456a-AN"));
		System.out.println("B-3456-AN "+RegexClase.passCorrect("B-3456-AN"));
	}

}
