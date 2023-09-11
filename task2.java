import java.util.Scanner;
import java.util.Random;


public class task2{
    public static void main(String[] args) {
        System.out.println("WELCOME TO NUMBER GUESSING GAME");
        System.out.print("Player name:- ");
        Scanner sc=new Scanner(System.in);
        String usr=sc.next();
        System.out.println("You have only 5 attempts to guess the right number\nBest of luck!\n");
        Random rn=new Random();
        int ans=rn.nextInt(100);
        int n=5;
        boolean win=false;
        while(n>0){
            System.out.println("Enter your guess number");
            int guess=sc.nextInt();
            if(guess==ans){
                System.out.println("Your guess is correct");
                System.out.println("congratulations! you win the game");
                break;
            }
            else if(guess>ans){
                System.out.println("Incorrect!");
                System.out.println("Your guess is greater than the original number");
                n--;
                System.out.println("attempts left:- "+n);
                System.out.println("");
            }
            else{
                System.out.println("Incorrect!");
                System.out.println("Your guess is smaller than the origional number");
                n--;
                System.out.println("attempts left:- "+n);
                System.out.println("");
            }
           
            
        }
        System.out.println("The origional answer is:- "+ans);
            System.out.println("Thank you!");

    }
}