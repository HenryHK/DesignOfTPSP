package TPSP;

public class Attraction {
	
	private String name;
	private int age;
	private boolean biggerOrSmaller;
	private int height;
	
	public Attraction(String name, int age, boolean biggerOrSmaller, int height){
		this.name = name;
		this.age = age;
		this.biggerOrSmaller = biggerOrSmaller;
		this.height = height;
	}
	
	public boolean isAllowed(int age, int height){
		return false;
		//return (age>=age)&&)()
	}
	
}
