package com.concord.convert;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ConvertHTML implements ConvertFile {

	public String convert(String inputPath) throws IOException 
	{
		int nos;
		POIFSFileSystem fileSystem = new POIFSFileSystem(new FileInputStream(inputPath));
		HSSFWorkbook workbook = new HSSFWorkbook(fileSystem);
		nos= workbook.getNumberOfSheets();
		nos = workbook.getNumberOfSheets();
		workbook.close();
		return outputPath;
	}
	public void display (String outputPath)
	{
		
		
	}

}