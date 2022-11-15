/*
Names: Joshua Wang, Victor Sarca, Jonathan Liu.
Description: Implements a Stack data structure in Java.
Teacher: Mr. Gugoiu
Date: 11/14/22
*/

/*
push() – Insert an element at one end of the stack called top
pop() – Remove and return the element at the top of the stack, if it is not empty
peek() – Return the element at the top of the stack without removing it, if the stack is not empty
size() – Return the number of elements in the stack
isEmpty() – Return true if the stack is empty, otherwise return false
isFull() – Return true if the stack is full (based on the capacity instance variable), otherwise return false
print() – prints all elements from the bottom to the top
capacity – instance variable (int field) to store the maximum number of elements allowed on the stack
int[] arr – array instance variable to store the data
 */

import java.io.*;

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

        for (int i = 0; i < size; i++){
            if (i == size - 1){
                //very last element, do not put another comma
                ret += arr[i] + "]";
            } else {
                //does not put a comma
                ret += arr[i] + ",";
            }
        }

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