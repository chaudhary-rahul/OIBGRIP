package projectss.guessgame;

import java.util.Random;
import java.util.Scanner;


public class guess {
    public static void guess_game(){
        Random ran = new Random();
        int ans = ran.nextInt(101); 
        int guess_count;
       
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println( " press 1 for limited guess \n press 2 for unlimited chances");
            int x = sc.nextInt();
     
            // switch case for above attempting conditions
        switch(x){
            // case 1 for limited chances
            case 1:
                guess_count=0;
                System.out.println("you got 10 chnaces"); 
                while(guess_count<10){
                    System.out.println("enter your number \t");
                    int n = sc.nextInt();
                    //if number is equal
                    if(n==ans){
                        System.out.println(" woohooo , you got it ");
                        System.out.println("you score is now " + 10*(10-guess_count-1));
                        return;
                    }
                    //if number is greater
                    else if(n>ans){
                        System.out.println(" your number is greater , try again");
                        System.out.println(" you now have only " +(10-guess_count-1) +" chances");
                    }//if number is smaller
                    else{
                        System.out.println(" you guessed a smaller no.");
                        System.out.println(" you now have only " +(10-guess_count-1) +" chances");
                    }
                    guess_count++;
                }
                System.out.println(" you failed bro , try next time\n");
                guess_game();
            break;
                // case 2 for unlimited chances
            case 2:
                guess_count=0;
                System.out.println(" you have limitless attempts ");
                while(true){
                    System.out.println("enter your number");
                    int n = sc.nextInt();
                    if(n==ans){
                        System.out.println(" you won the game");
                        //if guess_count value remain positive
                        if((10-guess_count-1)>0){
                            System.out.println(" you score is " + (guess_count+1));
                            System.out.println(" you now earned total of " + 10*(10-guess_count-1) +" points ");
                        }
                        else{
                            System.out.println(" you guessed it wrong so nothing for " +(guess_count+1) +" attempt");
                        }
                        return;
                    }

                    else if(n>ans){
                        System.out.println(" your number is high bro!");
                    }
                    else{
                        System.out.println(" you guessed it too smaller ");
                    }
                    guess_count++;
                }
                
            default :
            System.out.println(" enter a valid number ");   
            guess_game();          
      }
   }
   catch (Exception e) {

   }
}
    
    public static void main(String[] args) {
        // object instantiation 
        guess_game();
    }
}
