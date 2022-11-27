import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	 static void sort(char[] arr) {
		 char temp;  
	        int i = 0;
	        while (i < arr.length) {
	            int j = i + 1;
	            while (j < arr.length) {
	                if (arr[j] < arr[i]) {
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	                j += 1;
	            }
	            i += 1;
	        }
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstString;
		String secondString;
		System.out.print("Enter First String: ");
		firstString=scan.next();
		System.out.print("Enter Second String: ");
		secondString=scan.next();
		boolean isAnagram=false;
		char[] charArray1 = firstString.toCharArray();
	    char[] charArray2 = secondString.toCharArray();
	    
	    //sorting the strings array
	   sort(charArray1);
	   sort(charArray2);
	    
	    isAnagram=Arrays.equals(charArray1,charArray2);
		if(isAnagram)
			System.out.println(firstString + " is anagram of  " +secondString);
		else
			System.out.println(firstString + " is not anagram of  " +secondString);
	}

}
