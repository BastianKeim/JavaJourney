import java.util.Scanner;

public class LittleQuiz
{

        public static void main(String[] args) 
        {
            int Q1;
            int Q2;
            int Q3;
            int score = 0;

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Q1) What's the capital of Alaska?");
            System.out.println("1) Melbourne");
            System.out.println("2) Anchorage");
            System.out.println("3) Juneau");

            Q1 = keyboard.nextInt();
            if ( Q1 == 1 || Q1 == 2)
            {
                System.out.println("Sorry, correct answer is: 3) Juneau");
            }
            else if(Q1 == 3)
            {
                System.out.println("Correct answer!");
                score += 1; 
            }
            else
            {
            System.out.println("You should had give a correct number, so I give you this as a wrong answer");
            }
        
        
            System.out.println("Q2) Can you store the value 'cat' in a variable of type int?");
            System.out.println("1) Yes");
            System.out.println("2) Nope!");

            Q2 = keyboard.nextInt();

            if(Q2 == 1)
            {
                System.out.println("Sorry, correct answer is: 2) Nope");
            }
            else if (Q2 == 2)
            {
                System.out.println("Correct answer!");
                score += 1; 
            }
            else
            {
            System.out.println("You should had give a correct number, so I give you this as a wrong answer");
            }

            System.out.println("Q3) what is the result of 9+6/3?");
            System.out.println("1) 5");
            System.out.println("2) 11");
            System.out.println("3) 15/3");

            Q3 = keyboard.nextInt();

            if(Q3 == 1)
            {
                System.out.println("Sorry, correct answer is: 2) 11");
            }
            else if (Q3 == 2)
            {
                System.out.println("Correct answer!");
                score += 1; 
            }
            else
            {
            System.out.println("You should had give a correct number, so I give you this as a wrong answer");
            }



            System.out.println("Overall, you got " + score +" of 3, Thanks for playing");


        
        
        
        }
}