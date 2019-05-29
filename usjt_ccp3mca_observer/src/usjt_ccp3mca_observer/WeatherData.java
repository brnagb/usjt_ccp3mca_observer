package usjt_ccp3mca_observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject{
	
	private List <Observer> observers;
	
	public WeatherData() {
		observers = new LinkedList<>();
	}
	
	private double temperatura;
	private double pressure;
	private double humidity;
	
	public double getTemperatura() {
		return temperatura;
	}
	
	public double getPressure() {
		return pressure;
	}
	
	public double getHumidity() {
		return humidity;
	}
	
	public void measurementsChanged() {
		notifyObserver();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);		
	}

	@Override
	public void notifyObserver() {
		for(Observer o : observers)
			o.update(temperatura, humidity, pressure);
		
	}
	public void iniciar() {
		Random gerador = new Random ();
		while(true) {
				temperatura = 30 + gerador.nextDouble() * 5;
				humidity = gerador.nextDouble() * 55;
				pressure = gerador.nextDouble() * 400;
				measurementsChanged ();
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	
}
