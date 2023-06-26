import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        boolean done = false;
        int point = 0;
        int pointCase = 0;

        do
        {
            done = false;
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;

            System.out.println("Die 1 = " + die1 + "\nDie 2 = " + die2 + "\nSum of the dice: " + crapsRoll);
            String continueQ = "";

            if (pointCase == 0)
            {
                if(crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
                {
                    System.out.println("Oh no! You crapped out!");
                    System.out.print("Press any key to continue playing, press Q to quit: ");
                    continueQ = in.nextLine();
                    if(continueQ.equalsIgnoreCase("Q"))
                    {
                        done = true;
                    }
                }
                else if(crapsRoll == 7 || crapsRoll == 11)
                {
                    System.out.println("You won with a natural!");
                    System.out.print("Press any key to continue playing, press Q to quit: ");
                    continueQ = in.nextLine();
                    if(continueQ.equalsIgnoreCase("Q"))
                    {
                        done = true;
                    }
                }
                else
                {
                    System.out.println("The roll of " + crapsRoll + " is now the point!");
                    point = crapsRoll;
                    pointCase = 1;
                }
            }
            else
            {
                if (crapsRoll == 7)
                {
                    System.out.println("Oh no you rolled a 7 and lost!");
                    point = 0;
                    pointCase = 0;
                    System.out.print("Press any key to continue playing, press Q to quit: ");
                    continueQ = in.nextLine();
                    if(continueQ.equalsIgnoreCase("Q"))
                    {
                        done = true;
                    }
                }
                else if (crapsRoll == point)
                {
                    System.out.println("You made point and won!");
                    point = 0;
                    pointCase = 0;
                    System.out.print("Press any key to continue playing, press Q to quit: ");
                    continueQ = in.nextLine();
                    if(continueQ.equalsIgnoreCase("Q"))
                    {
                        done = true;
                    }
                }
                else
                {
                    System.out.println("Still trying for point!");
                }
            }
        }while (!done);

    }
}