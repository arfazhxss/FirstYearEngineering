import java.lang.Math;
import java.util.Arrays;

/*
 * MovieArrayOperations
 *  - static methods that operate on arrays of Movie instances
 */
public class MovieArrayOperations {

    /*
     * getMovieTitles
     *
     * Purpose: creates a new array of the titles of all of the Movie instances
     *       in input array
     *
     * Parameters: Movie[] - array
     *
     * Precondition: array is not null
     *
     * Returns: String[] - new array of Movie titles
     *
     */
    public static String[] getMovieTitles (Movie[] array) {
        String[] result = new String[array.length];
        
        for (int i=0; i<array.length; i++) {
            if (array.length!=0) {
                result[i] = array[i].getTitle();
            }
        }

        return result;
    }


    /*
     * findMovie
     *
     * Purpose: finds the position of Movie instance with given title
     *  within the input array.
     *
     * Parameters: Movie[] - array, String - name
     *
     * Precondition: array and name are not null
     *
     * Returns: int - the position found, -1 if title is not found
     *
     */
    public static int findMovie (Movie[] array, String name) {
        if ((array.length==0)||(name==null)) {
            return -1;
        }

        for (int i=0; i<array.length; i++) {
            if (name.equals(array[i].getTitle())) {
                return i;
            }
        } return -1;
    }


    /*
     * getMoviesWithActor
     *
     * Purpose: creates a new array that holds only Movie instances
     *   from input array that have a leadActor with lastName matching
     *   the given actorLastName.
     *   The new array is exactly big enough to hold the Movie instances
     *   with given actorLastName from input array.
     *
     * Parameters: Movie[] - array, String - actorLastName
     *
     * Precondition: array and actorLastName are not null
     *
     * Returns: Movie[] - the new array
     *
     */
    public static Movie[] getMoviesWithActor (Movie[] array, String actorLastName) {
        Movie[] result = new Movie[countMoviesWithActor(array, actorLastName)];
        int count = 0;
        for (int i=0; i<array.length; i++) {
            if ((array[i].getLeadActor()!=null)&&((array[i].getLeadActor().getLastName()).equals(actorLastName))) {
                result[count++] = array[i];
            }
        }
        return result;
    }


    /*
     * countMoviesWithActor
     *
     * Purpose: counts the Movie instances from input array that have a
     *   leadActor with lastName matching the given actorLastName.
     *
     * Parameters: Movie[] - array, String - actorLastName
     *
     * Precondition: array and actorLastName are not null
     *
     * Returns: int - the count
     *
     */
    public static int countMoviesWithActor (Movie[] array, String actorLastName) {
        int count = 0;
        for (int i=0; i<array.length; i++) {
            if ((array[i].getLeadActor()!=null)&&(array.length!=0)&&(actorLastName!=null)&&((array[i].getLeadActor().getLastName()).equals(actorLastName))) {
                count++;
            }
        }
        return count;
    }


    /*
     * getLeadActor
     *
     * Purpose: constructs and returns a String with firstName and lastName
     *   separated by a space of the leadActor of the Movie instance
     *   with the given title in input array.
     *
     * Parameters: Movie[] - array, String - title
     *
     * Precondition: array and title are not null
     *
     * Returns: String - in format "firstName lastName"
     *    or "" if Movie title not found or Movie has no leadActor assigned
     *
     */
    public static String getLeadActor (Movie[] array, String title) {
        String result = new String();
        for (int i=0; i<array.length; i++) {
            if ((array[i].getTitle().equals(title))&&(array[i].getLeadActor()!=null)) {
                result = array[i].getLeadActor().getFirstName() + " " + array[i].getLeadActor().getLastName();
            }
        }
        return result;
    }


    /*
     * addMovie
     *
     * Purpose: creates a new array 1 longer than input array and
     *  copies all Movie references from input array to new array
     *  and stores m at the end of the new array
     *
     * Parameters: Movie[] - array, Movie - m
     *
     * Preconditions:  array and m are not null
     *
     * Returns:  Movie[] - the new array
     *
     */
    public static Movie[] addMovie (Movie[] array, Movie m) {
        Movie[] result = new Movie[array.length+1];
        for (int i=0; i<(array.length+1); i++) {
            if (i==array.length) {
                result[i]=m;
            } else {
                result[i]=array[i];
            }
        } return result;
    }


    /*
     * removeMovie
     *
     * Purpose: if input array has Movie with given title, returns a new array
     *  with length one less than the input array. The new array is created and
     *  all but the Movie to be removed is copied from the input array to new array.
     *  If the input array does not have a Movie with given title,
     *  the input array is returned.
     *
     *
     *  If two Movie instances with the same title are in the input array
     *  the method removes the first occurance
     *
     * Parameters: Movie[] - array, String - title
     *
     * Precondition: array and title are not null
     *
     * Returns: Movie[] - the new array if title is found,
     *      otherwise returns the original input array
     *
     */
    public static Movie[] removeMovie (Movie[] array, String title) {
        if ((title==null)||(array.length==0)) return array;
        else {            
            int count1 = 0;
            int count2 = 0;
            for (int i=0; i<array.length; i++) {
                if (array[i].getTitle().equals(title)) {
                    count1=i;
                    // System.out.println("i: "+ i);
                }
                for (int j=0; j<array.length; j++) {
                    if ((i!=j)&&(array[i].getTitle().equals(array[j].getTitle()))) {
                        count2 = j;
                    }
                }
            }
            // System.out.println("count1: "+ count1+" array.length-1: "+(array.length-1));
            if (count1==0) return array;
            else if ((count1!=0)&&(count2==0)) {
                Movie[] result = new Movie[array.length-1];
                int i=0;
                for (int j=0; j<=array.length-1; j++) {
                    if (count1!=j) {
                        // System.out.println("i: "+i+"\tj: "+j+"\tcount1: "+count1);
                        result[i++]=array[j];
                    } 
                } return result;
            }
            else if ((count1!=0)&&(count2!=0)) {
                Movie[] result = new Movie[array.length-2];
                int i=0;
                for (int j=0; j<=array.length-1; j++) {
                    if ((j!=count1)&&(j!=count2)) {
                        // System.out.println("i: "+i+"\tj: "+j+"\tcount1: "+count1+"\t count2: "+count2);
                        result[i++]=array[j];
                    } 
                } return result;
            }
        } return array; 
    }


    /*
     * getMovieWithOldestActor
     *
     * Purpose: get the Movie from array with the leadActor who was the
     *  oldest at the time of the releaseYear of the Movie.
     *  If two Movies instances have leadActors that are the same age in the
     *  relevant releaseYear, return the first occurance in the input array
     *
     * Parameters: Movie[] - array
     *
     * Precondition: array is not null
     *
     * Returns: Movie - movie with oldest leadActor, null if no leadActors found
     *
     */
    public static Movie getMovieWithOldestActor (Movie[] array) {
        if ((array.length!=0)) {
            int count = 0, count_age=0;
            for (int i=0; i<array.length; i++) {
                if ((array[i].getLeadActor()!=null)&&(count_age<array[i].getLeadActor().getAge(array[i].getReleaseYear()))) {
                    count_age=(array[i].getLeadActor().getAge(array[i].getReleaseYear()));
                    count = i;
                    // System.out.println(array[i].getLeadActor().getAge(array[i].getReleaseYear()));
                } 
            }
            if (count_age==0) return null; 
        // System.out.println("FINAL\tcount_age: "+count_age+"\tcount: "+count+"\tarray.length: "+array.length);
            return array[count];
        } return null;
    }

    // private static int testCount = 1;

    // private static Actor jLopez = new Actor("Jennifer", "Lopez", 1969);
    // private static Actor bPitt = new Actor("Brad", "Pitt", 1963, 2);
    // private static Actor fMcdormand = new Actor("Frances", "McDormand", 1957, 4);
    // private static Actor jFonda = new Actor("Jane", "Fonda", 1937, 2);
    // private static Actor mJordan = new Actor("Michael", "Jordan", 1963, 0);

    // private static Movie nomadland = new Movie("Nomadland", 2020, fMcdormand);
    // private static Movie monsterInLaw = new Movie("Monster-in-Law", 2005, jLopez);
    // private static Movie maidInManhattan = new Movie("Maid in Manhattan", 2002, jLopez);
    // private static Movie spaceJam = new Movie("Space Jam", 1996, mJordan);
    // private static Movie ladyBird = new Movie("Lady Bird", 2017);
    // private static Movie moneyball = new Movie("Moneyball", 2011, bPitt);
    // private static Movie minari = new Movie("Minari", 2021);
    // public static void main (String[] args) {
    //     Movie[] empty = {};
    //     Movie spaceJam2 = new Movie("Space Jam", 1996);
    //     Movie[] movies6 = {maidInManhattan, spaceJam, monsterInLaw, ladyBird, spaceJam, moneyball};
    //     Movie[] lists = {nomadland, monsterInLaw, maidInManhattan, spaceJam, ladyBird, moneyball, minari};

    //     Movie[] result;

    //     // Movie[] expectedEmpty = {};
    //     System.out.println("Count: "+(testCount++)+"\t <> getLeadActor <>: " + Arrays.toString(MovieArrayOperations.removeMovie(empty, "Maid in Manhattan")));

    //     // Movie[] expectedMid = {maidInManhattan, spaceJam, monsterInLaw, spaceJam2, moneyball};
    //     System.out.println("Count: "+(testCount++)+"\t !!<> removeMovie <>: " + Arrays.toString(MovieArrayOperations.removeMovie(movies6, "Lady Bird")));
    //     System.out.println("Count: "+(testCount++)+"\t <<> removeMovie <>: " + Arrays.toString(MovieArrayOperations.removeMovie(lists, "Lady Bird")));
    // }
}
