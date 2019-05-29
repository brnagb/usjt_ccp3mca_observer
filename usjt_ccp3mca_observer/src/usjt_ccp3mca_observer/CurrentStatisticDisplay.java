package usjt_ccp3mca_observer;

public class CurrentStatisticDisplay extends Display {
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
	private int qtde = 0;
	private double totalHistorico = 0;
	
	
	@Override
	public void update(double temperatura, double humidity, double pressure) {
		qtde++;
		totalHistorico += temperatura;
		System.out.println("------ Dados Estatísticos ------");
		System.out.printf("Média: %2.f\n", totalHistorico / qtde);
		
		
	}

}
