
package test;
import java.io.*;
import java.util.*;

class Pack{
int a,b;

Pack(){
a = 0;
b = 0;
}
void display(){
System.out.println("A= "+a+" B= "+b);
}

void insert(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter two nos.:");
a = sc.nextInt();
b = sc.nextInt();
}
int add(){
return a+b;
}
int diff(){
return a-b;
}
int mul(){
return a*b;
}
int div(){
return a/b;
}

public static void main(String[] args){
Pack obj = new Pack();
System.out.println();
obj.insert();
int n=0;

while(n!=0){
System.out.println("1)ADD 2)SUB 3)MUL 4)DIV 5)EXIT");
int v=0;
if(n==1){
v = obj.add();
}
if(n==2){
v = obj.diff();
}
if(n==3){
v = obj.mul();
}
if(n==4){
v = obj.div();
}
if(n==5){
n = 0;
}
System.out.println("VALUE: "+v);
}//end while

} //end main
}