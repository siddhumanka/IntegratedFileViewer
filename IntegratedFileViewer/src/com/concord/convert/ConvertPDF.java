package com.concord.convert;

import java.io.IOException;

public class ConvertPDF implements ConvertFile {

	public String convert(String inputPath) {
		// TODO Auto-generated method stub
		 Runtime rt = Runtime.getRuntime();
		try {
			
			 rt.exec("soffice --headless --convert-to pdf --outdir "+outputPath+" " +inputPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return outputPath;
	}
	public void display (String outputPath)
	{
		
		
	}

}