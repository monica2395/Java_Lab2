package lab;

public class Number {

	public static void main(String[] args) {
		//System.out.println(args[0]);
		int num= Integer.parseInt(args[0]);
		if (num<0)
			System.out.println("Number is negative");
		else
			System.out.println("Number is postive");

	}

}
