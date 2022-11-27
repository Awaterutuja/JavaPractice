import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter A String: ");
		String str= scan.next();
		boolean[] isItThere = new boolean[Character.MAX_VALUE];
	    for (int i = 0; i < str.length(); i++) {
	        isItThere[str.charAt(i)] = true;
	    }
	    int count=0;
	    for (int i = 0; i < isItThere.length; i++) {
	        if (isItThere[i] == true){
	            count++;
	        }
	    }
		System.out.print("Unique Charcters Are in String : "+count);


	}

}
