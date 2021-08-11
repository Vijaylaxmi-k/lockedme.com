//() {} <> : * +
package com.lockedMe;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedMeProject {
	
	static final String FILE_HANDLING_DIRECTORY = "C:\\Users\\Yoga\\eclipse-workspace\\MyPhase1Project\\LockedMeFiles";
	public static void main (String[] args)
	{	
		int proceed=1;
		
		do
		{
			//Variable declaration
			int ch;
			
			//Display Menu
			ch= displayMenu();
					
			switch(ch)
			{
				case 1 : getAllFiles();
					     break;
				case 2 : createFile();
					     break;
				case 3 : deleteFile();
					     break;
				case 4 : searchFile();
					     break;
				case 5 : System.exit(0);;
				   		 break;
			   default : System.out.println("Please enter Valid option");  
		   }
			//obj.close();
		}while(proceed>0);
		
	}
	
	public static int displayMenu()
	{	Scanner obj = new Scanner(System.in);
		int ch;
		System.out.println("****************************************************************************************");
		System.out.println("\t\t Company Lockers Pvt. ltd.					       |");
		System.out.println("****************************************************************************************");
		System.out.println("1. Display all files");
		System.out.println("2. Add new file");
		System.out.println("3. Delete a file");
		System.out.println("4. Search a file");
		System.out.println("5. Exit");
		System.out.println("****************************************************************************************");
		System.out.println("****************************************************************************************");
		System.out.println("Enter your choice								       |");
		System.out.println("****************************************************************************************");
		ch=Integer.parseInt(obj.nextLine());
		//obj.close();
		return ch;
	}
	
	
	/**
	 * MODULE-1 Get files from specified directory
	 */	
	
	public static void getAllFiles()
	{
		//Get file names
		List<String> fileNames = FileManager.getAllFiles(FILE_HANDLING_DIRECTORY);
				
		for(String f: fileNames)
		    System.out.println(f);
	}
	
	/**
	 * MODULE-2 Creating user specified files
	 */	
	
	public static void createFile()
	{
		//Declaring variables to read file name
		Scanner obj = new Scanner(System.in);
		String fileName;
		int linesCount;
		List<String> content = new ArrayList<String>();

		// Read file name from user
		System.out.println("Enter the File Name");
		fileName=obj.nextLine();
				
		//Read number of lines to enter the content
		System.out.println("Enter how many lines in the file");
		linesCount =Integer.parseInt(obj.nextLine());
						
		//Reading line by line from user
		for(int i=1;i<=linesCount;i++)
		{
			System.out.println("Enter Line"+i+":");
			content.add(obj.nextLine());
		}
				
		//save the content into the file
		boolean isSaved= FileManager.createFiles(FILE_HANDLING_DIRECTORY, fileName, content);
		
			if(isSaved)
				System.out.println("File and data is saved successfully");
			else
				System.out.println("Some error occured. Please contact admin@vijaylaxmi.com");
				
			//System.out.println("Enter any character to proceed-");
			//String data= obj.nextLine();
			
			// close Scanner object
			//obj.close();
			
	}
	
	/**
	 * MODULE-3 Deleting files from specified directory
	 */
	
	public static void deleteFile()
	{
		//Variable declaration asking user to enter file name that has to be deleted
		String fileName;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter file name to be deleted: ");
		fileName= obj.nextLine();
		
		//code for deleting a file by reading file name from user
		boolean isDeleted = FileManager.deleteFile(FILE_HANDLING_DIRECTORY, fileName);
			if(isDeleted)
				System.out.println("File deleted successfully");
			else
				System.out.println("Either file not there or some access issue");
	}
	
	/**
	 * MODULE-4 Search files from specified directory
	 */	

	public static void searchFile()
	{
		//Variable declaration asking user to enter file name that has to be fetched
		String fileName;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter file name to be searched: ");
		fileName= obj.nextLine();
						
		//code for searching a file by reading file name from user
		boolean isFound = FileManager.searchFile(FILE_HANDLING_DIRECTORY, fileName);
			if(isFound)
				System.out.println("File Found in specified directory");
			else
				System.out.println("File is not Found in specified directory");
	}
	
}
