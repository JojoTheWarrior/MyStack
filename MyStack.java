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

    public boolean push(int element)
    {
        if (this.isFull()) return false;
        this.arr[size++] = element;
        return true;
    }

    public int pop()
    {
        return this.arr[--size];
    }

    public int peek()
    {
        return this.arr[size-1];
    }

    public int size()
    {
        return this.size;
    }

    public boolean isEmpty()
    {
        return size()==0;
    }

    public boolean isFull()
    {
        return size()==capacity;
    }

    public void print()
    {
        ;
    }

    //main method, calls the methods on the stack
    public static void main(String[] args){
        
    }
}