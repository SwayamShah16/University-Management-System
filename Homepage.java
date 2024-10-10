package university.management.system;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homepage extends JFrame implements ActionListener {

    Homepage() {

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 1550, 1090);
        panel1.setBackground(new Color(7, 7, 112));
        add(panel1);


        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("Icons/1209519.jpg"));
        Image image1 = i11.getImage().getScaledInstance(1550, 1100, Image.SCALE_DEFAULT);
        ImageIcon i22 = new ImageIcon(image1);
        JLabel label1 = new JLabel(i22);
        label1.setBounds(0, 0, 1550, 1090);
        add(label1);
        panel1.add(label1);

        JMenuBar mb = new JMenuBar();

        //New Information
        JMenu newInfo = new JMenu("New Information");
        newInfo.setForeground(Color.BLACK);
        mb.add(newInfo);

        JMenuItem newFaculty = new JMenuItem("New Faculty Information");
        newFaculty.setBackground(Color.WHITE);
        newInfo.add(newFaculty);

        JMenuItem newStudent = new JMenuItem("New Student Information");
        newStudent.setBackground(Color.WHITE);
        newInfo.add(newStudent);

        //Details
        JMenu details = new JMenu("View Details");
        newInfo.setForeground(Color.BLACK);
        mb.add(details);

        JMenuItem viewFaculty = new JMenuItem("View Faculty Information");
        viewFaculty.setBackground(Color.WHITE);
        details.add(viewFaculty);

        JMenuItem viewStudent = new JMenuItem("View Student Information");
        viewStudent.setBackground(Color.WHITE);
        details.add(viewStudent);

        //Leave
        JMenu leave = new JMenu("Apply leave");
        leave.setForeground(Color.BLACK);
        mb.add(leave);

        JMenuItem FacultyLeave = new JMenuItem(" Faculty Leave");
        FacultyLeave.setBackground(Color.WHITE);
        leave.add(FacultyLeave);

        JMenuItem StudentLeave = new JMenuItem("Student Leave");
        StudentLeave.setBackground(Color.WHITE);
        leave.add(StudentLeave);

        //Leave Details
        JMenu leaveDetails = new JMenu(" Leave Details");
        leaveDetails.setForeground(Color.BLACK);
        mb.add(leaveDetails);

        JMenuItem FacultyLeaveDetails = new JMenuItem(" Faculty Leave Details");
        FacultyLeaveDetails.setBackground(Color.WHITE);
        leaveDetails.add(FacultyLeaveDetails);

        JMenuItem StudentLeaveDetails = new JMenuItem("Student Leave Details");
        StudentLeaveDetails.setBackground(Color.WHITE);
        leaveDetails.add(StudentLeaveDetails);

        //Exams
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLACK);
        mb.add(exam);

        JMenuItem ExaminationDetail = new JMenuItem("Examination Details ");
        ExaminationDetail.setBackground(Color.WHITE);
        exam.add(ExaminationDetail);

        JMenuItem EnterMarks = new JMenuItem("Examination Marks");
        EnterMarks.setBackground(Color.WHITE);
        exam.add(EnterMarks);

        //UpdateInfo
        JMenu UpdateInfo = new JMenu("Update Details");
        UpdateInfo.setForeground(Color.BLACK);
        mb.add(UpdateInfo);

        JMenuItem UpdateFacultyInfo = new JMenuItem("Update Faculty Information");
        UpdateFacultyInfo.setBackground(Color.WHITE);
        UpdateInfo.add(UpdateFacultyInfo);

        JMenuItem UpdateStudentInfo = new JMenuItem("Update Student Information");
        UpdateStudentInfo.setBackground(Color.WHITE);
        UpdateInfo.add(UpdateStudentInfo);

        //fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLACK);
        mb.add(fee);

        JMenuItem feeStructure = new JMenuItem("Fee Structure");
        feeStructure.setBackground(Color.WHITE);
        fee.add(feeStructure);

        JMenuItem feeForm = new JMenuItem("Student Fee Form");
        feeForm.setBackground(Color.WHITE);
        fee.add(feeForm);

        //utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLACK);
        mb.add(utility);

        JMenuItem Calculator = new JMenuItem("Calculator");
        Calculator.setBackground(Color.WHITE);
        Calculator.addActionListener(this);
        utility.add(Calculator);

        JMenuItem Notepad = new JMenuItem("Notepad");
        Notepad.setBackground(Color.WHITE);
        Notepad.addActionListener(this);
        utility.add(Notepad);

        //about
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLACK);
        mb.add(about);

        JMenuItem About = new JMenuItem("About");
        About.setBackground(Color.WHITE);
        about.add(About);

        //Exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLACK);
        mb.add(exit);

        JMenuItem Exit = new JMenuItem("Exit");
        Exit.setBackground(Color.WHITE);
        Exit.addActionListener(this);
        exit.add(Exit);

        setJMenuBar(mb);

        setSize(1950, 1090);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String sm= e.getActionCommand();
         if(sm.equals("Exit")){
           System.exit(200);
         } else if(sm.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }
            catch(Exception E) {
              E.printStackTrace();
           }
         } else if(sm.equals("Notepad")){
           try{
               Runtime.getRuntime().exec("notepad.exe");
           }
           catch(Exception E) {
               E.printStackTrace();
           }
         }
    }
    public static void main(String[] args) {
        new Homepage();
    }
}