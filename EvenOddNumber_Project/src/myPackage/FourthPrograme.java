
package myPackage;
import java.io.*;
import java.util.Scanner;
public class FourthPrograme {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number ");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("The Entered Number Is Even:"+ n);
		}
		else
		{
			System.out.println("The entered Number Is Odd:"+ n);
		}
		

	}

}
