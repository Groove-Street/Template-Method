package templatee;

public abstract class Radio {

	public abstract void play();
	
	public abstract void play2();

	public abstract void stop();
	
	public abstract void stop2();

	public abstract void avancarestacao();

	public abstract void avancarmusica();

	public final void executar() {

		// inicializa��o do radio// executando musica
		play();
		play2();
		// trocando para a pr�xima esta��o
		avancarestacao();
		avancarmusica();
		play2();
		// trocar para a pr�xima musica
		
		// parando o radio// parando a musica
		stop2();
		stop();
		
		
		

	}
}
