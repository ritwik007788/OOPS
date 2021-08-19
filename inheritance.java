package prac;

import java.util.*;

public class roughwork {

	
	public static void main(String[] args) {
		
		ECE ram = new ECE(62);
		CSE sham = new CSE(29);
		
		ram.printRegNo();
		ram.study();
		
		sham.printRegNo();
		sham.study();
		
	}
}

class College{
	int regNo;
	
	College(int x ){
		this.regNo = x;
	}
	void printRegNo() {
		System.out.println(regNo);
	}
	
	void study() {
		System.out.println("Student is studying.");
	}
	
}

class ECE extends College{
	
	ECE(int x) {
		super(x);
	}

	void study() {
		System.out.println("Student is making circuits");
	}
}

class CSE extends College{
	CSE(int x) {
		super(x);
	}

	void study() {
		System.out.println("Student is coding.");
	}
}
