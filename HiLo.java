import java.util.Random;
import java.util.Scanner;

public class PP_5_4 {

	public static void main(String[] args) 
	{
		//Create a Hi-Lo game
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int number = 0, guess = 0, count;
		char more = '?';
		
		do
		{
			// Obtain a number between [0 - 99] then add 1 to increase to [1 - 100].
			number = rand.nextInt(100) + 1;
			guess = 0;
			count = 0;
			
			while ( guess != number)
			{
				System.out.print("Enter your guess (1-100) or 0 to quit: ");
				guess = scan.nextInt();
				count++; //count = count + 1;
				
				if ( guess == 0 )
				{
					break;  // exits game
				}
				else if( guess > number)
				{
					System.out.println("\nToo High");
				}
				else if ( guess < number )
				{
					System.out.println("\nToo Low");
				}
				else
				{
					System.out.println("\nCorrect");
					System.out.println("It took you this many guesses: " + count);
				}
			}
			
			System.out.print("\n Play again (y/n)? ");
			more = scan.next().charAt(0);
		} 
		
		while( more == 'y' || more == 'Y' );
		
		System.out.println("\nGoodbye");
		scan.close();
	}

}
