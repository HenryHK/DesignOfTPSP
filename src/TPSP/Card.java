package TPSP;

public class Card {
	private String ID;
	private String name;
	private String birthday;
	private int height;
	private String address;
	private String attractions;
	
	/**
	 * constructor
	 * @param ID
	 * @param name
	 * @param birthday
	 */
	public Card(String ID, String name, String birthday){
		this.ID = ID;
		this.name = name;
		this.birthday = birthday;
	}
	
	
	/**
	 * get fields function group
	 * @return
	 */
	
	public String getID(){
		return this.ID;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getBirthday(){
		return this.birthday;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public String getAttractions(){
		return this.attractions;
	}
}
