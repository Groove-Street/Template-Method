package templatee;

public class Estacao extends Radio {
	@Override
	public void play() {
		System.out.println("Iniciando esta��o FM/AM: ");

	}
	
	@Override
	public void play2() {
		System.out.println("Tocando a musica...");
	}

	@Override
	public void stop() {
		System.out.println("Desligando o radio...");

	}
	
	@Override
	public void stop2() {
		System.out.println("Parando de tocar a musica...");
	}

	@Override
	public void avancarestacao() {
		System.out.println("Passando para a pr�xima esta��o ");
	}

	@Override
	public void avancarmusica() {

	}

}
