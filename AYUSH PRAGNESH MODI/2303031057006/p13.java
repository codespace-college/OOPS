import java.util.Random;
import java.util.Scanner;
public class p13{
    public static void main(String[] args){
        //min number 
        int lowerbound=1;
        //max number
        int upperbound=100;

        //counts the number of guess 
        int no_of_guesses=0;

        //generating random number
        Random newnum=new Random();
        int actnum=newnum.nextInt(100);
        System.out.println(actnum);

        
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Number guessing game !!!");
        
        //looping until user guesses 
        while (true){
            //scanning the number 
            System.out.println("Guess a number between 1 and 100: ");
            int userguess=sc.nextInt();

            //incrementing the guess
            no_of_guesses++;

            if(userguess==actnum){
                System.out.println("Congratulations !!, You guessed the right number "+actnum);
                break;
            }
            else if(userguess<lowerbound || userguess>upperbound){
                System.out.println("enter a number between 1 to 100");
            }
            else if (userguess<actnum){
                 System.out.println("Too Low please try again");
            }
            else{
                System.out.println("Too high please try again");
            }
        }
    }
}