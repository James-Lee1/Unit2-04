/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Mar 2019
 * Created for: ICS4U
 * This program creates a stack and can push, pop, peek or clear without
 * errors
 *
 ****************************************************************************/

import java.util.ArrayList;

class Stack
{
    private final ArrayList<Integer> myStack = new ArrayList<Integer>();

    // Pushes a string that if it is not a number, returns an error
    public void push(int number)
    {
        myStack.add(number);
    }

   // Removes top value of stack
    public int pop()
    {
        int update = myStack.remove(myStack.size()-1);
        return update;
    }

    // Returns size of stack
    public int size()
    {
        int size = myStack.size();
        return size;
    }

    public int peek()
    {
        int last = myStack.get(myStack.size() - 1);
        return last;
    }

    public void clear()
    {
        myStack.clear();
    }

    // Converts stack into string
    public String toString()
    {
        String output = "";

        for (Integer count : myStack)
        {
            output += count + "\n";
        }

        return output.toString();
    }
}
