import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import br.com.fiap.observando.service.DolarService;
import br.com.fiap.observando.view.DolarCotacaoView;
import br.com.fiap.observando.view.TelaElevadorView;
import br.com.fiap.observando.view.TelaTabletView;

public class RunnerObserv {

	public static void main(String[] args) {

		
		DolarService dolarService = new DolarService();
		dolarService.calcularDolarVersusReal();

		DolarCotacaoView telaCotacao = new DolarCotacaoView(dolarService);
		//telaCotacao.exibirCotacaoDolarReal();
		
		/*
		TelaElevadorView telaElevador = new TelaElevadorView(dolarService.getCotacaoDolarReal());
		telaElevador.exibirCotacaoDolarReal();
		
		TelaTabletView telaTablet = new TelaTabletView(dolarService.getCotacaoDolarReal());
		telaTablet.exibirCotacaoDolarReal();
		*/
		
		
		System.out.println("---------------------------------------");
		
		Timer t = new Timer();  
		TimerTask tt = new TimerTask() {  
		    @Override  
		    public void run() {  
		    	dolarService.calcularDolarVersusReal();

		    	//double valorDolarCorrente = dolarService.getCotacaoDolarReal();
				
				/*
				telaCotacao.setCotacaoDolarReal(valorDolarCorrente);
				telaCotacao.exibirCotacaoDolarReal();
				*/
				
				/*
				telaElevador.setCotacaoDolarReal(valorDolarCorrente);
				telaElevador.exibirCotacaoDolarReal();
				
				telaTablet.setCotacaoDolarReal(valorDolarCorrente);
				telaTablet.exibirCotacaoDolarReal();
				*/
				
				System.out.println("---------------------------------------");
				
		    	//System.out.println("Cotação em " + new Date() + ": " + valorDolarCorrente);  
		          
		    };  
		};  
		t.schedule(tt, new Date(),2000); ;  
		
		
		
	}

}
