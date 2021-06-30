package encapsulation;

public class EncapsulationIntro {
	public static void main(String args[]) {
		Laptop l1 = new Laptop();
		
//		l1.price = 31 ; // any random person can't set the price due to security of encapsulation.
		
		l1.setPrice(31);// using setter to set price
		System.out.println(l1.getPrice());// using getter to get price
	}
}

class Laptop{
	private int ram ;
	private int price ;
	
	// make the variables private and hence authorised people can only access the ram and
	// price of the laptop via these getters and setters.Hence, data protection takes place.
	
	public void setPrice(int price) {
		// checks if user is admin
		this.price = price;
	}
	public int getRam() {
		// checks if user is admin
		return ram;
	}
	public void setRam(int ram) {
		// checks if user is admin
		this.ram = ram;
	}
	public int getPrice() {
		// checks if user is admin
		return price;
	}
	
	
	
}
