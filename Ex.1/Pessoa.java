package exercicio01;

public class Pessoa {

	private String nome;
	private int idade;
	private double altura;
	

	//Construtor
	public Pessoa(String nome, int idade, double altura) {
		this.altura = altura;
		this.idade = idade;
		this.nome = nome;
		}
	//Getters e Setters
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		 this.nome = nome;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}

}


