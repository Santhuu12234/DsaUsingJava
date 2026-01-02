import java.io.*;
import java.util.*;

class Details{
    public Details(){
        this.name();
    }
    public void name(){
        System.out.print("\nName:Santosh Kumar");
        this.age();
    }
    public void age(){
        System.out.print("\nAge:20");
        this.rollnum();
    }
    public void rollnum(){
        System.out.print("\nRollNumber:93");
    }
}

public class ThisKeywordCallingCurrentClassMethodExample {
    public static void main(String[] args){
        Details obj = new Details();
    }
}

/*

OUTOUT:

Name:Santosh Kumar
Age:20
RollNumber:93

*/