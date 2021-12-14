import java.util.Scanner;


public class MoreUserInputofData
{

   public static void main(String[] args)
    {
    
        String  name; 
        String lastname;
        int grade;
        int studentId;
        String loginId;
        Double gpa;


        Scanner keyboard = new Scanner(System.in);

        System.out.println("I'm going to ask you some questions! To sell them later");

        System.out.print("Your First Name: ");
        name = keyboard.next();

        System.out.print("Last name: "); 
        lastname = keyboard.next();

        System.out.print("Grade: ");
        grade = keyboard.nextInt();

        System.out.print("Student ID: ");
        studentId = keyboard.nextInt();

        System.out.print("Login ID: ");
        loginId = keyboard.next();
 
        System.out.print("GPA (0.0 / 4.0) ");
        gpa = keyboard.nextDouble();



        System.out.println("So, your information is.");
        System.out.println("Login: " + loginId);
        System.out.println("ID: " + studentId);
        System.out.println("Name: "+ name + ", "+ lastname);
        System.out.println("GPA: "+ gpa);
        System.out.println("Grade: "+ grade);


       
    }


    }
