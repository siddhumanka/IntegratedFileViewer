package com.concord.convert;

import java.io.IOException;
import java.io.*;

//rucha made a change
public interface ConvertFile {
	String inputPath = "";
	String outputPath = "";
	public  String convert (String inputPath) throws IOException;
	public void display(String outputPath);
}