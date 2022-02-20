package sort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// Initialization of variables
		int[] data= new int [5];
		int i,temp;
		//Reading Number
		Scanner sc= new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			System.out.println("please enter number \n");
			data[i]=sc.nextInt();
		}
		// Bubble Sorting
		for(i=0;i<5;i++)
		{
			temp=0;
			for(int j=i+1;j<5;j++)
					{
						if(data[j-1]>data[j])
						{
							temp=data[j-1];
							data[j-1]=data[j];
							data[j]=temp;
						}
				
					}
		}
		// Printing Sorted Array
		System.out.println("the Buble Sorted List is");
		for(i=0;i<5;i++)
		{
			System.out.println(data[i]);
		}
	}

}
