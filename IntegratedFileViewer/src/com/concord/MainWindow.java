package com.concord;

import java.io.File;
import java.io.IOException;

import com.concord.convert.ConvertHTML;
import com.concord.convert.ConvertPDF;
import com.concord.typecheck.TypeCheck;
public class MainWindow {
		static String inputPath;
		static String outputPath;
		static String type;
		static File input = new File(inputPath);
		
	public static void main(String[] args) throws IOException {
		
		type = TypeCheck.check(input);
		
		switch (type)
		{
		case "application/msword":
   	    case "application/vnd.openxmlformats-officedocument.wordprocessingml.document":
   	    case "application/vnd.ms-word.document.macroenabled.12":
   	    case "application/vnd.oasis.opendocument.text":
   	    case "application/vnd.ms-powerpoint":
   	    case "application/vnd.openxmlformats-officedocument.presentationml.presentation":
   	    	ConvertPDF c= new ConvertPDF();
   	    	c.Convert(inputPath,outputPath);
   	    	break;
   	    	//xls, xlsx, csv,ods
   	 case "text/csv":
     case "application/vnd.ms-excel":
	 case "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet":
		ConvertHTML h = new ConvertHTML();
		h.Convert(inputPath, outputPath);
		
		
		}
		

	}

}