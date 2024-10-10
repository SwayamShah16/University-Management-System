package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField textField;
    JPasswordField passwordField;
    JButton b1,b2;

    Login(){

        JLabel namelabel = new JLabel("Username");
        namelabel.setBounds(40,20,100,30);
        namelabel.setFont(new Font("Tahoma",Font.BOLD,16));
        namelabel.setForeground(Color.BLACK);
        add(namelabel);

        JLabel password = new JLabel("Password");
        password.setBounds(40,70,100,30);
        password.setFont(new Font("Tahoma",Font.BOLD,16));
        password.setForeground(Color.BLACK);
        add(password);

        textField = new JTextField();
        textField.setBounds(150,20,150,30);
        textField.setFont(new Font("Tahoma",Font.PLAIN,15));
        textField.setBackground(new Color(255,179,0));
        add(textField);

        passwordField = new JPasswordField();
        passwordField.setBounds(150,70,150,30);
        passwordField.setFont(new Font("Tahoma",Font.PLAIN,15));
        passwordField.setBackground(new Color(255,179,0));
        add(passwordField);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icons/university.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(250,270,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(300,0,400,300);
        add(label);

        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(new Color(109,164,170));
        setSize(750,300);
        setLocation(400,270);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == b1){
            try{
               Database d =new Database();
               String user = textField.getText();
               String password = passwordField.getText();

               String q= "select * from login where ID ='"+user+"' and PW = '"+password+"'";
                ResultSet resultset = d.statement.executeQuery(q);

                if(resultset.next()){
                    new Homepage();
                    setVisible(false);
                }
               else{
                   JOptionPane.showMessageDialog(null,"Invalid");
                }
            }
            catch(Exception E){
                E.printStackTrace();
            }
        }
        else{
            System.exit(100);
        }

    }
    public static void main(String[] args){
        new Login();
    }
}
