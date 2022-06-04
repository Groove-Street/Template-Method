package templatee;

public abstract class Radio {

	public abstract void play();
	
	public abstract void play2();

	public abstract void stop();
	
	public abstract void stop2();

	public abstract void avancarestacao();

	public abstract void avancarmusica();

	public final void executar() {

		// inicialização do radio// executando musica
		play();
		play2();
		// trocando para a próxima estação
		avancarestacao();
		avancarmusica();
		play2();
		// trocar para a próxima musica
		
		// parando o radio// parando a musica
		stop2();
		stop();
		
		
		

	}
}
