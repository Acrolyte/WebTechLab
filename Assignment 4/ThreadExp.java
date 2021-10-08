class CreateThread implements Runnable {
String name;
Thread t;
CreateThread(String n){
name = n;
t = new Thread(this, n);
System.out.println("A new thread: "+t+" is created.");
t.start();
}

public void run(){
try{
for(int j = 1;j<=10;j++){
System.out.println(name + ":" + j);
Thread.sleep(1000);
}

} catch(InterruptedException e){
System.out.println(name + " thread interrupted");
}
System.out.println(name + " thread exiting.");
}
}

class ThreadExp {
public static void main(String args[]){
new CreateThread("A");
new CreateThread("B");

try{
Thread.sleep(11000);
}catch(InterruptedException e){
System.out.println("Interruption occurs in Main Thread");
}
System.out.println("Exit from Main Thread.");
}
}