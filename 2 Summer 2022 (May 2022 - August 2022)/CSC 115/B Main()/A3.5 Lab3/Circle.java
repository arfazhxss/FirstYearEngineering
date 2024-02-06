public class Circle implements Shape {

    private int radius;
    private Point position; // position is the (x,y) coordinates of center of the circle


    /*
     * Purpose: initializes this Circle with radius of 0
     *   and position to new Point at 0,0
     * Parameters: none
     */
    public Circle () {
        this.radius = 0;
        this.position = new Point();
    }

    /*
     * Purpose: initializes this Circle with given radius
     *   and position to new Point at 0,0
     * Parameters: int radius
     * Precondition: given radius >=0
     */
    public Circle (int radius) {
        this.radius = radius;
        this.position = new Point();
    }

    /*
     * Purpose: initializes this Circle with given radius and position
     * Parameters: int radius, Point position
     * Precondition: given radius >=0, position is not null
     */
    public Circle (int radius, Point position) {
        this.radius = radius;
        this.position = position;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return Math.PI * radius * 2;
    }

    public boolean contains(Point pt){
        int ptX = pt.getX();
        int ptY = pt.getY();

        int positionX = position.getX();
        int positionY = position.getY();

        int xDistance = ptX-positionX;
        int yDistance = ptY-positionY;

        return ((Math.pow(xDistance,2) + Math.pow(yDistance,2))
                <= Math.pow(radius, 2));
    }


    public String toString() {
        return "Circle of radius: " + radius + " at Point: " + position;
    }

}
