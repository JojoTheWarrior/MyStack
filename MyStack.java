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
    private int[] arr;
    public int size = 0;

    public MyStack(int capacity)
    {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public void push(int element)
    {
        //error trapping for in case the stack is alraedy full
        if (this.isFull()){
            System.out.println("Error: Stack is already at maximum capacity, could not add in new element.");
            return;
        }

        //showing the stack before:
        System.out.println("Stack before: " + formattedStack());

        //adds the element
        this.arr[size++] = element;
        
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
        int topElement = this.arr[--size];
        
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
            return 0;
        }

        return this.arr[size - 1];
    }

    public int size()
    {
        return this.size;
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

        for (int i = 0; i < size; i++){
            if (i == size - 1){
                //very last element, do not put another semicolon
                ret += i + "]";
            } else {
                //does not put a semicolon
                ret += i + ",";
            }
        }

        return ret;
    }

    //main method, calls the methods on the stack
    public static void main(String[] args){
        
    }
}