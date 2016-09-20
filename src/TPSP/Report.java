package TPSP;

import java.io.FileOutputStream;

public class Report {
	
	private String report;
	private FileOutputStream fos;
	
	public Report(String report, FileOutputStream fos){
		this.report = report;
		this.fos = fos;
	}
	
	/**
	 * write report into reportFile
	 */
	public void writeIntoReport(){
		
	}
}
