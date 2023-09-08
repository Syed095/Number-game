import java.util.*;

public class NumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        int play=1;
        while (play==1) {
     
        double x = Math.random() * 100;
        int y = (int) x;
        
        System.out.print("Guess a number from 0 to 100: ");

        int n = sc.nextInt();
        
       int count=1;
       
       do{
        if (n==y) {
            System.out.println("You guessed correct");
            break;
            
        } else if (n>y) {
            System.out.println("You guessed high");
            
        } else {
             System.out.println("You guessed low");

            
        }
         n = sc.nextInt();
        count++;

       }
       while(n!=y||count>10);
        System.out.println("You won in "+count+" attempts");
        System.out.print("Press 1 for playing again: \nAny other number key for exit: ");
        play=sc.nextInt();
        } 
            System.out.println("Thank you for playing.");
            
        
        
        }

    }

