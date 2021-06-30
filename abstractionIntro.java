package abstraction;

public class abstractionIntro {
	public static void main(String args[]) {
		Audi a1 = new Audi();
		a1.price = 2000000;
		a1.getPrice();
		
		BMW b1 = new BMW();
		b1.price = 2500000;
		b1.getPrice();
	}
}

abstract class car{
	int price;
	abstract void getPrice();
}

class Audi extends car{

	@Override
	void getPrice() {
		System.out.println("The price of your Audi is : "+price);
		
	}
	
}

class BMW extends car{

	@Override
	void getPrice() {
		System.out.println("The price of your BMW is : "+price);
		
	}
	
}