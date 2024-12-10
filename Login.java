package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class Login extends JFrame implements ActionListener{

JButton Login,signup,clear;
JTextField cardTextField;
JPasswordField pinTextField;

Login()
{
   setTitle("Automated Teller Machine");
   setLayout(null);
   ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
   Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
   ImageIcon i3 = new ImageIcon(i2);
   JLabel Label = new JLabel(i3);
   Label.setBounds(70,10,100,100);
   add(Label);
   JLabel text = new JLabel("Welcome to ATM");
   text.setFont(new Font("Osward",Font.BOLD,38));
   text.setBounds(200, 40, 400, 40);
   add(text);
   
   JLabel CardNo = new JLabel("Card No.:");
   CardNo.setFont(new Font("Raleway",Font.BOLD,28));
   CardNo.setBounds(120, 150, 150, 30);
   add(CardNo);
   
   cardTextField = new JTextField();
   cardTextField.setBounds(300, 150, 230, 30);
   cardTextField.setFont(new Font("Arial",Font.BOLD,14));
   add(cardTextField);
   
   JLabel pin = new JLabel("PIN:");
   pin.setFont(new Font("Raieway",Font.BOLD,28));
   pin.setBounds(120, 220, 250, 30);
   add(pin);
   
   pinTextField = new JPasswordField();
   pinTextField.setBounds(300, 220, 230, 30);
   pinTextField.setFont(new Font("Arial",Font.BOLD,14));
   add(pinTextField);
   
   Login = new JButton("SIGN IN ");
   Login.setBounds(300,300,100,30);
   Login.setBackground(Color.BLACK);
   Login.setForeground(Color.WHITE);
   Login.addActionListener(this);
   add(Login);
   
   clear = new JButton("CLEAR");
   clear.setBounds(430,300,100,30);
   clear.setBackground(Color.BLACK);
   clear.setForeground(Color.WHITE);
   clear.addActionListener(this);
   add(clear);
   
   signup = new JButton("SIGN UP");
   signup.setBounds(300,350,230,30);
   signup.setBackground(Color.BLACK);
   signup.setForeground(Color.WHITE);
   signup.addActionListener(this);
   add(signup);
   
   getContentPane().setBackground(Color.white);
   setSize(800,480);
   setVisible(true);
   setLocation(350,200);
   
}
    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource()== clear) 
       {
         cardTextField.setText("");  
         pinTextField.setText("");  
       }else if(ae.getSource() == Login)
       {
           Conn conn = new Conn();
           String cardnumber = cardTextField.getText();
           String pinnumber = pinTextField.getText();
           String query  = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
           try{
               ResultSet rs = conn.s.executeQuery(query);
               if(rs.next()){
                   setVisible(false);
                   new Transaction(pinnumber).setVisible(true);
               }else{
                   JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
               }
           }catch(Exception e){
               System.out.println(e);
           }
           
       }else if(ae.getSource()== signup)
       {
           setVisible(false);
           new SignUpOne().setVisible(true);
           
       }
    }
    public static void main(String args[]) {
        new Login();
    }
}
