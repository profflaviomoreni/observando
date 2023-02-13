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

		DolarCotacaoView telaCotacao = new DolarCotacaoView();
		TelaElevadorView telaElevador = new TelaElevadorView();
		TelaTabletView telaTabletView = new TelaTabletView();
		
		dolarService.addObserver(telaCotacao);
		dolarService.addObserver(telaElevador);
		dolarService.addObserver(telaTabletView);
		
		System.out.println("---------------------------------------");
		
		Timer t = new Timer();  
		TimerTask tt = new TimerTask() {  
		    @Override  
		    public void run() {  
		    	
		    	dolarService.calcularDolarVersusReal();
				System.out.println("---------------------------------------");
				
		    };  
		};  
		t.schedule(tt, new Date(),2000); ;  
		
	}

}
