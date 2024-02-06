//
// Song.java

public class Song {
//     1. generalize what you use to describe a song?
//      these dictate the fields/attributes in our Song class
//     2. create fields in Song class
//     3. go to tester and create some song objects...
//     4. change fields to private in Song class
    private String title;
    private String artist;
    private int length; // in seconds
    
    public Song() {
        this.title = "unknown title";
        this.artist = "unknown artist";
        this.length = -1;
    }
    
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.length = -1;
    }

    
    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }


//     5. add getters and setters for fields
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int getLength() {
        return length;
    }
    
    // equivalent to the setTitle method below
//    public void setTitle(String newTitle) {
//        title = newTitle;
//    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

//     6. how do we initialize a song with data upon creation?
//            - add a custom contructor

//     7. add a toString method
//          - takes no arguments and returns a String
//            representing this object

    public String toString() {
        String s = title + ":" + artist + ":" + length;
        return s;
    }

//     8. go back to tester and compare equality of 2 Song objects using ==
    

//     9. add an equals method
//          - takes 1 argument: another Song object
//          - returns true if the current Song is the same as the argument passed
//          and false otherwise
    
    public boolean equals(Song otherSong) {
//        if (this.title.equals(otherSong.title)
//            && this.artist.equals(otherSong.artist)) {
//            return true;
//        } else {
//            return false;
//        }
        // equivalent to the code above
        return (title.equals(otherSong.title)
                && artist.equals(otherSong.artist));
    }


}
