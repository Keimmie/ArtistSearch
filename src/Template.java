import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Template extends JFrame {

    private final JLayeredPane contentPane;
    private JTable table;
    static Template obj = new Template();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Template frame = new Template();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Template() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 749, 526);
        contentPane = new JLayeredPane();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel title = new JLabel("Music Artist Search");
        title.setFont(new Font("Lucida Grande", Font.PLAIN, 34));
        title.setBounds(122, 6, 322, 41);
        contentPane.add(title);

        JButton return_btn = new JButton("Home");
        return_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        return_btn.setBounds(496, 39, 81, 29);
        contentPane.add(return_btn);

        JLabel bio = new JLabel("Biography");
        bio.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        bio.setBounds(266, 82, 81, 29);
        contentPane.add(bio);

        JLabel AlbumLbl = new JLabel("Albums");
        AlbumLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        AlbumLbl.setBounds(266, 268, 75, 20);
        contentPane.add(AlbumLbl);

    }

    /**
     * Keith's Profile
     */
    public void KeithProfile() {
        JTextPane Bio = new JTextPane();
        Bio.setText("Keith Lionel Urban (born 26 October 1967) is a New Zealand-Australian singer, songwriter and record producer well known for his work in country music. "
                + "In 1991, he released a self-titled debut album and charted four singles in Australia before moving to the United States the following year. ");
        Bio.setBackground(UIManager.getColor("Button.background"));
        Bio.setEditable(false);
        Bio.setBounds(266, 138, 431, 110);
        contentPane.add(Bio);

        JTextPane Desc = new JTextPane();
        Desc.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        Desc.setText("Full Name: Keith Lionel Urban"
                + "\nDate of Birth: October 26, 1967"
                + "\nPlace of Birth: Whangarei, Northland, New Zealand"
                + "\nYears Active: 1990 - Present"
                + "\n\nInstagram: @KeithUrban"
                + "\nTwitter: @KeithUrban");
        Desc.setBackground(SystemColor.window);
        Desc.setEditable(false);
        Desc.setBounds(20, 345, 234, 125);
        contentPane.add(Desc);

        JLabel Artist_name = new JLabel("Keith Urban");
        Artist_name.setFont(new Font("Dialog", Font.PLAIN, 13));
        Artist_name.setBounds(64, 86, 100, 22);
        contentPane.add(Artist_name);

        // Data to be displayed in the JTable 
        String[][] data = {
            {"Title", "Release Date", "# Tracks"},
            {"Graffiti U", "April 27, 2018", "15"},
            {"Ripcord", "May 6, 2016", "13"},
            {"Fuse", "September 10, 2013", "11"},
            {"Get Closer", "November 16, 2010", "8"},
            {"Defying Gravity", "March 31, 2009", "11"},
            {"Love, Pain & the Whole Crazy Thing", "November 7, 2006", "13"},
            {"Be Here", "September 21, 2004", "13"},
            {"Golden Road", "October 8, 2002", "13"},
            {"Keith Urban II", "October 19, 1999", "12"},
            {"Keith Urban", "September 23, 1991", "15"}
        };
        // Column Names 
        String[] columnNames = {"Title", "Release Date", "# Tracks"};

        table = new JTable(data, columnNames);
        table.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        table.setEnabled(false);
        table.setRowSelectionAllowed(false);
        table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        table.setBackground(UIManager.getColor("Button.background"));
        table.setBounds(280, 300, 392, 181);
        contentPane.add(table);

        JLabel Photo = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("KeithUrban.jpg")).getImage();
        Photo.setIcon(new ImageIcon(img));
        Photo.setBounds(20, 123, 193, 210);
        contentPane.add(Photo);

    }

    /**
     * Marshes Profile
     */
    public void MarshProfile() {
        JTextPane Bio = new JTextPane();
        Bio.setText("Christopher Comstock (born May 19, 1992), known professionally as Marshmello, is an American electronic music producer and DJ. "
                + "He first gained international recognition by releasing remixes of songs by American DJ duo Jack Ü and Russian-German DJ Zedd.");
        Bio.setBackground(UIManager.getColor("Button.background"));
        Bio.setEditable(false);
        Bio.setBounds(266, 138, 431, 110);
        contentPane.add(Bio);

        JTextPane Desc = new JTextPane();
        Desc.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        Desc.setText("Full Name: Christopher Comstock"
                + "\nDate of Birth: May 19, 1992"
                + "\nPlace of Birth: Philadelphia, Pennsylvania"
                + "\nYears Active: 2015 - Present"
                + "\n\nInstagram: @MarshmelloMusic"
                + "\nTwitter: @MarshmelloMusic");
        Desc.setBackground(SystemColor.window);
        Desc.setEditable(false);
        Desc.setBounds(20, 345, 234, 125);
        contentPane.add(Desc);

        JLabel Artist_name = new JLabel("Marshmello");
        Artist_name.setFont(new Font("Dialog", Font.PLAIN, 13));
        Artist_name.setBounds(64, 86, 81, 22);
        contentPane.add(Artist_name);

        // Data to be displayed in the JTable 
        String[][] data = {
            {"Title", "Release Date", "# Tracks"},
            {"Joytime III", "July 2, 2019", "13"},
            {"Joytime II", "June 22, 2018", "9"},
            {"Joytime", "January 8, 2016", "10"}
        };

        // Column Names 
        String[] columnNames = {"Title", "Release Date", "# Tracks"};

        table = new JTable(data, columnNames);
        table.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        table.setEnabled(false);
        table.setRowSelectionAllowed(false);
        table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        table.setBackground(UIManager.getColor("Button.background"));
        table.setBounds(280, 300, 392, 70);
        contentPane.add(table);

        JLabel Photo = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("Marshmello.jpg")).getImage();
        Photo.setIcon(new ImageIcon(img));
        Photo.setBounds(20, 123, 193, 210);
        contentPane.add(Photo);
    }

    /**
     * Blake Profile
     *
     */
    public void BlakeProfile() {
        JLabel bio = new JLabel("Biography");
        bio.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        bio.setBounds(266, 82, 81, 29);
        contentPane.add(bio);

        JLabel AlbumLbl = new JLabel("Albums");
        AlbumLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        AlbumLbl.setBounds(266, 268, 75, 20);
        contentPane.add(AlbumLbl);

        JTextPane Bio = new JTextPane();
        Bio.setText("Blake Tollison Shelton (born June 18, 1976) is an American country music singer and television personality."
                + " In 2001, he made his debut with the single \"Austin\". "
                + "The lead-off single from his self-titled debut album, \"Austin\" spent five weeks at number one on the Billboard Hot Country Songs chart. "
                + "The now Platinum-certified debut album also produced two more top 20 entries (\"All Over Me\" and \"Ol' Red\").");
        Bio.setBackground(UIManager.getColor("Button.background"));
        Bio.setEditable(false);
        Bio.setBounds(266, 138, 431, 110);
        contentPane.add(Bio);

        JTextPane Desc = new JTextPane();
        Desc.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        Desc.setText("Full Name: Blake Tollison Shelton"
                + "\nDate of Birth: June 18, 1976"
                + "\nPlace of Birth: Ada, Oklahoma"
                + "\nYears Active: 2001 - Present"
                + "\n\nInstagram: @BlakeShelton"
                + "\nTwitter: @BlakeShelton");
        Desc.setBackground(SystemColor.window);
        Desc.setEditable(false);
        Desc.setBounds(20, 345, 234, 125);
        contentPane.add(Desc);

        JLabel Artist_name = new JLabel("Blake Shelton");
        Artist_name.setFont(new Font("Dialog", Font.PLAIN, 13));
        Artist_name.setBounds(64, 86, 100, 22);
        contentPane.add(Artist_name);

        // Data to be displayed in the JTable 
        String[][] data = {
            {"Title", "Release Date", "# Tracks"},
            {"Texoma Shore", "November 3, 2017", "11"},
            {"If I'm Honest", "May 20, 2016", "15"},
            {"Bringing Back the Sunshine", "September 30, 2014", "12"},
            {"Based on a True Story", "March 26, 2013", "12"},
            {"Cheers, It's Christmas", "October 2, 2012", "14"},
            {"Red River Blue", "July 12, 2011", "11"},
            {"Startin' Fires", "November 18, 2008", "12"},
            {"Pure BS", "May 1, 2007", "11"},
            {"Blake Shelton's Barn & Grill", "October 26, 2004", "11"},
            {"The Dreamer", "February 4, 2003", "10"},
            {"Blake Shelton", "July 31, 2001", "10"}
        };
        // Column Names 
        String[] columnNames = {"Title", "Release Date", "# Tracks"};

        table = new JTable(data, columnNames);
        table.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        table.setEnabled(false);
        table.setRowSelectionAllowed(false);
        table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        table.setBackground(UIManager.getColor("Button.background"));
        table.setBounds(280, 300, 392, 191);
        contentPane.add(table);

        JLabel Photo = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("Blake.jpg")).getImage();
        Photo.setIcon(new ImageIcon(img));
        Photo.setBounds(20, 123, 193, 210);
        contentPane.add(Photo);

    }

    /**
     * Carrie Profile
     */
    public void CarrieProfile() {
        JTextPane Bio = new JTextPane();
        Bio.setText("Carrie Marie Underwood (born March 10, 1983) is an American singer, songwriter, record producer, fashion designer, author and actress. "
                + "She rose to fame as the winner of the fourth season of American Idol in 2005. "
                + "Her debut single, \"Inside Your Heaven\", made her the only country artist to debut at number one on the Billboard Hot 100 chart and the only solo country artist in the 2000s to have a number-one song on the Hot 100. ");
        Bio.setBackground(UIManager.getColor("Button.background"));
        Bio.setEditable(false);
        Bio.setBounds(266, 138, 431, 110);
        contentPane.add(Bio);

        JTextPane Desc = new JTextPane();
        Desc.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        Desc.setText("Full Name: Carrie Marie Underwood"
                + "\nDate of Birth: March 10, 1983"
                + "\nPlace of Birth: Muskogee, Oklahoma"
                + "\nYears Active: 2004 - Present"
                + "\n\nInstagram: @carrieunderwood"
                + "\nTwitter: @carrieunderwood");
        Desc.setBackground(SystemColor.window);
        Desc.setEditable(false);
        Desc.setBounds(20, 345, 234, 125);
        contentPane.add(Desc);

        JLabel Artist_name = new JLabel("Carrie Underwood");
        Artist_name.setFont(new Font("Dialog", Font.PLAIN, 13));
        Artist_name.setBounds(64, 86, 130, 22);
        contentPane.add(Artist_name);

        // Data to be displayed in the JTable 
        String[][] data = {
            {"Title", "Release Date", "# Tracks"},
            {"Cry Pretty", "September 14, 2018", "13"},
            {"Stroyteller", "October 23, 2015", "13"},
            {"Blown Away", "May 1, 2012", "14"},
            {"Play On", "November 3, 2009", "13"},
            {"Carnival Ride", "October 23, 2007", "13"},
            {"Some Hearts", "November 15, 2005", "13"},};

        // Column Names 
        String[] columnNames = {"Title", "Release Date", "# Tracks"};

        table = new JTable(data, columnNames);
        table.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        table.setEnabled(false);
        table.setRowSelectionAllowed(false);
        table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        table.setBackground(UIManager.getColor("Button.background"));
        table.setBounds(280, 300, 392, 121);
        contentPane.add(table);

        JLabel Photo = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("Carrie.jpg")).getImage();
        Photo.setIcon(new ImageIcon(img));
        Photo.setBounds(20, 123, 193, 210);
        contentPane.add(Photo);
    }

    public void DiploProfile() {
        JTextPane Bio = new JTextPane();
        Bio.setText("Thomas Wesley Pentz (born November 10, 1978), known professionally as Diplo, is an American DJ, songwriter, "
                + "and record producer based in Los Angeles, California. "
                + "He is the co-creator and lead member of the electronic dancehall music project Major Lazer, a member of the supergroup LSD with Sia and Labrinth, "
                + "a member of electronic duo Jack Ü with producer and DJ Skrillex, and a member of Silk City with Mark Ronson.");
        Bio.setBackground(UIManager.getColor("Button.background"));
        Bio.setEditable(false);
        Bio.setBounds(266, 138, 431, 110);
        contentPane.add(Bio);

        JTextPane Desc = new JTextPane();
        Desc.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        Desc.setText("Full Name: Thomas Wesley Pentz"
                + "\nDate of Birth: November 10, 1978"
                + "\nPlace of Birth: Tupelo, Mississippi"
                + "\nYears Active: 1997 - Present"
                + "\n\nInstagram: @Diplo"
                + "\nTwitter: @Diplo");
        Desc.setBackground(SystemColor.window);
        Desc.setEditable(false);
        Desc.setBounds(20, 345, 234, 125);
        contentPane.add(Desc);

        JLabel Artist_name = new JLabel("Diplo");
        Artist_name.setFont(new Font("Dialog", Font.PLAIN, 13));
        Artist_name.setBounds(64, 86, 81, 22);
        contentPane.add(Artist_name);

        // Data to be displayed in the JTable 
        String[][] data = {
            {"Title", "Release Date", "# Tracks"},
            {"Florida", "September 21, 2004", "11"},
            {"Diplo Presents Thomas Wesley Chaper 1: Snake Oil", "May 29, 2020", "TBD"}

        };

        // Column Names 
        String[] columnNames = {"Title", "Release Date", "# Tracks"};

        table = new JTable(data, columnNames);
        table.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        table.setEnabled(false);
        table.setRowSelectionAllowed(false);
        table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        table.setBackground(UIManager.getColor("Button.background"));
        table.setBounds(260, 300, 450, 51);
        contentPane.add(table);

        JLabel Photo = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("Diplo.jpg")).getImage();
        Photo.setIcon(new ImageIcon(img));
        Photo.setBounds(20, 123, 193, 210);
        contentPane.add(Photo);

    }

    public void JBProfile() {
        JTextPane Bio = new JTextPane();
        Bio.setText("Justin Drew Bieber (born March 1, 1994) is a Canadian singer, songwriter and actor."
                + "Discovered at 13 years old by talent manager Scooter Braun after he had watched his YouTube cover song videos, Bieber was signed to RBMG Records in 2008. "
                + "With Bieber's debut EP My World, released in late 2009, Bieber became the first artist to have seven songs from a debut record chart on the Billboard Hot 100.");
        Bio.setBackground(UIManager.getColor("Button.background"));
        Bio.setEditable(false);
        Bio.setBounds(266, 138, 431, 110);
        contentPane.add(Bio);

        JTextPane Desc = new JTextPane();
        Desc.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        Desc.setText("Full Name: Justin Drew Bieber"
                + "\nDate of Birth: March 1, 1994"
                + "\nPlace of Birth: Ontario, Canada"
                + "\nYears Active: 2007 - Present"
                + "\n\nInstagram: @JustinBieber"
                + "\nTwitter: @JustinBieber");
        Desc.setBackground(SystemColor.window);
        Desc.setBounds(20, 345, 234, 125);
        Desc.setEditable(false);
        contentPane.add(Desc);

        JLabel Artist_name = new JLabel("Justin Bieber");
        Artist_name.setFont(new Font("Dialog", Font.PLAIN, 13));
        Artist_name.setBounds(64, 86, 81, 22);
        contentPane.add(Artist_name);

        // Data to be displayed in the JTable 
        String[][] data = {
            {"Title", "Release Date", "# Tracks"},
            {"Changes", "February 14, 2020", "16"},
            {"Purpose", "November 13, 2015", "13"},
            {"Believe", "June 15, 2013", "13"},
            {"Under the Mistletoe", "November 1, 2011", "11"},
            {"My World 2.0", "March 19, 2010", "10"}
        };

        // Column Names 
        String[] columnNames = {"Title", "Release Date", "# Tracks"};

        table = new JTable(data, columnNames);
        table.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        table.setEnabled(false);
        table.setRowSelectionAllowed(false);
        table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        table.setBackground(UIManager.getColor("Button.background"));
        table.setBounds(280, 300, 392, 101);
        contentPane.add(table);

        JLabel Photo = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("JustinBieber.jpg")).getImage();
        Photo.setIcon(new ImageIcon(img));
        Photo.setBounds(20, 123, 193, 210);
        contentPane.add(Photo);
    }

    public void PitProfile() {
        JTextPane Bio = new JTextPane();
        Bio.setText("Armando Christian Pérez (born January 15, 1981),"
                + " known by his stage name Pitbull, is an American rapper, singer, songwriter and record producer. "
                + "Pérez began his career in the early 2000s, recording reggaeton, latin hip hop and crunk music under a multitude of labels. "
                + "In 2004, he released his debut album M.I.A.M.I. under TVT Records and the executive production of Lil Jon ");
        Bio.setBackground(UIManager.getColor("Button.background"));
        Bio.setEditable(false);
        Bio.setBounds(266, 138, 431, 110);
        contentPane.add(Bio);

        JTextPane Desc = new JTextPane();
        Desc.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        Desc.setText("Full Name: Armando Christian Pérez"
                + "\nDate of Birth: January 15, 1981"
                + "\nPlace of Birth: Miami, Florida"
                + "\nYears Active: 2001 - Present"
                + "\n\nInstagram: @Pitbull"
                + "\nTwitter: @Pitbull");
        Desc.setBackground(SystemColor.window);
        Desc.setEditable(false);
        Desc.setBounds(20, 345, 234, 125);
        contentPane.add(Desc);

        JLabel Artist_name = new JLabel("Pitbull");
        Artist_name.setFont(new Font("Dialog", Font.PLAIN, 13));
        Artist_name.setBounds(64, 86, 81, 22);
        contentPane.add(Artist_name);

        // Data to be displayed in the JTable 
        String[][] data = {
            {"Title", "Release Date", "# Tracks"},
            {"Libertad 548", "September 27, 2019", "15"},
            {"Climate Change", "March 17, 2017", "12"},
            {"Dale", "July 17, 2015", "12"},
            {"Globalization", "November 24, 2014", "11"},
            {"Global Warming", "November 19, 2012", "12"},
            {"Planet Pit", "June 21, 2011", "16"},
            {"Armando", "November 2, 2010", "12"},};

        // Column Names 
        String[] columnNames = {"Title", "Release Date", "# Tracks"};

        table = new JTable(data, columnNames);
        table.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        table.setEnabled(false);
        table.setRowSelectionAllowed(false);
        table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        table.setBackground(UIManager.getColor("Button.background"));
        table.setBounds(280, 300, 392, 131);
        contentPane.add(table);

        JLabel Photo = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("Pitbull.jpg")).getImage();
        Photo.setIcon(new ImageIcon(img));
        Photo.setBounds(20, 123, 193, 210);
        contentPane.add(Photo);

    }

    public void TaylorSProfile() {
        JLabel bio = new JLabel("Biography");
        bio.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        bio.setBounds(266, 82, 81, 29);
        contentPane.add(bio);

        JLabel AlbumLbl = new JLabel("Albums");
        AlbumLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        AlbumLbl.setBounds(266, 268, 75, 20);
        contentPane.add(AlbumLbl);

        JTextPane Bio = new JTextPane();
        Bio.setText("Taylor Alison Swift (born December 13, 1989) is an American singer-songwriter. She is known for narrative songs about her personal life, which have received widespread media coverage. At age 14, Swift became the youngest artist signed by the Sony/ATV Music publishing house and, at age 15, she signed her first record deal. ");
        Bio.setBackground(UIManager.getColor("Button.background"));
        Bio.setEditable(false);
        Bio.setBounds(266, 138, 431, 110);
        contentPane.add(Bio);

        JTextPane Desc = new JTextPane();
        Desc.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        Desc.setText("Full Name: Taylor Alison Swift\nDate of Birth: December 13, 1989\nPlace of Birth: West Reading, Pennsylvania\nYears Active: 2006 - Present\n\nInstagram: @TaylorSwift\nTwitter: @TaylorSwift13");
        Desc.setBackground(SystemColor.window);
        Desc.setEditable(false);
        Desc.setBounds(20, 345, 234, 125);
        contentPane.add(Desc);

        JLabel Artist_name = new JLabel("Taylor Swift");
        Artist_name.setFont(new Font("Dialog", Font.PLAIN, 13));
        Artist_name.setBounds(64, 86, 81, 22);
        contentPane.add(Artist_name);

        // Data to be displayed in the JTable 
        String[][] data = {
            {"Title", "Release Date", "# Tracks"},
            {"Lover", "August 23, 2019", "18"},
            {"Reputation", "November 10, 2017", "15"},
            {"1989", "October 27, 2014", "13"},
            {"Red", "October 22, 2012", "16"},
            {"Speak Now", "October 25, 2010", "14"},
            {"Fearless", "October 27, 2009", "13"},
            {"Taylor Swift", "October 24, 2016", "11"},};

        // Column Names 
        String[] columnNames = {"Title", "Release Date", "# Tracks"};

        table = new JTable(data, columnNames);
        table.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        table.setEnabled(false);
        table.setRowSelectionAllowed(false);
        table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        table.setBackground(UIManager.getColor("Button.background"));
        table.setBounds(280, 300, 392, 131);
        contentPane.add(table);

        JLabel Photo = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("TaylorSwift.jpg")).getImage();
        Photo.setIcon(new ImageIcon(img));
        Photo.setBounds(20, 123, 193, 210);
        contentPane.add(Photo);
    }
    
    public void SkrillProfile(){
        JLabel bio = new JLabel("Biography");
		bio.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		bio.setBounds(266, 82, 81, 29);
		contentPane.add(bio);
		
		JLabel AlbumLbl = new JLabel("Albums");
		AlbumLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		AlbumLbl.setBounds(266, 268, 75, 20);
		contentPane.add(AlbumLbl);
		
		JTextPane Bio = new JTextPane();
		Bio.setText("Sonny John Moore (born January 15, 1988), known professionally as Skrillex, is an American record producer, DJ, musician, singer and songwriter. "
				+ "Growing up in Northeast Los Angeles and in Northern California, he joined the American post-hardcore band From First to Last as the lead singer in 2004, and recorded two studio albums with the band (Dear Diary, "
				+ "My Teen Angst Has a Body Count, 2004, and Heroine, 2006) before leaving to pursue a solo career in 2007.");
		Bio.setBackground(UIManager.getColor("Button.background"));
        Bio.setEditable(false);
        Bio.setBounds(266, 138, 431, 110);
		contentPane.add(Bio);
		
		JTextPane Desc = new JTextPane();
		Desc.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		Desc.setText("Full Name: Sonny John Moore"
				+ "\nDate of Birth: January 15, 1988"
				+ "\nPlace of Birth: Los Angeles, California"
				+ "\nYears Active: 2004 - Present"
				+ "\n\nInstagram: @Skrillex"
				+ "\nTwitter: @Skrillex");
        Desc.setBackground(SystemColor.window);
        Desc.setEditable(false);
		Desc.setBounds(20, 345, 234, 125);
		contentPane.add(Desc);
		
		JLabel Artist_name = new JLabel("Skrillex");
		Artist_name.setFont(new Font("Dialog", Font.PLAIN, 13));
		Artist_name.setBounds(64, 86, 81, 22);
		contentPane.add(Artist_name);

	
		 // Data to be displayed in the JTable 
        String[][] data = { 
        	{ "Title", "Release Date", "# Tracks" },
            { "Recess", "March 17, 2014", "11" }, 
            
        }; 
  
        // Column Names 
        String[] columnNames = { "Title", "Release Date", "# Tracks" }; 
        
		table = new JTable(data,columnNames);
		table.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		table.setEnabled(false);
		table.setRowSelectionAllowed(false);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table.setBackground(UIManager.getColor("Button.background"));
		table.setBounds(280, 300, 392, 31);
		contentPane.add(table);
		
		JLabel Photo = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("Skrillex.jpg")).getImage();
		Photo.setIcon(new ImageIcon(img));
		Photo.setBounds(20, 123, 193, 210);
		contentPane.add(Photo);
    }
}