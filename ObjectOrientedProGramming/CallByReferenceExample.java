import java.io.*;
import java.util.*;


class value{
    int data = 100;
}
public class CallByReferenceExample{
    public static void change(value val){
        val.data = 200;
    }
    public static void main(String[] args){
        value v = new value();
        System.out.print("\nThe Value Before Change:"+v.data);
        change(v);
        System.out.print("\nAfter Changing The Value Is:"+v.data);

    }
}


/*

OUTPUT:

The Value Before Change:100
After Changing The Value Is:200

*/