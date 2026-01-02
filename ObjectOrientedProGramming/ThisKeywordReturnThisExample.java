import java.io.*;
import java.util.*;

public class ThisKeywordReturnThisExample {
    public ThisKeywordReturnThisExample createObject(){
        return this;
    }
    public void studentDetails(){
        System.out.print("\nName:Santosh Kumar Kowru..");
    }
    public static void main(String[] args){
        ThisKeywordReturnThisExample obj = new ThisKeywordReturnThisExample();
        obj.createObject().studentDetails();
    }
}


/*

OUTPUT:

Name:Santosh Kumar Kowru..

*/