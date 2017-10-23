package com.files;
import java.util.Formatter;

public class FileCreate {

	private Formatter k;
	public void openFile() {
		try {
			k = new Formatter("Indian.txt");
		}
		catch(Exception e) {
			System.out.println("You have an error in the Program.");
		}
	}
	public void writeFile() {
		k.format("%s%s%s", "25\t","MALE\t","DHANUSH\t");
	}
	public void closeFile() {
		k.close();
	}
	public static void main(String[] args) {
		FileCreate f = new FileCreate();
		f.openFile();
		f.writeFile();
		f.closeFile();
	}
}