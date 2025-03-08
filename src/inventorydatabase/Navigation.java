/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorydatabase;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Acer
 */
public class Navigation {

    private JFrame topFrame;

    public Navigation(JFrame topFrame) {
        this.topFrame = topFrame;
    }

    public void showJavaxPage() {
        if (topFrame != null) {
            topFrame.getContentPane().removeAll();
            topFrame.getContentPane().add(new MainPage()); // Assuming MainPage is the page you want to show
            topFrame.revalidate();
            topFrame.repaint();
        }
    }

    public void hideJavaxPage() {
        if (topFrame != null) {
            topFrame.setVisible(false); // Hide the JFrame or just remove content
            topFrame.dispose();
        }
    }

}
