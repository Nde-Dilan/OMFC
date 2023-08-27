package users;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class finall extends JFrame {
    private JTextField searchField;
    private JTextArea resultsArea;
    private JButton searchButton;

    public finall() {
        // Initialize the GUI components
        searchField = new JTextField(20);
        resultsArea = new JTextArea(10, 30);
        searchButton = new JButton("Search");

        // Add action listener to the search button
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String searchTerm = searchField.getText();
                // Call the method to perform the search
                performSearch(searchTerm);
            }
        });

        // Create a panel and add components to it
        JPanel panel = new JPanel();
        panel.add(new JLabel("Search: "));
        panel.add(searchField);
        panel.add(searchButton);

        // Set layout and add the panel and results area to the frame
        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(resultsArea), BorderLayout.CENTER);

        setTitle("Online Marketplace");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void performSearch(String searchTerm) {
      // Perform the actual search based on the searchTerm
      
      // Example: Displaying dummy results in the results area
      resultsArea.setText("");
      resultsArea.append("Results for: " + searchTerm + "\n");
     
    }

    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
           public void run() {              
               new finall().setVisible(true);
           }
       });
    }
}