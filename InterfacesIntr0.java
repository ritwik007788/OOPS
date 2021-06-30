package interfaces;

public class InterfacesIntr0 {

	public static void main(String[] args) {
		Transformer t1 = new Transformer();
		t1.walk();
		t1.start();

	}

}

// Methods are public and abstract by default in Interfaces.

interface car{
	void start();
}

interface Person{
	void walk();
}

class Transformer implements car,Person{ // multiple interfaces can be parent BUT MULTIPLE CLASSES CANNOT BE INHERITED

	// child of interface must define the abstract methods in interface
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Tansformer is walking !");
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Transformer turned into car !");
		
	}
	
}
