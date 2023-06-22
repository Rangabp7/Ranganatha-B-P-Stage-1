import java.util.Scanner;

public class Program1 {
	public void calci(double a,double b,String typeOfOperation )
	{
		System.out.println();
		if(typeOfOperation.equalsIgnoreCase("add"))
			System.out.println("Addition result is: "+(a+b));
		else if(typeOfOperation.equalsIgnoreCase("sub"))
			System.out.println("Subtraction result is: "+(a-b));
		else if(typeOfOperation.equalsIgnoreCase("mul"))
			System.out.println("Multiplication  result is: "+(a*b));
		else if(typeOfOperation.equalsIgnoreCase("div"))
			System.out.println("Division result is: "+(a/b));
		else
			System.out.println("invalid opertaion");
	}
	public static void main(String[] args) {

		//Taking input from the user
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a first number");
		double a=scan.nextDouble();
		System.out.println("Enter a second number");
		double b=scan.nextDouble();

		//calculator operations
		System.out.println("Enter a type of opertaion");
		String typeOfOperation=scan.next();
		scan.close();
		Program1 p=new Program1();
		p.calci(a, b, typeOfOperation);
	}
}
