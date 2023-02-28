package collections;

import java.util.Scanner;
import java.util.logging.*;

public class Collections 
{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main( String[] args )
    {
        int ch;
        Scanner sc = new Scanner(System.in);
        boolean temp =true;
        while(temp){
            Log.info("1.ArrayList 2.Array 3.Exit");
            ch = sc.nextInt();
            switch(ch){
                case 1: {
                    arrlist a = new arrlist();
                    a.arrList();
                    break;
                }
                case 2:{
                    StackArr sa = new StackArr();
                    sa.Stackarr();
                    break;
                }
                case 3: temp = false;break;
                default: break;
            }

        }
    }
}
