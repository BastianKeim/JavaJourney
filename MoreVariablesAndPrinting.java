public class MoreVariablesAndPrinting
{
    public static void main (String[] args)
    {
        String myName, myEyes, myTeeth, myHair;
        int myAge, myHeight, myWeight;


        myName = "Zed A. Shaw";
        myAge = 35; //not a lie
        myHeight = 74; // inches
        myWeight = 180; //lbs 
        myEyes = "Blue";
        myTeeth = "White";
        myHair = "Brown";

        System.out.println ("Let's talk about " + myName + ".");
        System.out.println ("He's " + myHeight + "inches tall");
        System.out.println ("he's " + myWeight + " pound heavy");
        System.out.println ("actually, that's not too heavye.");
        System.out.println ("he's got " + myEyes + "Eyes and " + myHair +" hair");
        System.out.println ("his teeth are usually" + myTeeth + "depending on the coffe");


        //this line is tricky; try to get it exactly right.
        System.out.println ("if i add " + myAge +", " +myHeight + ", and " + myWeight
        + " I get " + (myAge + myHeight + myWeight) + ".");
        
    }



}