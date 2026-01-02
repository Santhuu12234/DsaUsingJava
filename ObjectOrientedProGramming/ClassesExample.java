import java.io.*;
import java.util.*;

public class ClassesExample {
   public static void main(String[] args){
        ThisKeyDefination TKD = new ThisKeyDefination();
        ClassDefination CD = new ClassDefination();
   } 
}
class ThisKeyDefination{
    ThisKeyDefination(){
        System.out.print("\nThis Keyword Refers To The Current Class Object...");
    }
}
class ClassDefination{
    ClassDefination(){
        System.out.print("\nA Class Is A Templet Or A BluePrint That Consists Of Members And Properties..");
    }
}


/*

OUTPUT:

This Keyword Refers To The Current Class Object...
A Class Is A Templet Or A BluePrint That Consists Of Members And Properties..

*/