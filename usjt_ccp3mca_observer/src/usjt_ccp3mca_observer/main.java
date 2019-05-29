package usjt_ccp3mca_observer;

public class main {
	public static void main(String[]args) {
		
		WeatherData estacaoMonitoramento = new WeatherData();
		CurrentCondicionsDisplay d1 = new CurrentCondicionsDisplay();
		CurrentStatisticDisplay d2 = new CurrentStatisticDisplay();
		ForecastDisplay d3 = new ForecastDisplay();
		
		estacaoMonitoramento.registerObserver(d1);
		estacaoMonitoramento.registerObserver(d2);
		estacaoMonitoramento.registerObserver(d3);
		estacaoMonitoramento.iniciar();
	}

}
