package com.concord.typecheck;

import java.io.File;
import java.io.IOException;
import org.apache.tika.Tika;

//import type.String;
public class TypeCheck {
	public static String check(File input) throws IOException{
	
		Tika tika = new Tika();	      
	      //detecting the file type using detect method
	      return tika.detect(input);
}
}