import java.io.*;
import java.util.*;

public class FindingPathMazeExample {
    public static void main(String[] args){
        findPaths("",3,3);
    } 
    public static void findPaths(String path,int row,int col){
        if(row==1 && col==1){
            System.out.print(path+"\n");
            return;
        }
        if(row!=1){
            findPaths(path+"D",row-1,col);
        }
        if(col!=1){
            findPaths(path+"R",row,col-1);
        }
    }
}


/*

OUTPUT:

DDRR
DRDR
DRRD
RDDR
RDRD
RRDD

*/