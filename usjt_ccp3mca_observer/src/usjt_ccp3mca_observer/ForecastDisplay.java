package usjt_ccp3mca_observer;

import java.util.Random;

public class ForecastDisplay extends Display {
	private Random gerador = new Random();
	@Override
	public void display() {
		

	}
	
	@Override
	public void update(double temperatura, double humidity, double pressure) {
		double previsao = temperatura - 2 + gerador.nextDouble() * 4;
		System.out.printf("------ Previsões -------\n");
		System.out.printf("Previsão para o próximo dia: %.2f\n", previsao);
	}

}
