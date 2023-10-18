package javaq;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pangram {
	public static void main(String args[]) {
		String sentence;
		Scanner sc= new Scanner(System.in);
		sentence=sc.nextLine();
	    Set<Character> s = new HashSet<>();
	    for(int i=0;i<sentence.length();i++)
	        s.add(sentence.charAt(i));
	    if(s.size()==26)
	    	System.out.println("The given sentence is a pangram !");
	    else
	    	System.out.println("The given sentence is not a pangram !");
	}
}
