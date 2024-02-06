// import java.util.Arrays;
/*
 * MovieArrayList
 *  - a concrete implementation of the MovieListInterface
 *  - uses an array as the underlying data structure to store Movie instances
 *  - see MovieListInterface for method specifications
 */
public class MovieArrayList implements MovieListInterface {

    private static final int INITIAL_CAPACITY = 2;

    private Movie[]  storage;  // holds Movie instance, each with a unique title
    private int      numMovies;  // keeps track of the number of Movie objects in storage

    /* Constructor
     *
     * Purpose: Initialize a new instance of MovieArrayList
     *
     */
    public MovieArrayList() {
        // TODO: You must initialize storage to be an array able
        // to hold INITIAL_CAPACITY Movie objects
        // Initially, there will be no Movie instances in storage, therefore
        // initialize numMovies to be 0 even though the capacity is INITIAL_CAPACITY
        storage = new Movie[INITIAL_CAPACITY];
        numMovies = 0;
    }

    /* size
     *
     * Purpose: returns the number of elements in the list
     *
     * Parameters: none
     *
     * Returns: int - the number of elements
     *
     */
    public int size() {
        return numMovies;
    }

    // completed for you
    public String toString() {
        String result = "";
        System.out.print("count: " + numMovies + " array len:" + storage.length);
        for (int i=0; i<numMovies; i++) {
            System.out.print("i: "  + i);
             result += storage[i].toString() + "\n";
        }
        return result;
    }

    /* add
     *
     * Purpose: add Movie m to the MovieList
     *  more space is allocated for the MovieList if necessary
     *  to add m to the list
     *
     * Parameters: Movie m
     *
     * Precondition: m is not null, the title of m is unique,
     *   ie. MovieList does not already contain a Movie with the same title
     *
     * Returns: void
     *
     */
    public void add (Movie m) {
        int result = 0;
        for (int i=0; i<numMovies; i++) {
            if ((m==null)||(m.equals(storage[i]))) {
                result=-1;
            }
        }
        if ((numMovies==storage.length)&&(result!=-1)) {
            Movie newline[] = new Movie[2*(storage.length)];

            for (int i=0; i<(storage.length);i++) {
                newline[i]=storage[i];
            }
            storage=newline;
        }
        storage[numMovies++]=m;
    }

    /* get
     *
     * Purpose: returns the element at position
     *
     * Parameters: int - position
     *
     * Pre-Conditions:
     *     for a MovieList x:
     *    position >= 0 AND
     *    position < x.size()
     *
     * Returns: Movie - the Movie at position
     *
     */
    public Movie get (int position) {
        if ((position>=0)&&(position<numMovies)&&(storage[position]!=null)) {
            return storage[position];
        }
        return null;
    }

    /* find
     *
     * Purpose: returns the position of Movie with given title in the list.
     *  If a Movie with given title is not found, returns -1
     *
     * Parameters: String title
     *
     * Precondition: title is not null
     *
     * Returns: int - position of Movie with title, -1 if it does not exist
     *
     */
    public int find (String title) {
        int position = -1;
        int count = 0;
        for (int i=0; i<numMovies; i++) {
            if ((storage[i].getTitle()).equals(title)==true) {
                position=i;
                ++count;
            }
        }
        return position;
    }

    /* removeFromPosition
     *
     * Purpose: removes the element at given position in the list
     *
     * Parameters: int - position
     *
     * Pre-Conditions:
     *    for a MovieList x:
     *        position >= 0 AND
     *        position < x.size()
     *
     * Returns: void
     *
     */
    public void removeFromPosition (int position) {
        Movie newline[] = new Movie[storage.length];
        int count=0;
        for (int i=0;i<numMovies;i++) {
            if ((position>=0)&&(position<numMovies)&&(position!=i)&&(storage[i]!=null)) {
                newline[count++]=storage[i];
            }
        }
        storage=newline;
        --numMovies;
    }

    /* getMovieTitles
     *
     * Purpose: returns an array of titles from Movie instances in MovieList
     *
     * Parameters: none
     *
     * Returns: String[] - array of Movie titles
     *
     */
    public String[] getMovieTitles () {
        String[] newlist = new String[numMovies];
        if (numMovies!=0) {
            for (int i=0;i<numMovies;i++) {
                newlist[i]=storage[i].getTitle();
            }
            return newlist;
        }
        return newlist;
    }


    /* getMovieTitlesWithActor
     *
     * Purpose: returns an array of titles from Movie instances in MovieList
     *   which have a leadActor with given actorLastName
     *
     * Parameters: String actorLastName
     *
     * Precondition: actorLastName is not null
     *
     * Returns: String[] - array of Movie titles
     *
     */
    public String[] getMovieTitlesWithActor (String actorLastName) {
        int count=0, stored=0;
        if ((actorLastName!=null)&&(numMovies!=0)) {
            for (int i=0;i<storage.length;i++) {
                if ((storage[i]!=null)&&(storage[i].getLeadActor()!=null)&&(storage[i].getLeadActor().getLastName()).equals(actorLastName)) {
                    stored++;
                }
            }
        }
        String[] newlist = new String[stored];
        if ((actorLastName!=null)&&(numMovies!=0)) {
            for (int i=0;i<storage.length;i++) {
                if ((storage[i]!=null)&&(storage[i].getLeadActor()!=null)&&(storage[i].getLeadActor().getLastName()).equals(actorLastName)) {
                    newlist[count++]=storage[i].getTitle();
                }
            }
        }
        return newlist;
    }

    //     private static Actor jLopez = new Actor("Jennifer", "Lopez", 1969);
    //     private static Actor bPitt = new Actor("Brad", "Pitt", 1963, 2);
    //     private static Actor fMcdormand = new Actor("Frances", "McDormand", 1957, 4);
    //     private static Actor jFonda = new Actor("Jane", "Fonda", 1937, 2);
    //     private static Actor mJordan = new Actor("Michael", "Jordan", 1963, 0);

    //     private static Movie nomadland = new Movie("Nomadland", 2020, fMcdormand);
    //     private static Movie monsterInLaw = new Movie("Monster-in-Law", 2005, jLopez);
    //     private static Movie spaceJam = new Movie("Space Jam", 1996, mJordan);
    //     private static Movie maidInManhattan = new Movie("Maid in Manhattan", 2002, jLopez);
    //     private static Movie ladyBird = new Movie("Lady Bird", 2017);
    //     private static Movie moneyball = new Movie("Moneyball", 2011, bPitt);
    //     private static Movie minari = new Movie("Minari", 2021);

    //     private static Movie[] movies = {nomadland, monsterInLaw, spaceJam,
    //                                     maidInManhattan, ladyBird, moneyball, minari};
                                    
    // public static void main (String[] args) {
    //     MovieListInterface list = new MovieArrayList();
    //     String[] result = list.getMovieTitles();
    //     String[] result2 = list.getMovieTitlesWithActor("Lopez");;
    //     System.out.println(Arrays.toString(result2));
        
    // }
}
