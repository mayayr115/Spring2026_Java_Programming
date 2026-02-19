package InClassActivity.ICA02;

public class Driver {
    public static void main(String[] args) {

        // 1. Test zero-arg constructor
        Artist artist0 = new Artist();
        artist0.displayInfo();

        // 2. Original artist using parameterized constructor
        String[] albumsOriginal = {"Album A", "Album B"};
        Artist artist1 = new Artist("Taylor Swift", 1000000, albumsOriginal);
        System.out.println("Original artist:");
        artist1.displayInfo();

        // 3. Copy constructor/deep copy
        Artist artist2 = new Artist(artist1);

        // Change albums in the copy
        String[] newAlbums = {"Changed Album 1"};
        artist2.setInfo(artist2.getName(), artist2.getNumFans(), newAlbums);

        System.out.println("After modifying copy:");
        System.out.println("Original artist (should be unchanged):");
        artist1.displayInfo();  // Should still show Album A, Album B
        System.out.println("Copied artist:");
        artist2.displayInfo();  // Should show Changed Album 1

        // 4. Test setInfo deep copy
        String[] albumsForSetInfo = {"New Album 1", "New Album 2"};
        Artist artist3 = new Artist();
        artist3.setInfo("Ed Sheeran", 500000, albumsForSetInfo);

        // Modify the array used in setInfo
        albumsForSetInfo[0] = "Hacked Album!";

        System.out.println("After modifying array used in setInfo:");
        artist3.displayInfo(); // Should still show New Album 1, New Album 2
    }
}