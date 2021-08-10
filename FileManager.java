//() {} <> : *
package com.lockedMe;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileManager 
{
	/**
	 * This Method will return all the file names from the folder
	 * @param folderpath
	 * @return List<String>
	 */
	public static List<String> getAllFiles(String folderpath)
	{
		//Creating File Object 
		File fl= new File(folderpath);
		
		//Getting all the files into FileArray
		File[] listOfFiles = fl.listFiles();
		
		//Declare a list to store file names
		List<String> fileNames = new ArrayList<String>();	
		
		for(File f: listOfFiles)
			fileNames.add(f.getName());
			
			//Return the Array List
			return fileNames;		
	}
	
	/**
	 * This method will create or append content into the specified file 
	 * @param FILE_HANDLING_DIRECTORY
	 * @param fileNames
	 * @param content
	 * @return boolean
	 */
	public static boolean createFiles(String FILE_HANDLING_DIRECTORY, String fileName, List<String> content)
	{
		try
		{
			File fl = new File(FILE_HANDLING_DIRECTORY, fileName);
			FileWriter fw= new FileWriter(fl);
			
			//write into the file
			for(String s:content)
			{
				fw.write(s+"\n");
			}
			fw.close();
			return true;
		}
		catch(Exception Ex)
		{
			return false;
		}
		
	}

}
