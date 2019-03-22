/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Mar 2019
 * Created for: ICS4U
 * This program creates a stack and can push, pop, peek or clear without
 * errors
 *
 ****************************************************************************/

import java.util.Scanner;

public class StackForm
{
    public static void main(String[] args)
    {
        // Creates new stack
        Stack stack = new Stack();
        Scanner userInput = new Scanner(System.in);
        String userChoice;

        while (true)
        {
            System.out.print("What would you like to do? (push, pop, peek, clear, or exit) : ");
            userChoice = userInput.nextLine();
            System.out.print("\n");

            // Pops the last value of stack
            if (userChoice.equals("pop"))
            {
                if (stack.size() == 0)
                {
                    System.out.println("Stack is empty!" + "\n");
                }
                else
                {
                    System.out.println(stack.pop() + " was removed." + "\n");
                }
            }
            // Pushes a value inputted by user, and will return an error message if it is
            // not a number
            else if (userChoice.equals("push"))
            {
                String pushValue;
                System.out.print("Enter an input to push : ");
                pushValue = userInput.nextLine();

                if (isValidInput(pushValue) == true)
                {
                    stack.push(Integer.parseInt(pushValue));
                }
                else
                {
                    System.out.print("Error : Not a valid input!" + "\n");
                }
            }

            else if (userChoice.equals("peek"))
            {
                if (stack.size() == 0)
                {
                    System.out.print("Error : No value to peek!" + "\n");
                }
                else
                {
                    System.out.print("Last value of stack is " + stack.peek() + "\n");
                }
            }

            else if (userChoice.equals("clear"))
            {
                stack.clear();
                System.out.print("Stack has been cleared. " + "\n");
            }

            else if (userChoice.equals("exit"))
            {
                break;
            }
            else
            {
                System.out.print("Error : Not a valid input!" + "\n");
            }
            // Prints out entire stack
            System.out.println("The values in the stack are : " + "\n" + stack.toString());
        }
    }

    public static boolean isValidInput(String str)
    {   // Checks if string is a valid number
        try
        {
            int i = Integer.parseInt(str);
            if (i >= 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        catch(NumberFormatException nfe)
        {
            return false;
        }
    }
}
