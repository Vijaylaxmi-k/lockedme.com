//() {} <> : *
package com.lockedMe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedMeProject {
	
	static final String FILE_HANDLING_DIRECTORY = "C:\\Users\\Yoga\\eclipse-workspace\\MyPhase1Project\\LockedMeFiles";
	public static void main (String[] args)
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
		
		
	}
	
	

	
	
	
	

}
