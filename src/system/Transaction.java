package system;
import java.util.*;

public class Transaction {
	private String business;
	private double cost;
	private Calendar date;
	private category spendingType;
	
	public Transaction(String b, double c, Calendar d, category t){
		business = b;
		c = cost;
		date = d;
		spendingType = t;
		System.out.println("Created Transaction");
	}
	
	public String getBusiness(){	return business;	}
	
	public double getCost(){	return cost;	}
	
	public Calendar getDate(){	return date;	}
	
	public category getSpendingType(){	return spendingType;	}
}
