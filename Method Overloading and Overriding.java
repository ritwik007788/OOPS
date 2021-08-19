package prac;

import java.util.*;

public class roughwork {

	
	static ArrayList<String> list;
	public static void main(String[] args) {
		
		Shape sq = new Shape();
		Shape rect = new Shape();
		Shape circle = new Shape();
		
		sq.area(4);
		rect.area(2, 4);
		circle.area(1.2);
		
		Triangle t = new Triangle();
		t.area(2, 1);
	}
}

class Shape{
	
	void area(int a ) {//method overloading
		System.out.println(a*a);
	}
	
	void area(int l , int b) { //method overloading
		System.out.println(l*b);
	}
	
	void area(double radius) { //method overloading
		System.out.println(3.14*radius*radius);
	}
}

class Triangle extends Shape{
	void area(int base , int height) {//Method overriding
		System.out.println(0.5*base*height);
	}
}
