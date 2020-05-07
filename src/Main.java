import java.awt.Component;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {
    
    private static  JPanel ui = new JPanel();
    private static JRadioButton popButton = new JRadioButton("Pop");
    private static  JRadioButton edmButton = new JRadioButton("Electronic");
    private static  JRadioButton countryButton = new JRadioButton("Country");

    private static JButton searchButton = new JButton("Search");
    private static JComboBox artistsComboBox = new JComboBox();

    private static String[] popArtists = {"Taylor Swift", "Pitbull", "Justin Bieber"};
    private static String[] edmArtists = {"Skrillex", "Diplo", "Marshmello"};
    private static String[] countryArtists = {"Keith Urban", "Blake Shelton", "Carrie Underwood"};
    public static void main(String[] args) throws SQLException {

        JFrame frame = new JFrame();
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        genre_box_shower();

        JLabel title = new JLabel("Music Artist Search");
        title.setBounds(106, 5, 370, 27);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(new Font("Lucida Grande", Font.BOLD, 34));

        JLabel header = new JLabel("Select a music genre to search");
        header.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        header.setBounds(131, 66, 289, 27);
        header.setVerticalAlignment(SwingConstants.BOTTOM);

        JLabel header2 = new JLabel("Select a musical artist");
        header2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        header2.setBounds(182, 179, 214, 30);

        ButtonGroup buttonGroup = new ButtonGroup();

        buttonGroup.add(popButton);
        popButton.setBounds(164, 123, 55, 23);

        buttonGroup.add(edmButton);
        edmButton.setBounds(231, 123, 94, 23);

        buttonGroup.add(countryButton);
        countryButton.setBounds(338, 122, 82, 23);

        artistsComboBox.setBounds(207, 236, 163, 27);
        artistsComboBox.setEnabled(true);
        artistsComboBox.setVisible(true);

        searchButton.setBounds(246, 335, 117, 29);
        searchButton.setEnabled(true); //set back to false
        searchButton.setVisible(false);

        ui.setBorder(new EmptyBorder(0, 0, 0, 0));

        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(title);
        frame.getContentPane().add(header);
        frame.getContentPane().add(header2);
        frame.getContentPane().add(popButton);
        frame.getContentPane().add(edmButton);
        frame.getContentPane().add(countryButton);
        frame.getContentPane().add(artistsComboBox);
        frame.getContentPane().add(searchButton);

        frame.getContentPane().add(ui);
        frame.setVisible(true);

    }
    
    /**
      * Implements the actions that take place when the search button is pressed.
      * Collects states from the Radio Button, and Drop-down List.
    */
    private static void genre_box_shower() {
        popButton.addActionListener((java.awt.event.ActionEvent e) -> {
            artistsComboBox.setModel(new DefaultComboBoxModel(popArtists));
            searchButton.setVisible(true);
        });

        edmButton.addActionListener((java.awt.event.ActionEvent e) -> {
            artistsComboBox.setModel(new DefaultComboBoxModel(edmArtists));
            searchButton.setVisible(true);
        });

        countryButton.addActionListener((java.awt.event.ActionEvent e) -> {
            artistsComboBox.setModel(new DefaultComboBoxModel(countryArtists));
            searchButton.setVisible(true);
        });

        searchButton.addActionListener((java.awt.event.ActionEvent e) -> {
            String chosen_artist = (String) artistsComboBox.getSelectedItem();
            
            System.out.println("SEARCH FOR: " + chosen_artist);
            searchButton.setVisible(true);
            Profile artisitPage = new Profile();
            artisitPage.getArtist(chosen_artist);
            artisitPage.setArtist();
        });
    }

}
