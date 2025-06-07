package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash{
    public static void main(String[] s){
        Frame f = new Frame("Technical University");
        f.setVisible(true); 
        int i;
        int x=1;
        for(i=2;i<=600;i+=4,x+=1){
            f.setLocation((600-((i+x)/2) ),400-(i/2));
            f.setSize(i+3*x,i+x/2);
            
            try{
                Thread.sleep(10); // will open image frame in 10 milliseconds
            }catch(Exception e) { }
        }
    }
}

// Runnable method to make threads for multithreading
class Frame extends JFrame implements Runnable{
    Thread t1; // Made reference of thread class
    Frame(String s){
        super(s);
        setLayout(new FlowLayout());
        // Fetching image to getSystemResource() method of class ClassLoader --> it will set image on frame(Loading of image)
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/first.jpg"));
        // Setting image size on frame
        Image i1 = c1.getImage().getScaledInstance(1200, 675,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1); // Passing object of Image class to ImageIcon class because JLabel class doesn't accept Image class's object as an argument
        
        JLabel m1 = new JLabel(i2);
        add(m1); // Adding image on frame
        t1 = new Thread(this); // Object of thread class, we used 'this' -> current frame will run first
        t1.start();// start() method used to call run method, we didn't call run directly because of multi-threading, if we called run() method directly, image page and login page will open simultaneously
    }
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            // Calling login constructor after running of above code
            Login f1 = new Login();
            
        }catch(Exception e){
            // prints all exceptions if it throws any
            e.printStackTrace(); 
        }
    }
}