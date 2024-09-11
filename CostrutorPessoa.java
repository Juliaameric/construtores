package construtor;

public class CostrutorPessoa {

	public static void main(String[] args) {
		 // sem argumento
		Pessoa jogador1 = new Pessoa();
		//construtor 2 argumento
		Pessoa jogador2 = new Pessoa("messi",36);
		//costrutor 1 argumento
		Pessoa jogador3 = new Pessoa("a");
		//costrutor 1 argumento
		Pessoa jogador4 = new Pessoa(45);
		
		
		System.out.println(jogador1.getNome());
		
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
		
		System.out.println(jogador3.getNome());
		
		System.out.println(jogador4.getIdade());
	}

}
