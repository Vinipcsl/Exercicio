package ex2;

public class Main {

	public static void main(String[] args) {
		Elevador elevador = new Elevador();
		Elevador elevador2= new Elevador();
		while(true) {
		
		elevador.inicializa(6, 10);
		elevador.satusElevador();
		elevador.entra();
	}
	}
}

