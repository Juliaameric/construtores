package construtor;

public class ConstrutoConsulta {

	public static void main(String[] args) {
		Consulta consulta1 = new Consulta("11/09, as 17:00 ");
		Consulta consulta2 = new Consulta("11/09");
		Consulta cosulta3 = new Consulta();
		
		System.out.println(consulta1.getData());
		System.out.println(consulta1.getNomePcnte());
		System.out.println(consulta1.getNomeDents());
		
		System.out.println(consulta2.getData());
		
		
		
	}

}
