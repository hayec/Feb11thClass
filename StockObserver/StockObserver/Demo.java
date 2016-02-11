package StockObserver;

public class Demo 
{
	public static void main(String[] args) 
	{
		StockTarget stockTarget = new StockTarget();
		StockWatcher watch1 = new StockWatcher(stockTarget);
		StockWatcher watch2 = new StockWatcher(stockTarget);
		stockTarget.setIBMPrice(118.50);
		stockTarget.setApplePrice(93.43);
		stockTarget.setGooglePrice(697.38);
	}

}
