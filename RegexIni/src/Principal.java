
public class Principal {

	public static void main(String[] args) {
		
		System.out.println(RegexClase.ValidarDNI("47667949N"));
		System.out.println(RegexClase.ValidarEMAIL("raul@hotmail.com"));
		System.out.println(RegexClase.ValidarEMAIL("ral@hotl.com"));
		System.out.println(RegexClase.ValidarEMAIL("raul@hotmailes"));
		System.out.println(RegexClase.ValidarEMAIL("john.doe123@mail.net"));
		System.out.println(RegexClase.ValidarEMAIL("1john.doe123@mail.net"));
	}

}
