import java.io.*;
import java.util.*;
import java.text.*;
import java.util.regex.*;

public class StringAnagram {
	
	public static int numberNeeded(String first, String second) {
		int startingLength = first.length() + second.length();
		
		for (int i = 0; i < first.length(); i ++) {
			String currentLetter = Character.toString(first.charAt(i));
			
			if (second.contains(currentLetter)) {
				first = first.replaceFirst(currentLetter, "1");
				second = second.replaceFirst(currentLetter, "1");
			}
		}
		
		first = first.replaceAll("\\D", "");
		second = second.replaceAll("\\D", "");
		int endingLength = first.length() + second.length();
		return startingLength - endingLength;
	}
	  
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
	    String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));      
    }
}
