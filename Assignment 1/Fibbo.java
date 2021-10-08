import java.io.*;
import java.util.*;

class Fibbo{
public static void main(String args[]){

int i=0,j=1,s=0;
System.out.print("0 1 ");

while(i+j<100){
s = i+j;
System.out.print(s+" ");
i = j;
j = s;
}

}
}
