/*
Names: Joshua Wang, Victor Sarca, Jonathan Liu.
Description: Implements a Stack data structure in Java.
Teacher: Mr. Gugoiu
Date: 11/14/22
*/

import java.io.*;

public class MyStack {
    public static int capacity = 1000;
    public int[] arr = new int[capacity];
    public int size = 0;

    public void push(int element)
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

    public int pop()
    {
        //error trapping for in case the stack is empty
        if (isEmpty()){
            System.out.println("Error: Stack has no elements.");
            return -1;
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

    public int peek()
    {
        //error trapping for in case the stack is empty
        if (isEmpty()){
            System.out.println("Error: Stack has no elements.");
            return -1;
        }

        return arr[size - 1];
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public boolean isFull()
    {
        return size() == capacity;
    }

    public void print()
    {
        System.out.println("The current stack is: " + formattedStack());
    }

    //helper function that returns a formatted String of the stack, useful in push and pop functions
    public String formattedStack(){
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
        
    }
}