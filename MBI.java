import java.util.Scanner;

public class MBI
{

    public static void main(String[] args) 
    {
        
        int kg;
        double height;
        

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What's weight in kg");
        kg = keyboard.nextInt();

        System.out.print("What's weight in height");
        height = keyboard.nextInt();
        double squareheight = Math.pow(height,2);

        System.out.print("your BMI is: " + (kg/squareheight));




    
    
    
    }

}