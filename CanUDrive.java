import java.util.Scanner; 

public class CanUDrive 
{

     public static void main(String[] args) 
     {
         int age;


         Scanner keyboard = new Scanner(System.in);

         System.out.prinln("Hello, i'm learning korean! ");
         

         System.out.print("Hey! what's ur age? ");
         age = keyboard.nextInt();


         if ( age < 16)
         {
            System.out.print("You can't drive and not vote");
         }

         else if ( 17 >= age && age >= 16)
         {
            System.out.print("you can drive but not vote");
         }

         else if ( 24 >= age &&  age >= 18)
         {
            System.out.print("you can vote and drive, but not rent a car");
         }
         else if ( age > 24 )
         {
            System.out.print("you can do pretty much anything as a conscius adult");
         }



     }
}