import java .util.Scanner;
import java .util.Random;
public class  Numberguessing {
   public static void guess(){
      Scanner sc = new Scanner(System.in);
      Random no = new Random();
       int num = no.nextInt(100) +1;
       System.out.println("*****************Welcome to the Number Guessing Game**********************");
      
       System.out.println("The number lies between 1 to 100 \nEnter your number to guess the correct answer: ");
         while(true){
             int enter = sc.nextInt();
             if(enter==num){
                System.out.println("CONGRATULATIONS!!!YOU WON...");
                break;

             }
             else if(enter<num){
                System.out.println("Number is smaller\nTry again:");
             }
             else{
                System.out.println("Number is greater\nTry again:");
             }
         }
    }
   public static void main (String args[]){
    guess();
  }
}



