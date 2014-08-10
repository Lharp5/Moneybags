package run;

import java.io.*;

public class Launcher {

	public static void main(String[] args) throws IOException{
		System.out.println("Hello World");
		
		MoneybagsApp Moneybags = new MoneybagsApp();
		Moneybags.init();
		Moneybags.run();
		Moneybags.shutdown();
		System.out.println("Goodbye.");
	}

}
