package window;

import java.io.*;

public class HeadlessUI {
	private BufferedReader in;
	public HeadlessUI(){
		in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Headless UI Created");
	}
	
	public int mainMenu()
	{
		int choice = -1;
		String input = "";
		System.out.println(":::::::::::::::::::::::::::::::::");
		System.out.println("==== Moneybags Main Menu ====");
		System.out.println("---- Please Select an Option From The List ");
		System.out.println("1. Add A Transaction");
		System.out.println("2. View Transaction List");
		System.out.println("..........................");
		System.out.println("0. Exit MoneyBags ");
		try{
			input = in.readLine();
		}
		catch(IOException e){
			System.out.println("ERROR: "+e);
		}
		
		choice = Integer.parseInt(input);
		return choice;
	}
}
