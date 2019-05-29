package usjt_ccp3mca_observer;

public class CurrentCondicionsDisplay extends Display {
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void update(double temperatura, double humidity, double pressure) {
		System.out.println("--------- Condições Atuais ----------");
		System.out.printf("Temp: %.0f, Hm: %.0f%%, Pres: %.2f\n", temperatura, humidity, pressure);
		
	}

}
