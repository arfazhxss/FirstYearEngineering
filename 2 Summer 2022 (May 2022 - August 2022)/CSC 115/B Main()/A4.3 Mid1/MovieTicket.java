public class MovieTicket {
    private String movieName;
    private double price;
    private int seatNumber;

    public MovieTicket() {
        price = 0.0;
        seatNumber = 0;
        movieName = "";
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    
    public String toString() {
        return "Seat number: "+seatNumber +" for " + movieName;
    }
}