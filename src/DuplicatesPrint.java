import java.util.Scanner;

public class DuplicatesPrint {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter A String With Duplicate Character: ");
		String str= scan.next();
		String newStr="";
		String duplicate="";
		for(int i=0;i<str.length();i++) {  
				int j;
	            for ( j = i+1; j < str.length(); j++)    
	            {   
	                if (str.charAt(i) == str.charAt(j))   
	                {   
	                    newStr+=str.charAt(i);  
	                }
	            }
		}
		for(int i=0;i<newStr.length();i++) {  
			int j;
            for ( j = 0; j < i; j++)    
            {   
                if (newStr.charAt(i) == newStr.charAt(j))   
                {   
                    break;   
                }
            }
            if (j == i)    
            {   
                duplicate += newStr.charAt(i) +" ";   
            }   
	}
		System.out.print("Duplicates are: "+ duplicate);

	}

}
