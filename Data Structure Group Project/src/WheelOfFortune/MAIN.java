package WheelOfFortune;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MAIN {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IllegalArgumentException, IOException, InterruptedException{
		Scanner Option = new Scanner(System.in);
		GameManager game = new GameManager();
		boolean exitGame = false;
		
		game.Setup();/** load the Puzzles and files for the wheel only once / until game reset **/
		while(!exitGame) {
			int Choice = 0;	
			game.LoadContestant();/** Load the Contestant  for each new game **/
			
			while(game.getRoundNumber() < 3)/*  let game play for three rounds */
				game.round();
			
			game.gameData();/** get info on the rounds (win loose etc) **/	
			do{
				game.ExitMenu();
				try {
					Choice =  Integer.valueOf(Option.nextLine());
				}catch(NumberFormatException e) {
					
				}
				switch (Choice){
			    	case 1: /* remain in the main loop and restart/ start a new game */
			    		break;
			    	case 2: 
			    		exitGame = true;
			    		game.getWheel().destroy();/* destroy the wheel linked list and free up memory if user choose th exit game*/
			    		game.getPuzzleList().destroy();/*destroy the puzzle linked list and free up memory if user choose th exit game*/
			    		break;
			    	default: 
			    		System.err.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nINVALID OPTION!!!");
			    		Choice = 0;/* set choice to zero if a non integer value was inputed to crash program */
				}
			}while(Choice == 0);
		}
		game.credits();/* display group members details */
	}
}