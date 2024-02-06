// SongTester.java
//
// We will write code here to test our implementation of Song.java
//
// We have put this code in a different file to separate the functionality
// of testing/using the class versus defining the class
public class SongTester {

    public static void main (String[] args) {
        // Recall: if I want to declare an integer:
        int i = 0; // what is it initialized to? ->

        // if I want to declare an array of integers:
        int[] array;
        // what is it initialized to?

        // how would I initialize it to point to an array of size 10?
        array = new int[10];
        
        //  3a. declare and initialize two new blank songs
        Song song1 = new Song();
        Song song2 = new Song();


        // 3b. print the values of the fields for each song
//        System.out.println("song1");
//        System.out.println(song1.title);
//        System.out.println(song1.artist);
//        System.out.println(song1.length);
//
//        System.out.println("song2");
//        System.out.println(song2.title);
//        System.out.println(song2.artist);
//        System.out.println(song2.length);
        // 3c. set the fields in one of the songs to some values and reprint
//        song1.title = "Sweet Caroline";
        song1.setTitle("Sweet Caroline");
        song1.setArtist("Neil Diamond");
//        song1.artist = "Neil Diamond";
        
        System.out.println("song1");
        System.out.println(song1.getTitle());
        System.out.println(song1.getArtist());
        System.out.println(song1.getLength());
        
        System.out.println("song2");
        System.out.println(song2.getTitle());
        System.out.println(song2.getArtist());
        System.out.println(song2.getLength());

        // 5a. update statements where necessary from 3b and 3c


        // 6a. call constructor with args, then print fields
        // 6b. call alternative constructor, then print fields
        // 6c. try to print one of the songs
        // ie. pass your Song variable to System.out.println()
        Song jumpVH = new Song("Jump", "Van Halen");
        Song jumpVHLength = new Song("Jump", "Van Halen", 220);
        Song jumpPS = new Song( "Jump", "Pointer Sisters");
        System.out.println("6A");
        System.out.println(jumpVH);
        System.out.println(jumpVHLength);


        // 7a. recompile and run your program - what changes in the 6c output?

        // 8a. compare equality of 2 Song objects using == operator
        System.out.println("\n8A");
        System.out.println("think false: " + (jumpVH == jumpVHLength));
        System.out.println("think true: " + (jumpVH == jumpVH));
        
        // 9a. compare equality of Song objects using equals method
        System.out.println("\n\n");
        System.out.println("think true: " + (jumpVH.equals(jumpVHLength)));
        System.out.println("think true: " + (jumpVH.equals(jumpVH)));
        System.out.println("think false: " + (jumpVH.equals(song1)));
        System.out.println("think false: " + (jumpVH.equals(jumpPS)));
    }
}
