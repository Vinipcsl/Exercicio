package ex2;

public class Elevador {
	// atributo - private
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int ocupacao;
	//metodos - public
	
	public void satusElevador() {
		System.out.println("Status do elevador: ");
		System.out.println("Capacidade: " + getCapacidade());
		System.out.println("Total Andares: " + getTotalAndares());
		System.out.println("Andar Atual: " + getAndarAtual());
		System.out.println("Ocupação: " + getOcupacao());
	}
	
	public	void inicializa( int capacidade, int totalAndares){
	this.capacidade = capacidade;
	this.totalAndares= totalAndares;
	andarAtual = 0;
	ocupacao = 0;
	}
	public void entra () {
		if(ocupacao < capacidade)
		ocupacao++;
		
	}
	public	void sai() {
		if(ocupacao > 0) {
			ocupacao--;
}
		}
	
	public	void sobe () {
		if(andarAtual < totalAndares) {
		andarAtual++;
		}
	
	}
	public void desce() {
		if (andarAtual > 0)
			andarAtual--;
	}
	
	
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getOcupacao() {
		return ocupacao;
	}
	public void setOcupacao(int ocupacao) {
		this.ocupacao = ocupacao;
	}
	

}
