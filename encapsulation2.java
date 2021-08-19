package prac;

import java.util.*;

public class roughwork {

	
	static ArrayList<String> list;
	public static void main(String[] args) {
		Laptop lp = new Laptop();
		
		lp.setPrice(20000);//data hiding
		System.out.println(lp.getPrice()); //data hiding
		
		lp.costHardware = 10000;
		lp.costSoftware = 5000;
		
		lp.getCostPrice();//data binding
	}
	

}
class Laptop{
	
	private int price;
	int costHardware;
	int costSoftware;
	
	void getCostPrice() {
		System.out.println(costHardware + costSoftware);
	}
	
	void setPrice(int x) {
		this.price = x;
	}
	
	int getPrice() {
		return price;
	}
	
}
