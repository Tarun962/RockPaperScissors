import java.util.Random;
import java.util.Scanner;


public class RPSGame{
    public static void main(String args[]){
        Random random = new Random();
        int x = random.nextInt(3);

        Scanner sc= new Scanner(System.in);
        System.out.print(" choose any of the number b/w 0 -> 3 \n 0 = rock  1 = scissor  2 = paper \n -> ");
        int n=sc.nextInt();
        System.out.println("computer's choice -> "+x);

        if(x==0 && n==0){
            System.out.println("TIE \n Try Again");
        } else if(x==0 && n==2){
            System.out.println("congratulations You Win");
        } else if(x==0 && n==1){
            System.out.println("Computer win");
        } else if(x==1 && n==0){
            System.out.println("congratulations You Win");
        } else if(x==1 && n==1){
            System.out.println("TIE \n Try Again");
        } else if(x==1 && n==2){
            System.out.println("Computer win");
        } else if(x==2 && n==0){
            System.out.println("Computer win");
        } else if(x==2 && n==1){
            System.out.println("congratulations You Win");
        } else if(x==2 && n==2){
            System.out.println("TIE \n Try Again");
        }
        
    }

}
