package com.concord.convert;

import java.io.IOException;

//rucha made a change
public interface ConvertFile {
	String inputPath = "";
	String outputPath = "";
	public  String Convert (String inputPath, String outputPath) throws IOException;
	
}