
/**
 * Write a description of class GuessingGame2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
   import java.util.Random;
    import java.util.Scanner;
    
    public class project 
    {
    public static void main (String [] args)
    {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(11);
        int numberofTries = 0;
        int guess;
        int previousInput = 0;
        boolean win = false;
        Scanner input = new Scanner(System.in);
        
           
        
        while (!win)
        {
            System.out.println("Guess a number between 1 and 10: ");
            guess = input.nextInt();
            //numberofTries++;
            
           
            if (guess == numberToGuess)
            {
                win = true;
            }
            else if (guess < numberToGuess)
            {
                System.out.println("Your guess is too small ");
            }
            else if (guess > numberToGuess)
            {
                System.out.println("Your guess is too large ");
            }
           if (previousInput !=guess)
            {
                
                numberofTries++;
            }
            previousInput = guess;
            System.out.println(numberofTries);
            
            
        }
           
        System.out.println("You win");
        System.out.println("The number was " + numberToGuess);
        System.out.println("It took you " + numberofTries + " tries ");
            
        
        
    }
}