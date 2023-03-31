package gr.upatras.first;

//Demo Java program
//Importing classes from packages
import java.io.*;

//Main class
public class GFG {
	private String name;
	//Main driver method
	public static void main(String[] args) {
		GFG myObject = new GFG(); 
		myObject.setName("test");
		//Print statement
		System.out.println(myObject.getName() + " Welcome to GeeksforGeeks");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}