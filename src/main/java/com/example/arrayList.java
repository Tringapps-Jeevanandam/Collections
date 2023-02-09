package com.example;

import java.util.logging.Logger;
import java.util.*;

public class arrayList {
    public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice;
        int val;
        int pos;
        while(true){
            Log.info("ARRAYLIST\n1.add element\n2.add element at index\n3.remove value\n4.remove from index\n5.display\n6.clear\n7.exit");
            choice = input.nextInt();
            switch(choice){
                case 1: {
                    Log.info("Enter element to add");
                    val =input.nextInt();
                    x.add(val);
                }break;
                case 2: {
                    try{
                    Log.info("Enter index");
                    pos = input.nextInt();
                    Log.info("Enter value");
                    val = input.nextInt();
                    x.add(pos, val);}
                    catch(Exception e){
                        String exp = ""+e;
                        Log.info(exp);
                    }
                }break;
                case 3: {
                    Iterator<Integer> itr = x.iterator() ;
                    Log.info("Enter value to remove:");
                    val = input.nextInt();    
                    while (itr.hasNext()){
                        int num = itr.next();
                        if(num == val){
                            itr.remove();
                            Log.info("Removed");
                        }
                    }
                }break;
                case 4: {
                    Log.info("Enter index");
                    pos = input.nextInt();
                    x.remove(pos);
                    Log.info("Removed from the index");
                }break;
                case 5:{
                    String s = x.toString();
                    Log.info(s);
                }break;
                case 6: {
                    x.clear();
                    Log.info("Cleared");
                }break;
                case 7: System.exit(0); break;
                default:Log.info("Enter correct choice");
            }

        }
        
   

        

      
        
    }
}
