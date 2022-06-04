package implementacaotemplate;

import templatee.Estacao;
import templatee.TocadorRadio;
import templatee.Radio;

public class implementacao {
	public static void main(String[] args) {
		Radio estacaoo = new Estacao();
		estacaoo.executar();
		System.out.println();
		estacaoo = new TocadorRadio();
		estacaoo.executar();

	}

}
