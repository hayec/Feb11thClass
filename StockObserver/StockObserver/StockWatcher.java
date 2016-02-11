package StockObserver;

public class StockWatcher implements Observer 
{
	private double ibmPrice;
	private double applePrice;
	private double googlePrice;
	
	private static int observerIDTracker = 0;
	private int observerID;
	
	private Subject stockTarget;
	
	public StockWatcher(Subject stockTarget)
	{
		this.stockTarget = stockTarget;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer " + this.observerID);
		this.stockTarget.register(this);
	}
	@Override
	public void update(double ibmPrice, double applePrice, double googlePrice)
	{
		this.ibmPrice = ibmPrice;
		this.applePrice = applePrice;
		this.googlePrice = googlePrice;
		printThePrices();
	}
	public void printThePrices()
	{
		System.out.println("\nObserver " + observerID + "\nIBM : " + ibmPrice + "\nApple : " + applePrice + "\nGoogle : " + googlePrice);
	}
}

