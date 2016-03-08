package com.concord;

import java.io.File;
import java.io.IOException;

import java.io.FileOutputStream;

import java.io.InputStream;
import java.io.OutputStream;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;
import com.concord.convert.ConvertHTML;
import com.concord.convert.ConvertNone;
import com.concord.convert.ConvertPDF;
import com.concord.typecheck.TypeCheck;
public class MainWindow
{
		public static void error()
		{
			//error handling code
		}
		public String call(File inputFile) throws IOException
		{
			String inputPath=inputFile.getAbsolutePath();
			String outputPath;
			String type;
			type = TypeCheck.check(inputFile);
			
			switch (type)
			{
			case "application/msword":  //doc
	   	    case "application/vnd.openxmlformats-officedocument.wordprocessingml.document": //docx
	   	    case "application/vnd.ms-word.document.macroenabled.12": //docm
	   	    case "application/vnd.oasis.opendocument.text": //odt
	   	    case "application/vnd.ms-powerpoint":   //ppt
	   	    case "application/vnd.openxmlformats-officedocument.presentationml.presentation":  //pptx
	   	    	ConvertPDF c= new ConvertPDF();
	   	    	outputPath=c.convert(inputPath);
	   	    	break;
	   	    	//xls, xlsx, csv,ods
	   	    case "text/csv": //csv
	   	    case "application/vnd.ms-excel": //xls
	   	    case "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet": //xlsx
	   	    case "application/vnd.oasis.opendocument.spreadsheet": //ods
	   	    	ConvertHTML h = new ConvertHTML();
	   	    	outputPath=h.convert(inputPath);
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
			 outputPath=n.convert(inputPath);
			 break;
			
	   	    default: 
	   	    	error();
			}
			return outputPath;
		
		}
}