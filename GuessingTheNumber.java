import java.util.Scanner;
public class GuessingTheNumber {
  
    public static void guessingNumberGame(){
    Scanner sc=new Scanner(System.in);
    int number=1+(int)(Math.random()*100);
    int k=5;
    System.out.println("A number is chosen between 1 to 100");
    System.out.println("You have" + k + " attempts to guess the correct number.");
   for(int i=0;i<k;i++){
    System.out.println("Enter your guess");
    int guess=sc.nextInt();
    if(guess==number){
        System.err.println("Congratulations! You guessed the correct number.");
        sc.close();
        return;
    }
    else if (guess < number) {
                System.out.println(
                    " The number is greater than " + guess);
            }
            else {
                System.out.println(
                    " The number is less than " + guess);
            }
        }

        // If the user runs out of attempts
        System.out.println(
            "You've exhausted all attempts. The correct number was: "
            + number);
        sc.close();
    }

    public static void main(String[] args)
    {
        guessingNumberGame();
    }
}