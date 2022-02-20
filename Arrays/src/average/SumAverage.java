package average;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		// Initilasition of variables
		int[] data= new int[5];
		int i, sum=0,avg;
		Scanner sc = new Scanner(System.in);
		// Reading Numbers
		for(i=0;i<5;i++)
		{
			System.out.println("Please Enter Number");
			data[i]= sc.nextInt();
		}
		//printing sum and average.
		for(i=0;i<5;i++)
		{
			sum=sum +data[i];
		}
		System.out.println("The sum of given Numbers is "+sum);
		avg=sum/data.length;
		System.out.println("The average is "+avg);
		
		
	}

}
