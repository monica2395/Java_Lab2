package lab;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Person obj=new Person("Monica","Panigrahy",'F',7609968999L);
		System.out.println("Using Parametrized Constructor:");
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		System.out.println(obj.getGender());
		System.out.println(obj.getPhoneNo());
		Person obj1=new Person();
		String fname=sc.next();
		String lname=sc.next();
		char gender=sc.next().charAt(0);
		long phno=sc.nextLong();
		obj1.setFirstName(fname);
		obj1.setLastName(lname);
		obj1.setGender(gender);
		obj1.setPhoneNo(phno);
		System.out.println("Using Default Constructor:");
		System.out.println(obj1.getFirstName());
		System.out.println(obj1.getLastName());
		System.out.println(obj1.getGender());
		System.out.println(obj1.getPhoneNo());


	}

}
