package org.testing.utilities;

import java.util.regex.Pattern;

public class Newvariablereplace {

	public static String newreplace(String body , String variablename , String value)
	{
		
		body = body.replaceAll(Pattern.quote("{{"+variablename+"}}"), value);
		return body;
		
	}
}
