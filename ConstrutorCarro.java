package construtor;

public class ConstrutorCarro {

	public static void main(String[] args) {

		Carro fusca = new Carro("S3G88J", 000);
		Carro ferrari = new Carro("xxxxx");
		Carro porshe = new Carro();
		
		
		System.out.println(fusca.getPlaca());
		System.out.println(fusca.getNumChassi());
		
		System.out.println(ferrari.getPlaca());

		

		
	}

}
