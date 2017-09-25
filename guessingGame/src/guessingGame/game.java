package guessingGame;

import java.util.InputMismatchException;
import java.util.Scanner;


public class game {

	public static void main(String [] args)
	{
		int guess = 0;
		int answer = (int)(Math.random()*10+1);
		
		while(guess !=answer)
		{
			System.out.println("Guess the number");
			Scanner input = new Scanner(System.in);
			guess = input.nextInt();
			if(guess > answer)
			{
				System.out.println("Number is too big");
			}
			if(guess < answer)
			{
				System.out.println("Number is too small");
			}
			System.out.println(answer);
		}
		System.out.println("you won");
	}
}
