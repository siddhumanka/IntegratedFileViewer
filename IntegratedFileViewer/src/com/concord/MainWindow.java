package com.concord;

import java.io.File;
import java.io.IOException;

import com.concord.convert.ConvertHTML;
import com.concord.convert.ConvertNone;
import com.concord.convert.ConvertPDF;
import com.concord.typecheck.TypeCheck;
public class MainWindow {
		static String inputPath;
		static String outputPath;
		static String type;
		static File input = new File(inputPath);
		public static void error(){
			//error handling code
		}
	public static void main(String[] args) throws IOException {
		
		type = TypeCheck.check(input);
		
		switch (type)
		{
		case "application/msword":  //doc
   	    case "application/vnd.openxmlformats-officedocument.wordprocessingml.document": //docx
   	    case "application/vnd.ms-word.document.macroenabled.12": //docm
   	    case "application/vnd.oasis.opendocument.text": //odt
   	    case "application/vnd.ms-powerpoint":   //ppt
   	    case "application/vnd.openxmlformats-officedocument.presentationml.presentation":  //pptx
   	    	ConvertPDF c= new ConvertPDF();
   	    	c.Convert(inputPath,outputPath);
   	    	break;
   	    	//xls, xlsx, csv,ods
   	 case "text/csv": //csv
     case "application/vnd.ms-excel": //xls
	 case "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet": //xlsx
	 case "application/vnd.oasis.opendocument.spreadsheet": //ods
		ConvertHTML h = new ConvertHTML();
		h.Convert(inputPath, outputPath);
		break;
	 case "application/xhtml+xml": //xhtml
	 case "text/html":  //html
	 case "application/json":  //json
	 case "text/plain":  //txt
	 case "text/css":  //css
	 case "application/xml": //xml
		 //images
	 case "image/x-ms-bmp": //bmp
	 case "image/jpeg":  //jpg
	 case "image/png": //png
		 ConvertNone n =new ConvertNone();
		 n.Convert(inputPath, outputPath);
		break;
		
	default: 
		error();
		
		
		}
		

	}

}