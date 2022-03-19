package simplilearnFinalProject;

import java.util.Scanner;

public class ClientApp 
{

	public static void main(String[] args)
	{
		//Initializing scanner and Variable
		Scanner obj = new Scanner(System.in);
		int ch;
		do
		{
			// calling the methods from Locked me class of same package
			LockedMe.displayMenu();
			//Reading the input from user
			System.out.println("Enter your Choice:");
			ch=Integer.parseInt(obj.nextLine());
			//Assigning the user choice to get Method from LockedMe Class using switch
			switch(ch)
			{
			case 1:LockedMe.getAllFiles();
				 break;
			case 2:LockedMe.createFiles();
				 break;
			case 3:LockedMe.deleteFiles();
				 break;
			case 4:LockedMe.searchFiles();
				 break;
			case 5 : System.exit(0);
				 break;
			default :System.out.println("Invalid Choice");	 
			
			}
		}
		while(ch>0);
		obj.next();
		//closing the scanner object.
		obj.close();

	}

}
