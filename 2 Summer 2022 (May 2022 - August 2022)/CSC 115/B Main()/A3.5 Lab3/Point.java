public class Point{

    private int x;
    private int y;


    /*
     * Purpose: initializes this Point with x and y of 0
     * Parameters: none
     */
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    /*
     * Purpose: initializes this Point with given x and y
     * Parameters: int x, int y
     */
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    /*
     * Purpose: sets x of this Point to given x
     * Parameters: int x
     * Returns: void
     */
    public void setX(int x){
        this.x = x;
    }

    /*
     * Purpose: returns x of this Point
     * Parameters: none
     * Returns: int - this x
     */
    public int getX() {
        return this.x;
    }

    /*
     * Purpose: sets y of this Point to given y
     * Parameters: int y
     * Returns: void
     */
    public void setY(int y){
        this.y = y;
    }

    /*
     * Purpose: returns y of this Point
     * Parameters: none
     * Returns: int - this y
     */
    public int getY() {
        return this.y;
    }

    /*
     * Purpose: returns String representation of this Point
     * Parameters: none
     * Returns: String - a representation of this Point
     */
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
