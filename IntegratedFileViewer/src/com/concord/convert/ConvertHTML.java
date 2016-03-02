package com.concord.convert;

import java.io.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
ache.poi.poifs.filesystem.POIFSFileSystem;import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ConvertHTML implements ConvertFile {

	@Override
	public String Convert(String inputPath, String outputPath) throws IOException 
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