import java.util.*;
class Guesser{
	int guessedNumber;
	int guessNum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Guesser Please Guess The Number Between 1 To 50:");
		guessedNumber= scan.nextInt();
		return guessedNumber;
	}
}
class Player{
	int playerGuessedNum;
	int[] guessNum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter How Many Player Want to Play from 1 to 5:");
		int totalPlayers= scan.nextInt();
		int[] playerGuessedNumbers = new int[totalPlayers];
		for(int i=0;i<totalPlayers;i++) {
			System.out.print("Player Please Guess The Number :");
			playerGuessedNumbers[i]= scan.nextInt();
		}
		return playerGuessedNumbers;
	}
}
class Umpire{
	int guesserNum;
	int [] playersNumber= new int[5];
	int[]target= new int[5];
	void collectGuesserNumber() {
		Guesser guesser= new Guesser();
		guesserNum=guesser.guessNum();
		if(guesserNum>50) {
			System.out.println("Number Is Out Of Range,Guess Again");
			guesserNum=guesser.guessNum();
		}
			
	}
	void collectPlayerNumber() {
		Player player = new Player();
		for(int i=0;i<5;i++) {
			playersNumber=player.guessNum();
			break;
		}
	}
	void match() {				
		for(int i=0;i<playersNumber.length;i++) {
			if(playersNumber[i]==guesserNum && i<=playersNumber.length) {
				for(int j=1;i<playersNumber.length;j++) {
					if(playersNumber[i]==playersNumber[j]) { 
						System.out.println("Players" +  ++i  + "And" +  ++i  +"Won");
						break;
					}
					else {
						System.out.println("Player " +  ++i + "Won");
					break;
					}
				}
			}
			else{
				if(i==playersNumber.length-1 ) {
				System.out.println("All Lost ,Try Again");
				break;
				}
			}
		}
	}
}
public class GuessGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String permission="yes";
		Umpire umpire=new Umpire();
		Object permit;
		do {
			umpire.collectGuesserNumber();
			umpire.collectPlayerNumber();
			umpire.match();
			System.out.print("Do You Want To Play Again:  ");
			permit= scan.next();
		}while(permission.equals(permit));
		System.out.println("Exit");
	}
}
