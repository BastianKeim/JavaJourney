import java.util.Scanner;

public class DummieCalculator
{

    public static void main(String[] args) 
    {
     
        double first;
        double second; 
        double third; 

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What's ur first number: ");
        first = keyboard.nextDouble();
        System.out.print("What's ur second number:");
        second = keyboard.nextDouble();
        System.out.print("What's ur third number:");
        third = keyboard.nextDouble();
        
        System.out.print("("+ first + " + " + second + " + " + third +" /2 ) = " + ((first + second +third)/2 ));
    }
}