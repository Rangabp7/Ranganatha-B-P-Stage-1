import java.util.Scanner;

public class Program4 {
	public void multiples(int []arr)
	{
		int numbers[]= {1,2,3,4,5,6,7,8,9};
		System.out.print("{");
		for(int number:numbers)
		{
			int count=0;
			for(int ar:arr)
				if(ar%number==0)
					count++;
			System.out.print(number+":"+count+" ,");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter a numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		Program4 p=new Program4();
		p.multiples(arr);

	}
}
