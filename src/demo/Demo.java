package demo;

import java.util.Scanner;

public class Demo {
	
	public static void display(int array [ ]) {
		
		for(int e:array) {
			System.out.println(e);
		}
	}
	
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	B b1=new B();
	
	System.out.println("Enter the length of the array");
	
	int size = sc.nextInt();
	
	int array [] = new int [size]; 
	for(int i=0 ; i<array.length;i++) {
		
		System.out.println("Enter the value for"+(i+1));
		int num = sc.nextInt();
		array[i]=num;
	}
	
	display(array);
}
}	
	
class B {
	
int x=10;



}

