import java.util.Random;
import java.util.Scanner;

public class Numbergame
{
	public static void main(String args[])
    {
	Scanner s1 = new Scanner(System.in);
	boolean playagain = true;
	while(playagain)
	{
            System.out.println("Guess a random number between 1 to 100");

            System.out.println("\nHow many rounds would like to play?");
	    int times=s1.nextInt();

            System.out.println("Maximum number of attempts per round: ");
            int maximumattempts = s1.nextInt();

            int score = 0;

            for (int i=1; i<=times; i++)
            {
                System.out.println("\nRound " + i);
                int randomnumber = choosenNumber(1,100);
                
                int attempts = 0;
                while(attempts < maximumattempts) {
                    System.out.println("Enter your guess: ");
            
                int playerguess = s1.nextInt();
                    attempts++;
                    if (playerguess == randomnumber)
                    {   
                    System.out.println("Correct!");
                    score++;
                    break;
                    }
                    else if(playerguess > randomnumber)
                    {
                     System.out.println("Too High");
                    }
                     else 
                    {
                     System.out.println("Too Low");
                    }

                    System.out.println("Attempts remaining: " +(maximumattempts-attempts));
                }
                if(attempts == maximumattempts && randomnumber != s1.nextInt()) 
                {
                    System.out.println("You have used all "+maximumattempts+ " attempts. The correct number was " +randomnumber+ ".");
                }
            }
            System.out.println("\nGame Over! Your score is "+score+ " out of "+times);

            System.out.println("Do you want to play again? (Yes (or) No): ");
            String interest = s1.next();
            playagain = interest.equalsIgnoreCase("yes");
        }
        s1.close();
    }
        public static int choosenNumber(int start, int end)
        {
            Random r1 = new Random();
            return r1.nextInt(end - start + 1) + start;
        }
   }

