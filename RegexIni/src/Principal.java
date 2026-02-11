
public class Principal {

	public static void main(String[] args) {
		System.out.println("DNI: ");
		System.out.println("47667949N "+RegexClase.ValidarDNI("47667949N")+"\n");
		
		System.out.println("EMAILS:");
		System.out.println("raul@hotmail.com "+RegexClase.ValidarEMAIL("raul@hotmail.com"));
		System.out.println("ral@hotl.es "+RegexClase.ValidarEMAIL("ral@hotl.es"));
		System.out.println("rap@ht.com "+RegexClase.ValidarEMAIL("rap@ht.com"));
		System.out.println("raul@hotmailes "+RegexClase.ValidarEMAIL("raul@hotmailes"));
		System.out.println("john.doe123@mail.net "+RegexClase.ValidarEMAIL("john.doe123@mail.net"));
		System.out.println("1john.doe123@mail.net "+RegexClase.ValidarEMAIL("1john.doe123@mail.net")+"\n");
		
		System.out.println("TEXTO Y NUMEROS:");
		System.out.println("'Este texto tiene 43 numer0s y letras 111' "+RegexClase.numeroLetras("Este texto tiene 43 numer0s y letras 111"));
		System.out.println("'Este texto tiene cositas-p raras - y a90' "+RegexClase.numeroLetras("Este texto tiene cositas raras '- y a90")+"\n");
		
		System.out.println("NUMERO DE TELEFONO: ");
		System.out.println("'+34 612345678' "+RegexClase.validarTLF("+34 612345678"));
		System.out.println("'612 34 56 78' "+RegexClase.validarTLF("612 34 56 78"));
		System.out.println("'612345678' "+RegexClase.validarTLF("612345678"));
		System.out.println("'+9555 4' "+RegexClase.validarTLF("+9555 4")+"\n");
		
		System.out.println("CONTRASEÑA SEGURA:");
		System.out.println("B-3456a-AN "+RegexClase.passCorrect("B-3456a-AN"));
		System.out.println("B-3456-AN "+RegexClase.passCorrect("B3456-AN")+"\n");
		
		System.out.println("MATRICULAS: ");
		System.out.println("B-3456-AN "+RegexClase.matriculaInfo("B-3456-AN"));
		System.out.println("HU-1234-X "+RegexClase.matriculaInfo("HU-1234-X"));
		System.out.println("7890-MXZ "+RegexClase.matriculaInfo("7890-MXZ"));
		System.out.println("5645-AXZ "+RegexClase.matriculaInfo("5645-AXZ"));
		System.out.println("R-5645-AN "+RegexClase.matriculaInfo("R-5645-AN"));
		
	}

}
