import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class ListenMouse extends Frame implements MouseListener{

ListenMouse(){
addMouseListener(this);
setSize(300,300);
setLayout(null);
setVisible(true);
}

public void mouseEntered(MouseEvent e){
this.setBackground(Color.blue);
}
public void mouseExited(MouseEvent e){
this.setBackground(Color.white);
}
public void mouseClicked(MouseEvent e){
this.setBackground(Color.green);
}
public void mousePressed(MouseEvent e){
this.setBackground(Color.red);
}
public void mouseReleased(MouseEvent e){

this.setBackground(Color.yellow);
}

public static void main(String[] args){
new ListenMouse();
}
}