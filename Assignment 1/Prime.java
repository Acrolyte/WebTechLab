import java.io.*;
import java.util.*;

class Prime{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println();

for(int i=1;i<=1000;i++){
if(prime(i)==0)
System.out.print(i+" ");
}

}

static int prime(int n){
int x=0;
for(int i=2;i<=n/2;i++){
if(n%i==0) x++;
}
if(x>0) return 1;
return 0;
}

}
