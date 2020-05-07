public class Profile extends Template{

    private String artist;

    protected void getArtist(String art) {
        this.artist = art;
    }
 
    protected String setArtist() {
        switch (artist) {
            case "Taylor Swift":
                TaylorSProfile();
                setVisible(true);
                break;
            case "Pitbull":
                PitProfile();
                setVisible(true);
                break;

            case "Justin Bieber":
                JBProfile();
                setVisible(true);
                break;

            case "Skrillex":
                SkrillProfile();
                setVisible(true);
                break;

            case "Diplo":
                DiploProfile();
                setVisible(true);
                break;

            case "Marshmello":
                MarshProfile();
                setVisible(true);
                break;

            case "Keith Urban":
                KeithProfile();
               setVisible(true);
                break;

            case "Blake Shelton":
                BlakeProfile();
                setVisible(true);
                break;
            case "Carrie Underwood":
                CarrieProfile();
                setVisible(true);
                break;

        }
        return artist;
    }
}
