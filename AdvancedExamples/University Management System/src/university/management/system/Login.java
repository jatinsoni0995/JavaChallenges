/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

// Extends JFrame because we need to create a frame
// After clicking on Login, some action should be performed, it will be done with ActionListener interface
public class Login extends JFrame implements ActionListener{

    JFrame f;
    JLabel l1,l2; // Username and password heading on login page
    JTextField t1; // The field in which we enter username
    JPasswordField t2; // The field in which we enter password field
    JButton b1,b2;

    Login(){

        super("Login"); // super method to show 'Login' as heading in title bar of login frame

        setBackground(Color.white);
        setLayout(null); // I don't want a default layout, i want a custom layout that's why i set it to null

        l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        add(l2);
 
        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        add(t2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,20,150,150);
        add(l3);


        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);

        b2.addActionListener(this);

        // getContentPane() method to colour the frame completely, it will select complete frame
        getContentPane().setBackground(Color.white);

        setVisible(true);
        setSize(600,300);
        setLocation(500,300);

    }

    public void actionPerformed(ActionEvent ae) {

        // getSource() method checks user entered which button --> this method returns the object of the button that user pressed
        if (ae.getSource() == b1) {
            try {
                conn c1 = new conn();
                String u = t1.getText(); // Fetch user's entered data and put it into 'u' (For username)
                String v = t2.getText(); // For password

                // Checking our database from login table
                String q = "select * from login where username='" + u + "' and password='" + v + "'";

                // Executing query using object of statement 's' of conn class, data fetched after executing query is stored in resultset rs
                ResultSet rs = c1.s.executeQuery(q);
                // if we get multiple rows from database, it will compare one by one with the help of next() method
                if (rs.next()) {
                    // if it matches, run project class
                    new Project().setVisible(true);
                    setVisible(false); // set visibility of login page to false
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid login");
                    setVisible(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(ae.getSource() == b2){ // if we press Cancel button
            System.exit(0);
        }
    }
    public static void main(String[] arg){
        Login l = new Login();
    }
}