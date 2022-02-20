package biggest;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
		// Initialization Variables
		int[] data=new int[5];
		int i,temp;
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<5;i++)
		{
			System.out.println("Please Enter Number");
			data[i]=sc.nextInt();
			
		}
		temp = data[0];
		for(i=1;i<5;i++)
		{
			if(temp < data[i])
			{
				temp = data[i];
				
			}
		}
		System.out.println("the biggest number is"+temp);
		
		

	}

}
