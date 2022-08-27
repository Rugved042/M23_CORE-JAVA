package com.cg.lambdaexpr;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		// lambda expression for searching the file in given path of perticular extension
		FileFilter filter = (File pathname) -> pathname.getName().endsWith(".pptx");
		File dir = new File("C:\\Users\\Rugved\\Downloads");
		File contents[] = dir.listFiles(filter);
		
		//enhance for loop
		//if any perticular extension file is open on your system then you wil get that file in two times with one file will in $ sign
		for(File i : contents)
		{
			System.out.println(i);
		}
	}

}
