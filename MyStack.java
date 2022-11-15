/*
Names: Joshua Wang, Victor Sarca, Jonathan Liu.
Description: Implements a Stack data structure in Java.
Teacher: Mr. Gugoiu
Date: 11/14/22
*/

public class MyStack {
    public static int capacity;
    public static int[] arr;
    public static int size = 0;

    public static void push(int element)
    {
        //error trapping for in case the stack is alraedy full
        if (isFull()){
            System.out.println("Error: Stack is already at maximum capacity, could not add in new element.");
            return;
        }

        //showing the stack before:
        System.out.println("Stack before: " + formattedStack());

        //adds the element
        arr[size++] = element;
        
        //showing the stack after:
        System.out.println("Stack after: " + formattedStack());
    }

    public static int pop()
    {
        //error trapping for in case the stack is empty
        if (isEmpty()){
            System.out.println("Error: Stack has no elements.");
            return 0;
        }

        //showing the stack before:
        System.out.println("Stack before: " + formattedStack());

        //collects the top element
        int topElement = arr[--size];
        
        //showing the stack after:
        System.out.println("Stack after: " + formattedStack());

        //returns the top element
        return topElement;
    }

    public static int peek()
    {
        //error trapping for in case the stack is empty
        if (isEmpty()){
            System.out.println("Error: Stack has no elements.");
            return 0;
        }

        return arr[size - 1];
    }

    public static int size()
    {
        return size;
    }

    public static boolean isEmpty()
    {
        return size() == 0;
    }

    public static boolean isFull()
    {
        return size() == capacity;
    }

    public static void print()
    {
        System.out.println("The current stack is: " + formattedStack());
    }

    //helper function that returns a formatted String of the stack, useful in push and pop functions
    public static String formattedStack(){
        //declaring the String to return
        String ret = "[";

        ret += arr[0];
        for (int i = 1; i < size; i++){
            ret += ","+arr[1];
        }
        ret += "]";

        return ret;
    }

    //main method, calls the methods on the stack
    public static void main(String[] args){
        //initializing the stack
        capacity = 10;
        arr = new int[capacity];

        //making changes to the stack
        pop();
    }
}