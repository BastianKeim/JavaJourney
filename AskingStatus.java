import java.util.Scanner;

public class AskingStatus
{

    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner (System.in);

        String name;
        int age;
        double money;

        System.out.print("Hello, what's your name?");
        name = keyboard.next ();

        System.out.println("Hello " + name + " Nice to meet." );
        System.out.println("how old are u ? " );
        age = keyboard.nextInt ();

        System.out.println("so you're " + age + " Not that old." );
        System.out.println("how much money do you make ? " + name );
        money = keyboard.nextDouble();

        System.out.println( "Only " + money + "? I hope that's per hour and not per year! LOL!");


    }


}