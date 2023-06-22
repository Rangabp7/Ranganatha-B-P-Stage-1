import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=scan.nextInt();
		scan.close();
		if(num%2==0)
			num=num-1;
		int count=1;
		int i=1;
		while(count<=num)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
				count++;
			}
			i++;
		}
	}
}
