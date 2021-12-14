import java.util.Scanner;

public class HowOldAreU
{

    public static void main(String[] args) 
    {
        String name;
        int age;


        Scanner keyboard = new Scanner(System.in);


        System.out.println("Hey, what's ur name? ");
        name = keyboard.next();

        System.out.println("and how old are u? ");
        age = keyboard.nextInt();


        if( age > 17 )
        {
            System.out.println("Hey "+ name+" you are able to vote cuz you are an adult!.");
        }

        else

        System.out.println("Hey " + name + "you are "+ age + " years old, you are a minor, you can't vote.");


    }
}