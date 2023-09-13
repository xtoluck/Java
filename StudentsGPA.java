package gpapackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class StudentsGPA {
    private JTextField txtStdName;
    private JButton btnCompute;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JTextField txtGrade;
    private JPanel pnlMain;
    private JButton registerCoursesButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField txtUnit1;
    private JTextField txtUnit2;
    private JTextField txtUnit3;
    private JTextField txtUnit4;
    private JTextField txtUnit5;
    private JTextField txtUnit6;
    private JTextField txtUnit7;
    private JTextField txtUnit8;
    private JTextField textField18;
    private JTextField textField19;
    private JTextField textField20;
    private JTextField textField21;
    private JTextField textField22;
    private JTextField textField23;
    private JTextField textField24;
    private JTextField textField25;
    private JTextField textField26;
    private JTextField textField27;
    private JTextField textField28;
    private JTextField textField29;
    private JTextField textField30;
    private JTextField textField31;
    private JTextField textField32;
    private JTextField textField33;
    private JTextField textField35;
    private JTextField txtTotalUnit;
    private JTextField textField34;
    private JTextField textField37;
    private JTextField txtCourse1;
    private JTextField txtCourse2;
    private JTextField txtCourse3;
    private JTextField txtCourse4;
    private JTextField txtCourse5;
    private JTextField txtCourse6;
    private JTextField txtCourse7;
    private JTextField txtCourse8;
    private JComboBox cboCombo;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Students' GPA Compiler");
        frame.setContentPane(new StudentsGPA().pnlMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public StudentsGPA() {
        registerCoursesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cboCombo.addActionListener(new ActionListener() {
            private boolean equals;

            @Override
            public void actionPerformed(ActionEvent e) {

                //Check if "Select Courses" was selected from the combo box. If so, please display "Invalid Input!"
                if (Objects.equals(Objects.requireNonNull(cboCombo.getSelectedItem()).toString(), "Select Courses")) {
                    JOptionPane.showMessageDialog(null, "Invalid Input!");
                }
                //if "Select Courses" was not selected from the combo box, then do the following:
                else {
                    if (txtCourse1.getText().contains(cboCombo.getSelectedItem().toString())) {
                        JOptionPane.showMessageDialog(null, "Duplicate value!");
                    } else if (txtCourse1.getText().contains(cboCombo.getSelectedItem().toString())) {
                        JOptionPane.showMessageDialog(null, "Duplicate value!");
                    } else if (txtCourse2.getText().contains(cboCombo.getSelectedItem().toString())) {
                        JOptionPane.showMessageDialog(null, "Duplicate value!");
                    } else if (txtCourse3.getText().contains(cboCombo.getSelectedItem().toString())) {
                        JOptionPane.showMessageDialog(null, "Duplicate value!");
                    } else if (txtCourse4.getText().contains(cboCombo.getSelectedItem().toString())) {
                        JOptionPane.showMessageDialog(null, "Duplicate value!");
                    } else if (txtCourse5.getText().contains(cboCombo.getSelectedItem().toString())) {
                        JOptionPane.showMessageDialog(null, "Duplicate value!");
                    } else if (txtCourse6.getText().contains(cboCombo.getSelectedItem().toString())) {
                        JOptionPane.showMessageDialog(null, "Duplicate value!");
                    } else if (txtCourse7.getText().contains(cboCombo.getSelectedItem().toString())) {
                        JOptionPane.showMessageDialog(null, "Duplicate value!");
                    } else if (txtCourse8.getText().contains(cboCombo.getSelectedItem().toString())) {
                        JOptionPane.showMessageDialog(null, "Duplicate value!");

                    } else if (txtCourse1.getText().isEmpty()) {
                        txtCourse1.setText(cboCombo.getSelectedItem().toString());
                        txtUnit1.setText("A");

                    } else if (txtCourse2.getText().isEmpty()) {
                        txtCourse2.setText(cboCombo.getSelectedItem().toString());
                    } else if (txtCourse3.getText().isEmpty()) {
                        txtCourse3.setText(cboCombo.getSelectedItem().toString());
                    } else if (txtCourse4.getText().isEmpty()) {
                        txtCourse4.setText(cboCombo.getSelectedItem().toString());
                    } else if (txtCourse5.getText().isEmpty()) {
                        txtCourse5.setText(cboCombo.getSelectedItem().toString());
                    } else if (txtCourse6.getText().isEmpty()) {
                        txtCourse6.setText(cboCombo.getSelectedItem().toString());
                    } else if (txtCourse7.getText().isEmpty()) {
                        txtCourse7.setText(cboCombo.getSelectedItem().toString());
                    } else if (txtCourse8.getText().isEmpty()) {
                        txtCourse8.setText(cboCombo.getSelectedItem().toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "All the fields fully filled!", "Alert!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    ;
                }
            }
        });
    }
}
