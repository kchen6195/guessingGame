/* KELVIN CHEN
 * 9/26/17
 * GuessingGame
 */

package guessingGame;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class game { // Not very original name -E

	public static void main(String [] args)// kelvin
	{
		int guess = 0;
		int answer = (int)(Math.random()*10+1); // kelvin
		
		while(guess !=answer)
		{
			System.out.println("Guess the number"); // kelvin kelvin kelvin kelvin Kelvin kelvin
			Scanner input = new Scanner(System.in);
			
			try
			{
				guess = input.nextInt();
				if(guess > answer)
				{
					System.out.println("Number is too big"); // This is helpful -E
				}
				if(guess < answer)
				{
					System.out.println("Number is too small"); // Good job! -E
				}
				//System.out.println(answer);.
			}
			catch(InputMismatchException e) // Edward was here -E
			{
				System.out.println("you made error "+ e);
			}
		}
		System.out.println("you won");//I really hope this changes
	}
} // Cool code -E
