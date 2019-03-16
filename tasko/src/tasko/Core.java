package tasko;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Core {

	// TODO add method to check and sanitize incoming args
	public void checkArgs(String args) {
		// Find everything between the two quotes
		Pattern pattern = Pattern.compile("(.*?)");
		Matcher matcher = pattern.matcher(args);
		if (matcher.find()) {
			System.out.println(matcher.group(1));
		}
	}
	
	// TODO add method to instantiate and store a new task object
	
	// TODO add save to csv method
	
	// TODO add read from csv method
	
}
