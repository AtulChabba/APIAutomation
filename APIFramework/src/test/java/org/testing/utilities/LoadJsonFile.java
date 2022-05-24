package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class LoadJsonFile {

	public static String JsonData(String Filepath) throws FileNotFoundException
	{
		File f = new File(Filepath);
		FileReader fr = new FileReader(f);
		JSONTokener jr = new JSONTokener(fr);
		JSONObject jb = new JSONObject(jr);
		return jb.toString();
		
	}
	
}
