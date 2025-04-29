package com.ananya.sportal.gui;

import com.ananya.sportal.db.DatabaseConnection;
import com.ananya.sportal.model.Student;

import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class MainPanel extends JFrame {
    private JTextField nameField;
    private JTextField sapField;
    private JTextField contactField;
    private JButton saveButton;

    public MainPanel() {
        setTitle("SAP Portal");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 30, 80, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(120, 30, 200, 25);
        add(nameField);

        JLabel sapLabel = new JLabel("SAP ID:");
        sapLabel.setBounds(20, 70, 80, 25);
        add(sapLabel);

        sapField = new JTextField();
        sapField.setBounds(120, 70, 200, 25);
        add(sapField);

        JLabel contactLabel = new JLabel("Contact:");
        contactLabel.setBounds(20, 110, 80, 25);
        add(contactLabel);

        contactField = new JTextField();
        contactField.setBounds(120, 110, 200, 25);
        add(contactField);

        saveButton = new JButton("Save Student");
        saveButton.setBounds(120, 170, 200, 30);
        add(saveButton);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveStudent();
            }
        });
    }

    private void saveStudent() {
        String name = nameField.getText();
        String sap = sapField.getText();
        String contact = contactField.getText();
        Student student = new Student(name, sap, contact);

        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO students (name, sap, contact) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, student.getName());
            stmt.setString(2, student.getSap());
            stmt.setString(3, student.getContact());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student Saved Successfully!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
}
