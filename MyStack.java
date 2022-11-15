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
            System.out.println("Error: Stack is already at maximum capacity, could not add in new element.\n");
            return;
        }

        //showing the stack before:
        System.out.println("Stack before: " + formattedStack());

        //adds the element
        arr[size++] = element;
        
        //showing the stack after:
        System.out.println("Stack after: " + formattedStack() + "\n");
    }

    public static int pop()
    {
        //error trapping for in case the stack is empty
        if (isEmpty()){
            System.out.println("Error: Stack has no elements.\n");
            return -1;
        }

        //showing the stack before:
        System.out.println("Stack before: " + formattedStack());

        //collects the top element
        int topElement = arr[--size];
        
        //showing the stack after:
        System.out.println("Stack after: " + formattedStack() + "\n");

        //returns the top element
        return topElement;
    }

    public static int peek()
    {
        //error trapping for in case the stack is empty
        if (isEmpty()){
            System.out.println("Error: Stack has no elements.");
            return -1;
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
    public static String formattedStack()
    {
        //declaring the String to return
        String ret = "[";

        ret += arr[0];
        for (int i = 1; i < size; i++){
            ret += ","+arr[i];
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
        
        if (isEmpty()){
            System.out.println("The stack is empty.\n");
        } else {
            System.out.println("The stack is not empty.\n");
        }

        push(5);
        push(10);
        push(15);
        push(20);

        if (isEmpty()){
            System.out.println("The stack is empty.\n");
        } else {
            System.out.println("The stack is not empty.\n");
        }

        push(25);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(peek());
        
        if (isFull()){
            System.out.println("The stack is full.\n");
        } else {
            System.out.println("The stack is not full.\n");
        }

        for (int i = 6; i <= 15; i++){
            push(5 * i);
        }

        if (isFull()){
            System.out.println("The stack is full.\n");
        } else {
            System.out.println("The stack is not full.\n");
        }
    }
}