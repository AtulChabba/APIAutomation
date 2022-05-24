package org.testing.utilities;

import java.util.regex.Pattern;

public class Variablereplacement {

	public static String replaceValue(String body ,String Variablename , String Variablevalue)
	{
		body = body.replaceAll(Pattern.quote("{{"+Variablename+"}}"), Variablevalue);
		return body;
	}
}
