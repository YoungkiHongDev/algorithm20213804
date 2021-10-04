// 5주차 과제4 문자열 재정립 (Java)
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String word = sc.nextLine();
	    String[] words = word.split("");
	    ArrayList<String> reword = new ArrayList<String>();
	    char letter;
	    int value = 0;
	    char temp;
	    
	    for(int i=0; i<words.length; i++) {
	        letter = words[i].charAt(0);
	        
	        if (Character.isLetter(letter)) {
	            reword.add(String.valueOf(letter));
	        } else {
	            value += letter - '0';
	        }
	    }
	    Collections.sort(reword);
	    for(int i=0; i<reword.size(); i++) {
	        System.out.print(reword.get(i));
	    }
	    System.out.println(value);
	}
}