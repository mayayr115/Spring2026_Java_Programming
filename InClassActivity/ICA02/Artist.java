package InClassActivity.ICA02;

public class Artist {
    private String name;
    private int numFans;
    private String[] albums;

    // No-argument constructor
    public Artist() {
        //Add code here
    }

    // Parameterized constructor
    public Artist(String name, int numFans, String[] albums) {
        //Add code here
    }

    // Copy constructor (deep copy)
    public Artist(Artist anotherArtist) {
        //Add code here
    }

    // Method to set info , deep copy of albums array
    public void setInfo(String name, int numFans, String[] albums) {
        //Add code here
    }

    // Method to display artist info
    public void displayInfo() {
        System.out.println("Artist Name: " + name);
        System.out.println("Number of Fans: " + numFans);
        System.out.print("Albums: ");
        if (albums.length == 0) {
            System.out.println("None");
        } else {
            for (String album : albums) {
                System.out.print(album + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }

    public String getName() {
        return name;
    }

    public int getNumFans() {
        return numFans;
    }

    public String[] getAlbums() {
        return albums;
    }
}