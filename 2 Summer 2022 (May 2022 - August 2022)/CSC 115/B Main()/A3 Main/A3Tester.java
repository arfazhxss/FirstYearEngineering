import java.util.Arrays;
/*
 * A3Tester.java
 *
 * A partial test program for Assignment 3.
 *
 * While this program includes many test cases,
 * it is INTENTIONALLY not a comprehensive set of tests.
 * You should add your own tests to test cases not considered.
 *
 * The auto grading of your assignment will include different and additional tests.
 *
 */
public class A3Tester {

    private static int testPassCount = 0;
    private static int testCount = 1;

    private static Actor jLopez = new Actor("Jennifer", "Lopez", 1969);
    private static Actor bPitt = new Actor("Brad", "Pitt", 1963, 2);
    private static Actor fMcdormand = new Actor("Frances", "McDormand", 1957, 4);
    private static Actor jFonda = new Actor("Jane", "Fonda", 1937, 2);
    private static Actor mJordan = new Actor("Michael", "Jordan", 1963, 0);

    private static Movie nomadland = new Movie("Nomadland", 2020, fMcdormand);
    private static Movie monsterInLaw = new Movie("Monster-in-Law", 2005, jLopez);
    private static Movie maidInManhattan = new Movie("Maid in Manhattan", 2002, jLopez);
    private static Movie spaceJam = new Movie("Space Jam", 1996, mJordan);
    private static Movie ladyBird = new Movie("Lady Bird", 2017);
    private static Movie moneyball = new Movie("Moneyball", 2011, bPitt);
    private static Movie minari = new Movie("Minari", 2021);

    public static void main (String[] args) {

        getMovieTitlesTest();
        findMovieTest();
        countMoviesWithActorTest();
        getMoviesWithActorTest();
        getLeadActorTest();
        addMovieTest();
        removeMovieTest();
        getMovieWithOldestActorTest();
    }

    public static void getMovieTitlesTest() {
        
        Movie[] empty = {};
        Movie[] movies4 = {nomadland, spaceJam, minari, ladyBird};
        Movie[] lists = {nomadland, monsterInLaw, maidInManhattan, spaceJam, ladyBird, moneyball, minari};

        String[] result;

        System.out.println("Count: "+(testCount++)+"\t <> getMovieTitles <>: " + Arrays.toString(MovieArrayOperations.getMovieTitles(movies4)));
        System.out.println("Count: "+(testCount++)+"\t <> getMovieTitles <>: " + Arrays.toString(MovieArrayOperations.getMovieTitles(empty)));
        System.out.println("Count: "+(testCount++)+"\t <<> getMovieTitles <>: " + Arrays.toString(MovieArrayOperations.getMovieTitles(lists)));

    }

    public static void findMovieTest() {

        Movie[] empty = {};
        Movie[] movies4 = {nomadland, spaceJam, minari, ladyBird};
        Movie[] lists = {nomadland, monsterInLaw, maidInManhattan, spaceJam, ladyBird, moneyball, minari};

        int result;

        System.out.println("Count: "+(testCount++)+"\t <> findMovie <>: " + (MovieArrayOperations.findMovie(empty, "Nomadland")));
        System.out.println("Count: "+(testCount++)+"\t <> findMovie <>: " + (MovieArrayOperations.findMovie(movies4, "Minari")));
        System.out.println("Count: "+(testCount++)+"\t <<> findMovie <>: " + (MovieArrayOperations.findMovie(lists, null)));
    }


    public static void countMoviesWithActorTest() {

        Movie[] empty = {};
        Movie[] movies4 = {maidInManhattan, spaceJam, monsterInLaw, ladyBird};
        Movie[] lists = {nomadland, monsterInLaw, maidInManhattan, spaceJam, ladyBird, moneyball, minari};

        System.out.println("Count: "+(testCount++)+"\t <> countMoviesWithActor <>: " + (MovieArrayOperations.countMoviesWithActor(empty, "Lopez")));
        System.out.println("Count: "+(testCount++)+"\t <> countMoviesWithActor <>: " + (MovieArrayOperations.countMoviesWithActor(movies4, "Lopez")));
        System.out.println("Count: "+(testCount++)+"\t <> countMoviesWithActor <>: " + MovieArrayOperations.countMoviesWithActor(movies4, "Hanks"));
        System.out.println("Count: "+(testCount++)+"\t <<> countMoviesWithActor <>: " + MovieArrayOperations.countMoviesWithActor(lists, "Fonda"));

    }

    public static void getMoviesWithActorTest() {
        
        Movie[] empty = {};
        Movie[] movies4 = {maidInManhattan, spaceJam, monsterInLaw, ladyBird};
        Movie[] lists = {nomadland, monsterInLaw, maidInManhattan, spaceJam, ladyBird, moneyball, minari};

        Movie[] result;

        System.out.println("Count: "+(testCount++)+"\t <> getMoviesWithActor <>: " + Arrays.toString(MovieArrayOperations.getMoviesWithActor(empty, "Lopez")));
        System.out.println("Count: "+(testCount++)+"\t <> getMoviesWithActor <>: " + Arrays.toString(MovieArrayOperations.getMoviesWithActor(movies4, "Lopez")));
        System.out.println("Count: "+(testCount++)+"\t <<> getMoviesWithActor <>: " + Arrays.toString(MovieArrayOperations.getMoviesWithActor(lists, "Pitt")));
        
        }

    public static void getLeadActorTest() {

        Movie[] empty = {};
        Movie[] movies4 = {nomadland, moneyball, ladyBird, spaceJam};
        Movie[] lists = {nomadland, monsterInLaw, maidInManhattan, spaceJam, ladyBird, moneyball, minari};

        String result;

        System.out.println("Count: "+(testCount++)+"\t <> getLeadActor <>: " + (MovieArrayOperations.getLeadActor(empty, "Nomadland")));
        System.out.println("Count: "+(testCount++)+"\t <> getLeadActor <>: " + (MovieArrayOperations.getLeadActor(movies4, "Moneyball")));
        System.out.println("Count: "+(testCount++)+"\t <> getLeadActor <>: " + (MovieArrayOperations.getLeadActor(movies4, "Lady Bird")));
        System.out.println("Count: "+(testCount++)+"\t <<> getLeadActor <>: " + MovieArrayOperations.getLeadActor(lists, "rike"));

    }

    public static void addMovieTest() {

        Movie[] empty = {};
        Movie[] movies3 = {maidInManhattan, spaceJam, monsterInLaw};
        Movie[] lists = {nomadland, monsterInLaw, maidInManhattan, spaceJam, ladyBird, moneyball, minari};

        Movie[] result;

        Movie[] expected3 = {maidInManhattan, spaceJam, monsterInLaw, moneyball};
        System.out.println("Count: "+(testCount++)+"\t <> addMovie <>: " + Arrays.toString(MovieArrayOperations.addMovie(movies3, moneyball)));
        System.out.println("Count: "+(testCount++)+"\t <<> addMovie <>: " + Arrays.toString(MovieArrayOperations.addMovie(lists, moneyball)));

    }

    public static void removeMovieTest() {

        Movie[] empty = {};
        Movie spaceJam2 = new Movie("Space Jam", 1996);
        Movie[] movies6 = {maidInManhattan, spaceJam, monsterInLaw, ladyBird, spaceJam, moneyball};
        Movie[] lists = {nomadland, monsterInLaw, maidInManhattan, spaceJam, ladyBird, moneyball, minari};

        Movie[] result;

        // Movie[] expectedEmpty = {};
        System.out.println("Count: "+(testCount++)+"\t <> getLeadActor <>: " + Arrays.toString(MovieArrayOperations.removeMovie(empty, "Maid in Manhattan")));

        // Movie[] expectedMid = {maidInManhattan, spaceJam, monsterInLaw, spaceJam2, moneyball};
        System.out.println("Count: "+(testCount++)+"\t !!<> removeMovie <>: " + Arrays.toString(MovieArrayOperations.removeMovie(movies6, "Lady Bird")));
        System.out.println("Count: "+(testCount++)+"\t <<> removeMovie <>: " + Arrays.toString(MovieArrayOperations.removeMovie(lists, "Lady Bird")));
    }


    public static void getMovieWithOldestActorTest() {

        Movie[] empty = {};
        Movie[] moviesFront = {nomadland, spaceJam, monsterInLaw, moneyball};
        Movie[] moviesBack = {spaceJam, monsterInLaw, moneyball, minari};
        Movie[] moviesMiddle = {ladyBird, spaceJam, maidInManhattan, minari};
        Movie[] noActors = {ladyBird, minari};
        Movie[] lists = {nomadland, monsterInLaw, maidInManhattan, spaceJam, ladyBird, moneyball, minari};

        Movie result = MovieArrayOperations.getMovieWithOldestActor(empty);

        System.out.println("Count: "+(testCount++)+"\t <> getMovieWithOldestActor <>: " + MovieArrayOperations.getMovieWithOldestActor(moviesFront));
        System.out.println("Count: "+(testCount++)+"\t <> getMovieWithOldestActor <>: " + MovieArrayOperations.getMovieWithOldestActor(moviesBack));
        System.out.println("Count: "+(testCount++)+"\t <> getMovieWithOldestActor <>: " + MovieArrayOperations.getMovieWithOldestActor(moviesMiddle));
        System.out.println("Count: "+(testCount++)+"\t <> getMovieWithOldestActor <>: " + MovieArrayOperations.getMovieWithOldestActor(noActors));
    }
}
