package collections;

import java.util.Scanner;
import java.util.logging.Logger;

public class StackArr {
    public static final Logger Log = Logger.getLogger("InfoLogging");

    public void Stackarr() {
        int size;
        int choice;
        int val;
        Scanner input = new Scanner(System.in);
        Log.info("Enter Size of the stack: ");
        size = input.nextInt();
        Stac s = new Stac(size);
        boolean flag = true;
        while(flag){
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
                case 5: flag=false; break;
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
