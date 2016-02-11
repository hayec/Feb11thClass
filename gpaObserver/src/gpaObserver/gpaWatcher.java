package gpaObserver;

public class gpaWatcher implements Observer 
{
	private String name;
	private double gpa;
	private static int observerIDTracker = 0;
	private int observerID;
	private Student student;
	public gpaWatcher(Student student)
	{
		this.student = student;
		this.observerID = observerIDTracker++;
		System.out.println("New Observer + " + this.observerID);
	}
	public void update(String name, double gpa)
	{
		this.gpa = gpa;
		this.name = name;
		System.out.println(name + ", " + gpa);
	}
}
