package construtor;

public class Pessoa {
private String nome;
private int idade;

//metodo padrao sem argumentp
public Pessoa() {
	
}
//2 argumentos
public Pessoa(String nome, int idade) {
	this.nome = nome;
	this.idade = idade;
}
//1 argumento
public Pessoa(String nome) {
	this.nome = nome;
}
//1 argumento inteiro
public Pessoa(int idade) {
	this.idade = idade;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}
}
