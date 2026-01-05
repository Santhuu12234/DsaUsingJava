import OperationsPrograms.AdditionExample;
import OperationsPrograms.DivisionExample;
import OperationsPrograms.MultiplicationExample;
import OperationsPrograms.SubtractionExample;

import java.util.*;
import java.io.*;

public class CalculatorExample{
    public static void main(String[] args){
        AdditionExample add = new AdditionExample();
        SubtractionExample sub = new SubtractionExample();
        MultiplicationExample mul = new MultiplicationExample();
        DivisionExample div = new DivisionExample();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("\nEnter Your Choice:\n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Exit\nAns:");
            int ch = scanner.nextInt();
            int a,b;
            switch(ch){
                case 1:System.out.print("\nEnter The 1st Number:");
                    a = scanner.nextInt();
                    System.out.print("Enter The 2nd Number:");
                    b = scanner.nextInt();
                    add.addition(a,b);
                    break;
                case 2:System.out.print("\nEnter The 1st Number:");
                    a = scanner.nextInt();
                    System.out.print("Enter The 2nd Number:");
                    b = scanner.nextInt();
                    sub.subtraction(a,b);
                    break;
                case 3:System.out.print("\nEnter The 1st Number:");
                    a = scanner.nextInt();
                    System.out.print("Enter The 2nd Number:");
                    b = scanner.nextInt();
                    div.division(a,b);
                    break;
                case 4:System.out.print("\nEnter The 1st Number:");
                    a = scanner.nextInt();
                    System.out.print("Enter The 2nd Number:");
                    b = scanner.nextInt();
                    mul.multiplication(a,b);
                    break;
                case 5:
                    System.out.print("\n\n\t\t\t****Program Completed****\n\n");
                    System.exit(0);
                    break;
                default:System.out.print("\n!!!!....Invalid Choice...!!!!\n");
                    break;
            }
            System.out.print("\n");
        }
    }
}