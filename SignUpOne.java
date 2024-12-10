package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
//import com.toedter.calendar.JDateChooser;


public class SignUpOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField, FnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JButton next;
    JRadioButton male, Female, married,unmarried, other;
   SignUpOne()
{
    setLayout(null);
    
    Random ran = new Random();
    random = Math.abs((ran.nextLong() % 9000L)+ 1000L);
    
    JLabel formno = new JLabel("APPLICATION  FORM  NO. " +random);
    formno.setFont(new Font("Raleway",Font.BOLD,36));
    formno.setBounds(140, 20, 600, 40);
    add(formno);
    
    JLabel PersonalDetails = new JLabel("Page 1: PersonalDetails ");
    PersonalDetails.setFont(new Font("Raleway",Font.BOLD,22));
    PersonalDetails.setBounds(290, 80, 400, 30);
    add(PersonalDetails);
    
    JLabel Name = new JLabel("Name: ");
    Name.setFont(new Font("Raleway",Font.BOLD,20));
    Name.setBounds(100, 140, 100, 30);
    add(Name);
    
    nameTextField = new JTextField();
    nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
    nameTextField.setBounds(300, 140, 400, 30);
    add(nameTextField);
    
    
    JLabel Fname = new JLabel("Father's Name: ");
    Fname.setFont(new Font("Raleway",Font.BOLD,20));
    Fname.setBounds(100, 190, 200, 30);
    add(Fname);
    
    FnameTextField = new JTextField();
    FnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
    FnameTextField.setBounds(300, 190, 400, 30);
    add(FnameTextField);
    
//    JLabel DOB = new JLabel("Date of Birth:");
//    DOB.setFont(new Font("Raleway",Font.BOLD,20));
//    DOB.setBounds(100, 240, 200, 30);
//    add(DOB);
    
//    JDateChooser dateChooser = new JDatechooser();
//    dateChooser.setBounds(300,240,400,30);
//    dateChooser.setForeground(color.Black);
//    add(dateChooser);
    
    JLabel Gender = new JLabel("Gender:");
    Gender.setFont(new Font("Raleway",Font.BOLD,20));
    Gender.setBounds(100, 290, 200, 30);
    add(Gender);
    
    male = new JRadioButton("Male");
    male.setBounds(300, 290, 60, 30);
    male.setBackground(Color.white);
    add(male);
    
    Female = new JRadioButton("Female");
    Female.setBounds(450, 290, 80, 30);
    Female.setBackground(Color.white);
    add(Female);
    
    ButtonGroup gendergroup = new ButtonGroup();
    gendergroup.add(male);
    gendergroup.add(Female);
    
    
    JLabel email = new JLabel("Email Adddress:");
    email.setFont(new Font("Raleway",Font.BOLD,20));
    email.setBounds(100, 340, 200, 30);
    add(email);
    
    emailTextField = new JTextField();
    emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
    emailTextField.setBounds(300, 340, 400, 30);
    add(emailTextField);
    
    JLabel marital = new JLabel("Marital Status:");
    marital.setFont(new Font("Raleway",Font.BOLD,20));
    marital.setBounds(100, 390, 200, 30);
    add(marital);
    
    married = new JRadioButton("Married");
    married .setBounds(300, 390, 100, 30);
    married .setBackground(Color.white);
    add(married);
    
    unmarried = new JRadioButton("Unmarried");
    unmarried.setBounds(450, 390, 100, 30);
    unmarried.setBackground(Color.white);
    add(unmarried);
    
    other = new JRadioButton("Other");
    other.setBounds(630, 390, 100, 30);
    other.setBackground(Color.white);
    add(other);
    
    ButtonGroup maritalgroup = new ButtonGroup();
    maritalgroup.add(married);
    maritalgroup.add(unmarried);
    maritalgroup.add(other);
    
    JLabel address = new JLabel("Address:");
    address.setFont(new Font("Raleway",Font.BOLD,20));
    address.setBounds(100, 440, 200, 30);
    add(address);
    
    addressTextField = new JTextField();
    addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
    addressTextField.setBounds(300, 440, 400, 30);
    add(addressTextField);
    
    JLabel city = new JLabel("City:");
    city.setFont(new Font("Raleway",Font.BOLD,20));
    city.setBounds(100, 490, 200, 30);
    add(city);
    
    cityTextField = new JTextField();
    cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
    cityTextField.setBounds(300, 490, 400, 30);
    add(cityTextField);
    
     JLabel state = new JLabel("State:");
    state.setFont(new Font("Raleway",Font.BOLD,20));
    state.setBounds(100, 540, 200, 30);
    add(state);
    
    stateTextField = new JTextField();
    stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
    stateTextField.setBounds(300, 540, 200, 30);
    add(stateTextField);
    
    JLabel pincode = new JLabel("Pin Code:");
    pincode.setFont(new Font("Raleway",Font.BOLD,20));
    pincode.setBounds(100, 590, 200, 30);
    add(pincode);
    
    pinTextField = new JTextField();
    pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
    pinTextField.setBounds(300, 590, 400, 30);
    add(pinTextField);
    
    next = new JButton("Next");
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setFont(new Font("Raleway", Font.BOLD, 14));
    next.setBounds(620, 660, 80, 30);
    next.addActionListener(this);
    add(next);
    

    
    getContentPane().setBackground(Color.WHITE);
    setSize(850,800);
    setLocation(350,10);
    setVisible(true);
}
   public void actionPerformed(ActionEvent ae) {
    String formno = ""+random;
    String name = nameTextField.getText();
    String fname = FnameTextField.getText();
    String gender = null;
    if (male.isSelected()) {
        gender = "Male";
    } else if (Female.isSelected()) {
        gender = "Female";
    }
    String email = emailTextField.getText();
    
    // Corrected marital variable
    String marital = null;  
    if (married.isSelected()) {
        marital = "Married";
    } else if (unmarried.isSelected()) {
        marital = "Unmarried";
    } else if (other.isSelected()) {
        marital = "Other";
    }
    
    String address = addressTextField.getText();
    String city = cityTextField.getText();
    String state = stateTextField.getText();
    String pin = pinTextField.getText();

    try {
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name is Required");
        } else {
            Conn c = new Conn();
            String query = "INSERT INTO signup (formno, name, fname, gender, email, marital, address, city, pin, state) VALUES ('" + formno + "' , '" + name + "','" + fname + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + pin + "','" + state + "')";
            c.s.executeUpdate(query);
            setVisible(false);
            new SignUp2(formno).setVisible(true);
        }
    } catch (Exception e) {
        System.out.println(e);
    }
}

   
    
    public static void main(String args[]) {
        new SignUpOne(); 
    }
}

