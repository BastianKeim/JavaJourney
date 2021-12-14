 import java.util.Scanner;

 public class AgeinFiveYears
 {


    public static void main(String[] args) 
    {
        int infive = 5;
        int age;
        String name;

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Hello, what's your name?");
        name = keyboard.next();

        System.out.println("So, " + name + " tell me, what's ur age?");
        age = keyboard.nextInt();

        System.out.println("did you know in 5 years you will be: " + (infive + age));
        System.out.println("and five years ago you were " + (age - infive ));




    }
 }