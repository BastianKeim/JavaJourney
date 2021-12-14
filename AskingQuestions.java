import java.util.Scanner;

public class AskingQuestions
{


    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner (System.in);

        int age; 
        String height;
        double weight;

        System.out.print("how old are u?");
        age = keyboard.nextInt();

        System.out.print("how tall are u?");
        height = keyboard.next();

        System.out.print("how much do you weigh?");
        weight = keyboard.nextDouble();

        System.out.println("So you're" + age + " old, "+ height + "tall and "+ weight + " heavy");
    }
    
} 