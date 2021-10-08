import java.io.*;
import java.util.*;

class Student{
String name;
int age;
String address;

Student(){
name = "Arpit";
age = 22;
address = "home";
}

void display(){
System.out.println("Student "+name+" has age: "+age+" lives at "+address);
}

public static void main(String[] args){
Student obj = new Student();
obj.display();
} 
}