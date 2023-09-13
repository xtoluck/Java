package gpapackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Courses {
    private JComboBox cboCourses;
    private JComboBox cboLevel;
    private JComboBox cboSemester;
    private JButton btnRegister;
    private JButton btnExit;
    private JLabel lblCourse1;
    private JPanel pnlCourses;
    private JLabel lblCourse2;
    private JLabel lblCourse3;
    private JLabel lblCourse4;
    private JLabel lblCourse5;
    private JLabel lblCourse6;
    private JLabel lblCourse7;
    private JLabel lblCourse8;


    public static void main(String[] args) {

        JFrame frame = new JFrame("Students' GPA Compiler");
        frame.setContentPane(new Courses().pnlCourses);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public Courses() {

        cboCourses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboCourses.getSelectedItem() == "MTH101") {
                    lblCourse1.setText("MTN101");
                } else if (cboCourses.getSelectedItem() == "MTH102") {
                    lblCourse2.setText("MTN102");
                } else if (cboCourses.getSelectedItem() == "CSC101") {
                    lblCourse3.setText("CSC101");
                } else if (cboCourses.getSelectedItem() == "CSC102") {
                    lblCourse4.setText("CSC102");
                } else if (cboCourses.getSelectedItem() == "GST101") {
                    lblCourse5.setText("GST101");
                } else if (cboCourses.getSelectedItem() == "GST102") {
                    lblCourse6.setText("GST102");
                } else if (cboCourses.getSelectedItem() == "CHM101") {
                    lblCourse7.setText("CHM101");
                } else if
                (cboCourses.getSelectedItem() == "PHY101") {
                    lblCourse8.setText("PHY101");
                } else JOptionPane.showMessageDialog(null, "Oops Error!");
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new gpapackage.StudentsGPA();
            }
        });
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlCourses.setVisible(false);
                new StudentsGPA().main(null);
             }
        });
    }
}
