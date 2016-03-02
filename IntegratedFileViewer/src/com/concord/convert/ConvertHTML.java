package com.concord.convert;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ConvertHTML implements ConvertFile {

	@Override
	public String Convert(String inputPath, String outputPath) throws IOException {
		int nos;
		POIFSFileSystem fileSystem = new POIFSFileSystem(new FileInputStream(inputPath));
		HSSFWorkbook workbook = new HSSFWorkbook(fileSystem);
		nos= workbook.getNumberOfSheets();
		return outputPath;
	}

}