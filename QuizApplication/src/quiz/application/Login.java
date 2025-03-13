package quiz.application;

import javax.swing.*;
import java.awt.*; //use for cbg color
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton rules,back;//to declare buttons globally
    JTextField tfname;

    Login(){                        //constructor use for making layout of front page
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);

        JLabel heading= new JLabel("QUIZUP GAME");
        heading.setBounds(750,60,300, 45);
        heading.setFont(new Font("Rockwell",Font.BOLD ,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel name= new JLabel("Enter your name");
        name.setBounds(810,150,300, 25);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD ,20));
        name.setForeground(new Color(30,144,254));
        add(name);

        tfname= new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times new Roman", Font.BOLD,20));
        add(tfname);

        rules= new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setBackground(Color.PINK);
        rules.addActionListener(this);
        add(rules);

        back= new JButton("BACK");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setBackground(Color.PINK);
        back.addActionListener(this);
        add(back);



        setSize(1200,500);
        setLocation(200,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name= tfname.getText();
           setVisible(false);
           new Rules(name);
        } else if (ae.getSource()==back) {
            setVisible(false);
        }
    }


    public static void main(String[] args) {
        new Login();

    }
}
