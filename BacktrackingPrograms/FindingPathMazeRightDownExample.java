import java.io.*;
import java.util.*;

public class FindingPathMazeRightDownExample {
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

Down Down Right Right
Down Right Down Right
Down Right Right Down
Down Right Diagonal
Down Diagonal Right
Right Down Down Right
Right Down Right Down
Right Down Diagonal
Right Right Down Down
Right Diagonal Down
Diagonal Down Right
Diagonal Right Down
Diagonal Diagonal

*/