package lab;

import java.util.Scanner;

public class PersonDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fname=sc.next();
		String lname=sc.next();
		char gender=sc.next().charAt(0);
		int age=sc.nextInt();
		float weight=sc.nextFloat();
		System.out.println("Person Details:");
		System.out.println("_______________");
		System.out.println("");
		System.out.println("First Name: "+fname);
		System.out.println("Last Name: "+lname);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Weight:"+String.format("%.2f",weight));
		

	}

}
