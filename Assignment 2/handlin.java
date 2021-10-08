import java.io.*;
import java.util.*;

class handlin{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
try{
n = n/0;
}
catch(ArithmeticException e){
System.out.println("your program has an exception!!");
}
System.out.println("program finished!");
} 
}