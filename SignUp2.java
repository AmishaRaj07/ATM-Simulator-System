package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class SignUp2 extends JFrame implements ActionListener{
    
    JTextField PAN, Aadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion,category,occupation,education,income;
    String formno;
    
    SignUp2(String formno){
        this.formno = formno;
    }
{
    setLayout(null);
    setTitle("NEW ACCOUNT APPLICATION FORM - PAGE2");
    
    JLabel AdditionalDetails = new JLabel("Page 2: Additional Details ");
    AdditionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
    AdditionalDetails.setBounds(290, 80, 400, 30);
    add(AdditionalDetails);
    
    JLabel Religion = new JLabel("Religion: ");
    Religion.setFont(new Font("Raleway",Font.BOLD,20));
    Religion.setBounds(100, 140, 100, 30);
    Religion.setBackground(Color.WHITE);
    add(Religion);
    
    String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
    religion = new JComboBox(valReligion);
    religion.setBounds(300, 140, 400, 30);
    religion.setBackground(Color.WHITE);
    add(religion);
    
    JLabel Category = new JLabel("Category: ");
    Category.setFont(new Font("Raleway",Font.BOLD,20));
    Category.setBounds(100, 190, 200, 30);
    add(Category);
    
    String castcategory[] = {"General","OBC","SC","ST","other"};
    category = new JComboBox(castcategory);
    category.setBounds(300, 190, 400, 30);
    category.setBackground(Color.WHITE);
    add(category);
    
    JLabel Income = new JLabel("Income:");
    Income.setFont(new Font("Raleway",Font.BOLD,20)); 
    Income.setBounds(100, 240, 200, 30); 
    add(Income);  
    
    String incomeCategory[] = {"Null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
    income = new JComboBox(incomeCategory);
    income.setBounds(300, 240, 400, 30);
    income.setBackground(Color.WHITE);
    add(income);
   
    JLabel Educational = new JLabel("Educational");
    Educational.setFont(new Font("Raleway",Font.BOLD,20));
    Educational.setBounds(100, 290, 200, 30);
    add(Educational);
    
    JLabel Qualification = new JLabel("Qualification:");
    Qualification.setFont(new Font("Raleway",Font.BOLD,20));
    Qualification.setBounds(100, 315, 200, 30);
    add(Qualification);
    
    String educationValues[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","others"};
    education = new JComboBox(educationValues);
    education.setBounds(300, 390, 400, 30);
    education.setBackground(Color.WHITE);
    add(education);
    
    JLabel Occupation = new JLabel("Occupation:");
    Occupation.setFont(new Font("Raleway",Font.BOLD,20));
    Occupation.setBounds(100, 390, 200, 30);
    add(Occupation);
    
    String occupationValues[] = {"Salaried","Self-Employed","Business","Student","Retired","Others"};
    occupation = new JComboBox(occupationValues);
    occupation.setBounds(300, 315, 400, 30);
    occupation.setBackground(Color.WHITE);
    add(occupation); 
    
    JLabel PANNumber = new JLabel("PAN Number : ");
    PANNumber.setFont(new Font("Raleway",Font.BOLD,20));
    PANNumber.setBounds(100, 440, 200, 30);
    add(PANNumber);
    
    PAN = new JTextField();
    PAN.setFont(new Font("Raleway",Font.BOLD,14));
    PAN.setBounds(300, 440, 400, 30);
    add(PAN);
    
    JLabel AadharNumber = new JLabel("Aadhar Number:");
    AadharNumber.setFont(new Font("Raleway",Font.BOLD,20));
    AadharNumber.setBounds(100, 490, 200, 30);
    add(AadharNumber);
    
    Aadhar = new JTextField();
    Aadhar.setFont(new Font("Raleway",Font.BOLD,14));
    Aadhar.setBounds(300, 490, 400, 30);
    add(Aadhar);
    
    JLabel seniorcitizen = new JLabel("Senior Citizen:");
    seniorcitizen.setFont(new Font("Raleway",Font.BOLD,20));
    seniorcitizen.setBounds(100, 540, 200, 30);
    add(seniorcitizen);
    
    syes = new JRadioButton("Yes");
    syes .setBounds(300, 540, 100, 30);
    syes .setBackground(Color.white);
    add(syes );
    
    sno = new JRadioButton("No");
    sno.setBounds(450, 540, 100, 30);
    sno.setBackground(Color.white);
    add(sno);
    
    ButtonGroup seniorGroup = new ButtonGroup();
    seniorGroup.add(syes);
    seniorGroup.add(sno);

    JLabel ExistingAccount = new JLabel("Existing Account:");
    ExistingAccount.setFont(new Font("Raleway",Font.BOLD,20));
    ExistingAccount.setBounds(100, 590, 200, 30);
    add(ExistingAccount);
    
    eyes = new JRadioButton("Yes");
    eyes .setBounds(300, 590, 100, 30);
    eyes .setBackground(Color.white);
    add(eyes );
    
    eno = new JRadioButton("No");
    eno.setBounds(450, 590, 100, 30);
    eno.setBackground(Color.white);
    add(eno);
    
    ButtonGroup eseniorGroup = new ButtonGroup();
    eseniorGroup.add(eyes);
    eseniorGroup.add(eno);

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
    
    String sreligion = (String)religion.getSelectedItem();
    String scategory = (String)category.getSelectedItem();
    String sincome = (String)income.getSelectedItem();
    String seducation = (String)education.getSelectedItem();
    String soccupation = (String)occupation.getSelectedItem();
    String seniorcitizen = null;
    if (syes.isSelected()) {
        seniorcitizen = "Yes";
    } else if (sno.isSelected()) {
        seniorcitizen = "No";
    }
    
    String existingaccount = null;  
    if (eyes.isSelected()) {
        existingaccount = "Yes";
    } else if (eno.isSelected()) {
        existingaccount = "No";
    } 
    
    
    String span = PAN.getText();
    String saadhar = Aadhar.getText();
    

    try {
         Conn c = new Conn();
            String query = "INSERT INTO signUp2 (formno, religion, category, income, education, occupation, pan, aadhar, seniorcitizen, existingaccount) VALUES ('" + formno + "' , '" + sreligion + "','" + scategory + "','" + sincome + "','" + seducation + "','" + soccupation + "','" + span + "','" + saadhar + "','" + seniorcitizen + "','" + existingaccount + "')";

            c.s.executeUpdate(query);
            
            
        new SignUp3(formno).setVisible(true);
    } catch (Exception e) {
        System.out.println(e);
    }
}

   
    
    public static void main(String args[]) {
        new SignUp2(""); 
    }
}
