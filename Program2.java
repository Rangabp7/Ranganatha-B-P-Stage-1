import java.util.Scanner;

public class Program2 {
	public void oddSeries(int numOfTerms)
	{
		System.out.println("Odd number series");
		for (int i = 1; i <=numOfTerms; i++) {
			System.out.print((2*i-1)+" ");
		}	
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of terms to be generated");
		int numOfTerms=scan.nextInt();
		scan.close();
		Program2 p=new Program2();
		p.oddSeries(numOfTerms);
		
	}
}
