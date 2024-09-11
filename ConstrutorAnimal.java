package construtor;

public class ConstrutorAnimal {

	public static void main(String[] args) {
		
		Animal gato = new Animal("67cm, persa marrom");
		Animal leao = new Animal("rosa");
		Animal lontra = new Animal();
		
		System.out.println(gato.getTamanho());
		System.out.println(gato.getCor());
		
		System.out.println(leao.getCor());
	}

}
