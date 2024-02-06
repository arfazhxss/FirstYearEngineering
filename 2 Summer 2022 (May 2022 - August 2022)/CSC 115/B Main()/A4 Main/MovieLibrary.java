// import java.util.Arrays;
/*
 * MovieLibrary
 *  - a library to store and track Movies and favourite Movies
 *  - uses a MovieListInterface as the underlying abstract data type
 *       to store Movie instances to allMovies and favourites
 */

public class MovieLibrary {

    private MovieListInterface allMovies;
    private MovieListInterface favourites;

    /* Constructor
     *
     * Purpose: initialize allMovies and favourites of
     * 	this instance of MovieLibrary with empty MovieLists
     *
     */
    public MovieLibrary () {
        // TODO: complete constructor initializing allMovies and favourites
        //You must allocate MovieArrayList instances here for allMovies and favourites
        allMovies = new MovieArrayList();
        favourites = new MovieArrayList();
    }



    /* getMovieCount
     *
     * Purpose: return the number of Movies in this MovieLibrary
     *
     * Parameters: none
     *
     * Returns: int - the number of Movies in allMovies
     *
     */
    public int getMovieCount() {
        return allMovies.size();
    }

    /* getFavouriteCount
     *
     * Purpose: return the number of Movies in favourites in this MovieLibrary
     *
     * Parameters: none
     *
     * Returns: int - the number of Movies in favourites
     *
     */
    public int getFavouriteCount() {
        return favourites.size();
    }

    /*
     *
     * Purpose: add m to allMovies, if favourite is true add m to favourites
     *
     * Parameters: Movie m, boolean favourite
     *
     * Precondition: m is not null
     *
     * Returns: void
     *
     */
    public void addMovie (Movie m, boolean favourite) {
        if (m!=null) {
            allMovies.add(m);
        }
        if ((favourite)&&(m!=null)) {
            favourites.add(m);
        }
    }

    /* removeFavourite
     *
     * Purpose: remove Movie with title from favourites if found.
     *   Does not remove Movie from allMovies
     *
     * Parameters: String title
     *
     * Precondition: title is not null
     *
     * Returns: void
     *
     */
    public void removeFavourite (String title) {
        String[] newlist = favourites.getMovieTitles();
        if (title!=null) {
            for (int i=0;i<getFavouriteCount();i++) {
                if (newlist[i].equals(title)) {
                    favourites.removeFromPosition(i);
                }
            }
        }
    }


    /* removeMovie
     *
     * Purpose: remove Movie with title from allMovies and favourites if found
     *
     * Parameters: String title
     *
     * Precondition: title is not null
     *
     * Returns: void
     *
     */
    public void removeMovie (String title) {
        String[] newlist1 = allMovies.getMovieTitles();
        String[] newlist2 = favourites.getMovieTitles();

        for (int i=0;i<getMovieCount();i++) {
            if ((title!=null)&&(newlist1[i].equals(title))) {
                allMovies.removeFromPosition(i);
            }
        }
        for (int i=0; i<getFavouriteCount();i++) {
            if ((title!=null)&&(newlist2[i].equals(title))) {
                favourites.removeFromPosition(i);
            }
        }
    }



    /* getAllMovieTitles
     *
     * Purpose: returns an array of titles of Movies in allMovies
     *
     * Parameters: none
     *
     * Returns: String[] - an array of Movie titles
     *
     */
    public String[] getAllMovieTitles () {
        String[] newlist = allMovies.getMovieTitles();
        return newlist;
    }

    /* getAllMovieTitles
     *
     * Purpose: returns an array of titles of Movies in favourites
     *
     * Parameters: none
     *
     * Returns: String[] - an array of Movie titles
     *
     */
    public String[] getFavouriteTitles () {
        String[] newlist = favourites.getMovieTitles();
        return newlist;
    }

    /* getTitlesWithActor
     *
     * Purpose: returns an array of titles of Movies in allMovies
     *     with leadActor with lastName
     *
     * Parameters: String lastName
     *
     * Precondition: lastName is not null
     *
     * Returns: String[] - an array of Movie titles
     *
     */
    public String[] getTitlesWithActor (String lastName) {
        String[] newlist = allMovies.getMovieTitlesWithActor(lastName);
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
//     // MovieLibrary library = new MovieLibrary();
//     // library.addMovie(nomadland, false);
//     // library.addMovie(spaceJam, true);
//     // library.addMovie(moneyball, true);
//     // library.removeFavourite("Nomadland");
//     // library.removeFavourite("Moneyball");
//     // library.removeMovie("Nomadland");
//     // library.removeMovie("Space Jam");

//     // String[] result = library.getAllMovieTitles();
//     // System.out.println("AllMovies");
//     // System.out.print(library.getMovieCount()+": ");
//     // System.out.println(Arrays.toString(result));
    
//     // String[] result2 = library.getFavouriteTitles();
//     // System.out.println("Favourites");
//     // System.out.print(library.getFavouriteCount()+": ");
//     // System.out.println(Arrays.toString(result2)); 
// }
}
