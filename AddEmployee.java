/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
public class AddEmployee extends JFrame implements ActionListener{
    Random ran=new Random();
    int number=ran.nextInt(999999);
    JTextField tfname,tffname,tfsalary,tfadd,tfphone,tfemail,tfdesg,tfaadhar;
    JDateChooser dcdob;
    JComboBox cbedu;
    JLabel lbempid;
    JButton add,back;
    
    AddEmployee()
    {
        setLayout(null);
        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(280,30,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,35));
        add(heading);
        
        /*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/print.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1150, 600);
        add(image);*/
        
        JLabel labelname=new JLabel("Name");
        labelname.setBounds(50,150,150,30);
        labelname.setFont(new Font("serif",Font.PLAIN,20));
        add(labelname);
        tfname= new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);
        JLabel labelfname=new JLabel("Father's Name");
        labelfname.setBounds(480,150,150,30);
        labelfname.setFont(new Font("serif",Font.PLAIN,20));
        add(labelfname);
        tffname= new JTextField();
        tffname.setBounds(650,150,150,30);
        add(tffname);
        
        JLabel labeldob=new JLabel("Date of Birth");
        labeldob.setBounds(50,200,150,30);
        labeldob.setFont(new Font("serif",Font.PLAIN,20));
        add(labeldob);
        dcdob= new JDateChooser();
        dcdob.setBounds(200,200,150,30);
        add(dcdob);
        
        JLabel lsalary=new JLabel("Salary");
        lsalary.setBounds(480,200,150,30);
        lsalary.setFont(new Font("serif",Font.PLAIN,20));
        add(lsalary);
        tfsalary= new JTextField();
        tfsalary.setBounds(650,200,150,30);
        add(tfsalary);
        
        JLabel ladd=new JLabel("Address");
        ladd.setBounds(50,250,150,30);
        ladd.setFont(new Font("serif",Font.PLAIN,20));
        add(ladd);
         tfadd= new JTextField();
        tfadd.setBounds(200,250,150,30);
        add(tfadd);
        JLabel lphone=new JLabel("Phone No");
        lphone.setBounds(480,250,150,30);
        lphone.setFont(new Font("serif",Font.PLAIN,20));
        add(lphone);
         tfphone= new JTextField();
        tfphone.setBounds(650,250,150,30);
        add(tfphone);
        
        JLabel lemail=new JLabel("Email");
        lemail.setBounds(50,300,150,30);
        lemail.setFont(new Font("serif",Font.PLAIN,20));
        add(lemail);
        tfemail= new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);
        
        JLabel ledu=new JLabel("Highest Education");
        ledu.setBounds(480,300,150,30);
        ledu.setFont(new Font("serif",Font.PLAIN,20));
        add(ledu);
        String Course[]={"Select One","BBA","BCA","BSC","B.COM","BTECH","B.E","MCA","MBA","M.SC","M.A","MTECH","OTHERS"};
        cbedu=new JComboBox(Course);
        cbedu.setBackground(Color.WHITE);
        cbedu.setBounds(650,300,150,30);
        add(cbedu);
        
        JLabel ldesg=new JLabel("Designation");
        ldesg.setBounds(50,350,150,30);
        ldesg.setFont(new Font("serif",Font.PLAIN,20));
        add(ldesg);
        tfdesg= new JTextField();
        tfdesg.setBounds(200,350,150,30);
        add(tfdesg);
        JLabel ladhar=new JLabel("Aadhar Number");
        ladhar.setBounds(480,350,150,30);
        ladhar.setFont(new Font("serif",Font.PLAIN,20));
        add(ladhar);
        tfaadhar= new JTextField();
        tfaadhar.setBounds(650,350,150,30);
        add(tfaadhar);
        
        JLabel lempid=new JLabel("Employee ID");
        lempid.setBounds(50,400,150,30);
        lempid.setFont(new Font("serif",Font.PLAIN,20));
        add(lempid);
        
        lbempid =new JLabel("" + number);
        lbempid.setBounds(200,400,150,30);
        lbempid.setFont(new Font("serif",Font.PLAIN,20));
        add(lbempid);
        
        add = new JButton("Add Details");
        add.setBounds(250,550,150,40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);
         back = new JButton("Back");
        back.setBounds(420,550,150,40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);
        setSize(900,700);
        setLocation(300,50);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String name=tfname.getText();
            String fname=tffname.getText();
            String dob=((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
            String salary=tfsalary.getText();
            String address=tfadd.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            String education=(String)cbedu.getSelectedItem(); 
            String designation=tfdesg.getText();
            String aadhar=tfaadhar.getText();
            String empid;
            empid = lbempid.getText();
            
            
            
            try{
                Conn conn=new Conn();  
                String query = "insert into employee values('" + name + "','" + fname + "','" + dob + "','" + salary + "','" + address + "','" + phone + "','" + email + "','" + education + "','" + designation + "','" + aadhar + "','" + empid + "')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details added successfully");
                new Home();
                setVisible(false);
            } catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }
        else{
            setVisible(false);
            new Home();
        }
    }
    public static void main(String args[]){
        new AddEmployee();
    }
    
}
