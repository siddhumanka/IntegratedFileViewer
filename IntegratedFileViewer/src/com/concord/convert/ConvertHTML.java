package com.concord.convert;

import org.apache.poi.hssf.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ConvertHTML implements ConvertFile {

	@Override
	public String Convert(String inputPath, String outputPath) {
		int nos;
		POIFSFileSystem fileSystem = new POIFSFileSystem(new FileInputStream(inputPath));
		HSSFWorkbook workbook = new HSSFWorkbook(fileSystem);
		nos= HSSFWorkbook.getNumberOfSheets();
		return outputPath;
	}

}