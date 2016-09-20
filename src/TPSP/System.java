package TPSP;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;

public class System {
	
	ArrayList<Card> loadedCards;			//Cards info stored in the system
	ArrayList<Instruction> instructions;	//instructions loaded from file
	FileInputStream fis;					//input stream
	FileOutputStream fos;					//output stream
	private static ArrayList<Attraction> attractions;
	
	public System(String fileName){
		try {
			loadCardFiles(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * load cards
	 * @param fileName
	 * @throws FileNotFoundException 
	 */
	public void loadCardFiles(String fileName) throws FileNotFoundException{
		//fis = new FileInputStream(fileName);
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String current;
	}
	
	/**
	 * load instructions
	 * @param fileName
	 */
	public void loadInstructions(String fileName){
		
	}
	
	/**
	 * process instructions	
	 * @param i
	 * @return instruction splited into key word and its content
	 */
	private ArrayList<String> processInstruction(Instruction i){
		
		return null;
	}
	
	/**
	 * validate the card
	 * @param card
	 * @return whether the card is correct
	 */
	private boolean validateCard(Card card){
		
		return false;
	}
	
	/**
	 * add card into the system
	 * @param card
	 * @return -1 represents failure, otherwise success
	 */
	public int addCard(Card card){
		
		return -1;
	}
	
	//same as add
	public int deleteCard(Card card){
		
		return -1;
	}
	
	/**
	 * request function of the system
	 * @param cardID
	 * @param attractionName
	 * @param date
	 * @return 
	 */
	public int request(int cardID, String attractionName, String date){
		
		return -1;
	}
	
	/**
	 * query function of the system
	 * @param queryContent
	 */
	public void query(String queryContent){
		
	}
}
