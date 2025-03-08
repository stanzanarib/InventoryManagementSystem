/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorydatabase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class LoginPage extends JPanel {
   private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel statusLabel;

    public LoginPage() {
        initComponents();
        
    }

    private void initComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel usernameLabel = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(usernameLabel, gbc);

        usernameField = new JTextField(15);
        gbc.gridx = 1;
        add(usernameField, gbc);

        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(passwordLabel, gbc);

        passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        add(passwordField, gbc);

        loginButton = new JButton("Login");
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(loginButton, gbc);

        statusLabel = new JLabel(" ");
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(statusLabel, gbc);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogin();
            }
        });
    }

private void handleLogin() {
    
    statusLabel.setText("");
    String username = usernameField.getText();
    String password = new String(passwordField.getPassword());

    // Validate input (optional)
    if (username.isEmpty() || password.isEmpty()) {
        statusLabel.setText("Username or password cannot be empty.");
        return;
    }

    // Connect to the database
    try (Connection connection = DatabaseConnection.getConnection()) {
        // SQL query to check if the username and password match
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);

            // Execute the query
            ResultSet rs = stmt.executeQuery();

            // Check if a matching record is found
            if (rs.next()) {
              statusLabel.setForeground(Color.BLUE);  
              statusLabel.setText("Login successful!");
              
              showMainPage();
            } else {
                // No match found
                statusLabel.setForeground(Color.red);
                statusLabel.setText("Invalid username or password.");
            }
        }catch(Exception e){
            System.out.println("Error");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        statusLabel.setText("Error connecting to the database.");
    }
}


private void showMainPage() {
    JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
    topFrame.getContentPane().removeAll();
    topFrame.getContentPane().add(new MainPage());
    topFrame.revalidate();
    topFrame.repaint();
  }
}
