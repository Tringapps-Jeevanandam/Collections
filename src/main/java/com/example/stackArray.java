package com.example;

import java.util.Scanner;
import java.util.logging.Logger;



class Stack {
    int top;
    int[] arr;
    public static final Logger Log = Logger.getLogger("InfoLogging");

    Stack(int size){
        arr  = new int[size];
        top = -1;
        Log.info("***Stack created***");
    }
    boolean isEmpty(){
        return top==-1;
    }

    boolean isFull(){
        return top == arr.length-1;
    }

    void push(int value){
        if(isFull()){
            throw new IllegalStateException("Stack is full, cannot push item.");
        }
        else{
            String str ="inserting:"+Integer.toString(value);
            Log.info(str);
            arr[++top] = value;
        }
    }
    void  pop(){
        
        try{
            if(isEmpty()){
                Log.info("***Stack is empty***");
                return;
            }
            String  str = "Element popped: "+arr[top];
            Log.info(str);
        }
        catch(Exception e){
            String exp = ""+e;
            Log.info(exp);
        }
       
    }
    void  peek(){
        try{
        if(isEmpty()){
            Log.info("***Stack is empty***");
            return;
        }
        String str = "At peek "+Integer.toString(arr[top]);
        Log.info(str);
        }
        catch(Exception e){
            String exp = ""+e;
            Log.info(exp);        }

    }
    void printStack(){
        String str;

        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        else{
            for(int i=top; i>=0;i--){
                str = "Index"+Integer.toString(i)+": "+Integer.toString(arr[i]);
                Log.info(str);
        }
        }
        
    }
}
public class StackArray {
    public static final Logger Log = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {
        int size;
        int choice;
        int val;
        Scanner input = new Scanner(System.in);
        Log.info("Enter Size of the stack: ");
        size = input.nextInt();
        Stack s = new Stack(size);
        while(true){
            try{
            Log.info("1.push value \n2.pop \n3.peek \n4.print stack \n5.exit");
            choice = input.nextInt();
            switch(choice){
                case 1: {
                    Log.info("Enter value to push()");
                    val = input.nextInt();
                    s.push(val);
                } break;
                case 2: s.pop();break;
                case 3: s.peek(); break;
                case 4: s.printStack();break;
                case 5: System.exit(1); break;
                default: Log.info("Enter correct choice"); break;
            }
       }
        catch(Exception e){
            String exp = ""+e;
            Log.info(exp);
            input.next();
        }

        }


    }
}
