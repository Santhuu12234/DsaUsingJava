import java.io.*;
import java.util.*;


class Student{
    public Student(){
        this("Santosh",93);
    }
    public Student(String name,int rollnum){
        System.out.print("My Name Is "+name+"\nMy RollNum Is:"+rollnum);
    }
}
public class ThisKeywordCallingCurrentClassConstructorExample {
    public static void main(String[] args){
        Student st = new Student();
    }
}


/*

OUTPUT:

My Name Is Santosh
My RollNum Is:93

*/