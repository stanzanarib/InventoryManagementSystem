/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorydatabase;

import javax.swing.JFrame;

/**
 *
 * @author Acer
 */
public class InventoryDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame start = new JFrame("Inventory Management System");
        start.setSize(1900, 800);
        start.setSize(1900, 800);
        start.setLocationRelativeTo(null); // Center the window on the screen

        // Add the LoginPage JPanel to the frame
        LoginPage loginPage = new LoginPage();
        
        
        start.add(loginPage);

        // Make the frame visible
        start.setVisible(true);


    }
}
