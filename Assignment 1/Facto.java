import java.io.*;
import java.util.*;

class Facto{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a no:");
int n = sc.nextInt();
System.out.println("Factorial of "+n+" is :"+factorial(n));
}
static int factorial(int n){
if(n==1) return 1;
return n*factorial(n-1);
}
}
