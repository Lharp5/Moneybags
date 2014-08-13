package run;

import system.MoneybagsController;
import window.HeadlessUI;


public class MoneybagsApp {
	MoneybagsController mbController;
	HeadlessUI			ui;
	
	public MoneybagsApp(){
		init();
		ui = new HeadlessUI();
	}
	
	public void init(){
		System.out.println("Init MoneybagsApp");
		
		//Load the Data handler, see if theres an existing one.
	}
	
	public void shutdown(){
		System.out.println("Shutdown MoneybagsApp");
	}
	
	public void run(){
		int choice = -1;
		System.out.println("Running MoneybagsApp");
		
		while(choice !=0){
			choice = ui.mainMenu();
		}
	}
	

}
