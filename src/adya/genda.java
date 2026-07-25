package adya;

import javax.swing.*;
import java.awt.*;

public class genda {


    public static class Rose extends JFrame {

        public Rose() {
            setTitle("Rose Image Display");
            setSize(600, 400); // Adjust size as needed
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null); // Center the window

            // Load the image
            ImageIcon roseIcon = new ImageIcon("rose.jpg"); // Make sure this path is correct
            JLabel imageLabel = new JLabel(roseIcon);

            // Add image to the frame
            add(imageLabel);
        }

        public static void main(String[] args) {
            // Schedule the UI creation for the event-dispatching thread
            SwingUtilities.invokeLater(() -> {
                Rose frame = new Rose();
                frame.setVisible(true);
            });
        }
    }

}
