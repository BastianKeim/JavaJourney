import java.security.Principal;
import java.util.Scanner;

public class TwentyQuestionButTwo
{


    public static void main(String[] args) 
    {
        System.out.println ("Two Questions");
        System.out.println ("Think of an object, and I'll try to guess it.");

        String Q1; 
        String Q2;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println ("Question 1) Is it animal, vegetable, or mineral?");
        Q1 = keyboard.nextLine();

        System.out.println ("Question 2) Is it bigger than a breadbox?");
        Q2 = keyboard.nextLine();

    
        Q1 = Q1.toLowerCase();
        Q2 = Q2.toLowerCase();

        


        if (Q1.equals("animal") && Q2.equals("no"))
        {
            System.out.print ("You are thinking in a ");
            System.out.println ("squirrel");
            System.out.println ("I would ask you if I'm right, but I don't actually care ");
        }

        else if (Q1.equals("animal") && Q2.equals("yes"))
        {
            System.out.print ("You are thinking in a ");
            System.out.println ("Moose");
            System.out.println ("I would ask you if I'm right, but I don't actually care ");
        }
        else if (Q1.equals("vegetable") && Q2.equals("no"))
        {
            System.out.print ("You are thinking in a ");
            System.out.println ("Carrot");
            System.out.println ("I would ask you if I'm right, but I don't actually care ");
        }
        else if (Q1.equals("vegetable") && Q2.equals("yes"))
        {
            System.out.print ("You are thinking in a ");
            System.out.println ("watermelon");
            System.out.println ("I would ask you if I'm right, but I don't actually care ");
        }
        else if (Q1.equals("mineral") && Q2.equals("no"))
        {
            System.out.print ("You are thinking in a ");
            System.out.println ("paper clip");
            System.out.println ("I would ask you if I'm right, but I don't actually care ");
        }
        else if (Q1.equals("animal") && Q2.equals("yes"))
        {
            System.out.print ("You are thinking in a ");
            System.out.println ("Camaro");
            System.out.println ("I would ask you if I'm right, but I don't actually care ");
        }
        
        


    }

}