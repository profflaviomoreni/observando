import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import br.com.fiap.observando.service.DolarService;
import br.com.fiap.observando.view.DolarCotacaoView;
import br.com.fiap.observando.view.TelaElevadorView;

public class RunnerObserv {

	public static void main(String[] args) {

		
		DolarService dolarService = new DolarService();
		dolarService.calcularDolarVersusReal();

		DolarCotacaoView telaCotacao = new DolarCotacaoView(dolarService.getCotacaoDolarReal());
		telaCotacao.exibirCotacaoDolarReal();
		
		TelaElevadorView telaElevador = new TelaElevadorView(dolarService.getCotacaoDolarReal());
		telaElevador.exibirCotacaoDolarReal();
		
		System.out.println("---------------------------------------");
		
		Timer t = new Timer();  
		TimerTask tt = new TimerTask() {  
		    @Override  
		    public void run() {  
		        
		    	dolarService.calcularDolarVersusReal();
				double valorDolarCorrente = dolarService.getCotacaoDolarReal();
				
				telaCotacao.setCotacaoDolarReal(valorDolarCorrente);
				telaCotacao.exibirCotacaoDolarReal();
				
				telaElevador.setCotacaoDolarReal(valorDolarCorrente);
				telaElevador.exibirCotacaoDolarReal();
				
				System.out.println("---------------------------------------");
				
		    	//System.out.println("Cotação em " + new Date() + ": " + valorDolarCorrente);  
		          
		    };  
		};  
		t.schedule(tt, new Date(),5000); ;  
		
		
		
	}

}
