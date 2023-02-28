
package collections;

import java.util.logging.Logger;



class Stac {
    int top;
    int[] arr;
    public static final Logger Log = Logger.getLogger("InfoLogging");

    Stac(int size){
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
