import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		String number,reverseNumber="";
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Number: ");
		number= scan.next();
		for(int i=number.length()-1;i>=0;i--) 
			reverseNumber+=number.charAt(i);
		if(reverseNumber.equals(number))
			System.out.println(reverseNumber+ "  is palindrome of  " +reverseNumber);
		else
			System.out.println(reverseNumber+ "  is  Not palindrome of  " +reverseNumber);

	}

}
