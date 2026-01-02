import java.io.*;
import java.util.*;


class Student{
    int rollnum;
    String name;
    int age;
    public Student(String name,int rollnum,int age){
        this.name = name;
        this.rollnum = rollnum;
        this.age = age;
    }
}
public class ThisKeywordInstanceVariablesExample{
    public static void main(String[] args){

        Student obj = new Student("Santosh",93,20);

        System.out.print("\nName:"+obj.name+"\nRollNum:"+obj.rollnum+"\nAge:"+obj.age);

    }
}


/*

OUTPUT:

Name:Santosh
RollNum:93
Age:20

*/