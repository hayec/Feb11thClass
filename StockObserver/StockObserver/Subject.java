package StockObserver;
public interface Subject 
{
	public default void register(Observer o)//Add observer to array list
	{
		
	}
	public default void unregister(Observer o)//Remove observer from the array list
	{
		
	}
	public default void notifyObserver()//Notify all observers
	{
		System.out.println();
	}
	public default void notiftyObserver(Observer o)//Notify particular observer
	{
		
	}
}
