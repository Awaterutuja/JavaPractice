import java.util.Scanner;

public class RmDuplicates {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter A String: ");
		String str= scan.next();
		String newStr=""; 
		for(int i=0;i<str.length();i++) {  
				int j;
	            for ( j = 0; j < i; j++)    
	            {   
	                if (str.charAt(i) == str.charAt(j))   
	                {   
	                    break;   
	                }
	            }
	            if (j == i)    
	            {   
	                newStr += str.charAt(i);   
	            }   
		}
		System.out.print("String After Removed Duplicates: "+newStr+"\n");

	}

}
