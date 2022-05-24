package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


//here we will write the logic for reading the properties file
//It will return the object of properties class
public class LoadFile {
 
	public static Properties Loadproperties(String pathname) throws IOException
	{
		File f = new File(pathname);
		FileReader fr = new FileReader(f);
		Properties pr1 = new Properties();
		pr1.load(fr);
		return pr1;
		
	}

}
