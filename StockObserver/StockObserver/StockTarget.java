package StockObserver;
import java.util.ArrayList;
public class StockTarget implements Subject 
{
	private ArrayList<Observer> observers;
	private double ibmPrice;//Store Price Data for IBM
	private double applePrice;//Store Price Data for Apple
	private double googlePrice;//Store Price Data for Google
	public StockTarget()
	{
		observers = new ArrayList<>();	
	}
	@Override
	public void register(Observer o) 
	{
		observers.add(0, o);//I Believe that the error is here
	}
	@Override
	public void unregister(Observer o) 
	{
		int observerIndex = observers.indexOf(o);
		System.out.println("Observer " + (observerIndex + 1) + " Deleted!");
		observers.remove(observerIndex);
	}
	@Override
	public void notifyObserver() 
	{
		for(Observer observer : observers)
			observer.update(ibmPrice, applePrice, googlePrice);
	}
	@Override
	public void notiftyObserver(Observer o) 
	{
		o.update(ibmPrice, applePrice, googlePrice);
	}
	public void setGooglePrice(double googlePrice)
	{
		this.googlePrice = googlePrice;
		notifyObserver();
	}
	public void setApplePrice(double applePrice)
	{
		this.applePrice = applePrice;
		notifyObserver();
	}
	public void setIBMPrice(double ibmPrice)
	{
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}
	
	
	
	
}
