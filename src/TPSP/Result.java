package TPSP;

import java.io.FileOutputStream;

public class Result {
	
	private String result;
	private FileOutputStream fos;
	
	/**
	 * constructor of Result
	 * @param fos
	 */
	public Result(String result, FileOutputStream fos){
		this.result = result;
		this.fos = fos;
	}
	
	/**
	 * wirte the result into file
	 */
	public void writeIntoResult(){
		
	}
}
