package run;

import system.MoneybagsController;

public class MoneybagsApp {
	MoneybagsController mbController;
	
	public MoneybagsApp(){
		init();
	}
	
	public void init(){
		System.out.println("Init MoneybagsApp");
	}
	
	public void shutdown(){
		System.out.println("Shutdown MoneybagsApp");
	}
	
	public void run(){
		System.out.println("Running MoneybagsApp");
	}
	

}
