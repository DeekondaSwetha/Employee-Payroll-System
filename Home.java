
package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Home extends JFrame implements ActionListener{
    JButton view,add,update,remove,back;
    Home()
    {
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(650,20,400,40);
        heading.setFont(new Font("TAHDMA",Font.BOLD,25));
        image.add(heading);
        
        add = new JButton("Add Employee");
        add.setBounds(680,80,150,40);
        add.addActionListener(this);
        image.add(add);
        
        view= new JButton("View Employee");
        view.setBounds(850,80,150,40);
        view.addActionListener(this);
        image.add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(680,150,150,40);
        update.addActionListener(this);
        image.add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(850,150,150,40);
        remove.addActionListener(this);
        image.add(remove);
        
        back = new JButton("Back");
        back.setBounds(850,500,150,40);
        back.addActionListener(this);
        image.add(back);
        
        setSize(1120,630);
        setLocation(250,100);
        setVisible(true);
        
    }
    @Override
    public  void actionPerformed(ActionEvent  ae){
     if(ae.getSource() == add){
         setVisible(false);
         new AddEmployee();
     }
     else if(ae.getSource()== view){
         setVisible(false);
         new ViewEmployee();
    }
    else if(ae.getSource()== update){
        setVisible(false);
        new ViewEmployee();
     }
    else if(ae.getSource()== remove){
    setVisible(false);
    new RemoveEmployee();
    }
    else{
     new Splash();    
    }
    }
    public static void main(String args[])
    {
        new Home();
    }


    
}
