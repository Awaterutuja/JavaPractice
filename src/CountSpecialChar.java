import java.util.Scanner;

public class CountSpecialChar {

	public static void main(String[] args) {
		int vowels = 0; 
		int consonants=0;
		int special=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A String: ");
		String str= scan.next();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
				vowels+=1;
			else if(str.charAt(i)=='@' || str.charAt(i)=='#' ||  str.charAt(i)=='%' || str.charAt(i)=='&' || str.charAt(i)=='*')
				special++;
			else
				consonants++;
		}
		System.out.print("Vowels are : " + vowels + "\n");
		System.out.print("Consonants are : " + consonants + "\n");
		System.out.print("Special Symbols are : " + special + "\n");
	}

}
