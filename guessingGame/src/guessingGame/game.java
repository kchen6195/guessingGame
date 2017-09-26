/* KELVIN CHEN
 * 9/26/17
 * GuessingGame
 */

package guessingGame;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class game {

	public static void main(String [] args)
	{
		int guess = 0;
		int answer = (int)(Math.random()*10+1);
		
		while(guess !=answer)
		{
			System.out.println("Guess the number");
			Scanner input = new Scanner(System.in);
			
			try
			{
				guess = input.nextInt();
				if(guess > answer)
				{
					System.out.println("Number is too big");
				}
				if(guess < answer)
				{
					System.out.println("Number is too small");
				}
				//System.out.println(answer);
			}
			catch(InputMismatchException e)
			{
				System.out.println("you made error "+ e);
			}
		}
		System.out.println("you won");//I really hope this changes
	}
}
