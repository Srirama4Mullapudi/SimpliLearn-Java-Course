package simplilearnFinalProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe {
	//Getting the folder path where wee need to do operations on files
	static final String projectFilePath ="D:\\MyFinalProject\\Projectfiles";
	/**
	 * This Method Will Display Menu For End Users
	 */
	public static void displayMenu()
	{
		System.out.println("****************************************************");
		System.out.println("\twelcome to LockedMe secure app");
		System.out.println("\tDevoloped by Srirama Chandra Murthy.M");
		System.out.println("****************************************************");
		System.out.println("\t1.Display all files");
		System.out.println("\t2.Add a file");
		System.out.println("\t3.Delete a file");
		System.out.println("\t4.Search file");
		System.out.println("\t5.Exit");
		System.out.println("****************************************************");
	}
	/**
	 * This Method Will Display all Files
	 */
	public static void getAllFiles()
	{
		//Initializing File list
		File folder = new File(projectFilePath); 
		File[] listOfFiles = folder.listFiles();
		// Fetching the file from folder
		if(listOfFiles.length>0)
		{
			System.out.println("The Files are listed below:\n");
			for(var l:listOfFiles)
			
			{
			System.out.println(l.getName());
			}
		}
		else
		{
			System.out.println("Folder is Empty");
		}
	}
	/**
	 * This Meathod Will Create New Files In a Folder
	 */
	public static void createFiles()
	{
		try
		{
		Scanner obj = new Scanner(System.in);
		String fileName;
		System.out.println("Enter File name:");
		fileName = obj.nextLine();
		
		int linesCount;
		System.out.println("Enter how many Lines:");
		linesCount = Integer.parseInt(obj.nextLine());
		//inserting user input in to files
			FileWriter fw = new FileWriter(projectFilePath+"\\"+fileName+".txt");
			for(int i=1;i<=linesCount;i++)
			{
				System.out.println("Enter file Line:");
				fw.write(obj.nextLine()+"\n");
			}
			System.out.println("File Created Succesfully");
			fw.close();
		} 
		catch (IOException e) 
		{
			
		}
	}
	/**
	 * This Method Delete a File In The Folder
	 */
	public static void deleteFiles()
	{
		try
		{
		Scanner obj = new Scanner(System.in);
		String fileName;
		System.out.println("Enter File name:");
		fileName = obj.nextLine();
		File f = new File(projectFilePath+"\\"+fileName+".txt");
		//deleting the files
		if(f.exists())
		{
			f.delete();
			System.out.println("File Succesfully Deleted");
		}
		else
		{
			System.out.println("File Doesnot Exist");
		}
		}
		catch (Exception e) {
			System.out.println("unable to Delete file.Please contact Adminstrator");
		}
	}
	/**
	 * This Method will search Is the File Exist or Not
	 */
	public static void searchFiles()
	{
		try 
		{
			Scanner obj = new Scanner(System.in);
			String fileName;
			System.out.println("Enter File Name to be searched with extension .txt:");
			fileName = obj.nextLine();
		// Initilisting array list	
		ArrayList<String> allFileNames = new ArrayList<String>();
		File folder = new File(projectFilePath); 
		File[] listOfFiles = folder.listFiles();
		//Adding files to List
		if(listOfFiles.length>0)
		{
			for(var l:listOfFiles)
			{
				allFileNames.add(l.getName());
			}
		}
		//Searching for file
		File f = new File(projectFilePath+"\\"+fileName);
		if(allFileNames.contains(fileName))
		{
			System.out.println("File is Available");
		}
		else
		{
			System.out.println("File is not available");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	}
	