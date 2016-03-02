package com.concord.convert;
import java.io.*;

public interface ConvertFile {
	String inputPath = "";
	String outputPath = "";
	public  String Convert (String inputPath, String outputPath) throws IOException, IOException;
	public void display(String outputPath);
}