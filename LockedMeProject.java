//() {} <> : *
package com.lockedMe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedMeProject {
	
	static final String FILE_HANDLING_DIRECTORY = "C:\\Users\\Yoga\\eclipse-workspace\\MyPhase1Project\\LockedMeFiles";
	public static void main (String[] args)
	{
		//code for deleting a file by reading file name from user
		String fileName;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter file name to be deleted: ");
		fileName= obj.nextLine();
		boolean isDeleted = FileManager.deleteFile(FILE_HANDLING_DIRECTORY, fileName);
				if(isDeleted)
					System.out.println("File deleted successfully");
				else
					System.out.println("Either file not there or some access issue");
		
				
	}
	

}
