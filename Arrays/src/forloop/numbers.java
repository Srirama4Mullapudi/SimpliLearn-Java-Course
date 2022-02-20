package forloop;

import java.util.Scanner;

public class numbers {

	public static void main(String[] args) {
		// variable declaration
		int[] data=new int[5];
		int i;
		Scanner sc = new Scanner(System.in);
		
//reading 5 numbers using for loop
		for(i=0;i<5;i++)
		{
			System.out.println("Please Enter Number");
			data[i]=sc.nextInt();
		}
		sc.close();
// printing Numbers using for each
		for(int d:data)
		{
			System.out.println(d);
		}
	}

}
