public class Rover {

    private Orientation orientation;
    private int y;
    private int x;

    public Rover() {
        this.orientation = new Orientation();
    }

    public int getYCoordinate() {
        return y;
    }

    public int getXCoordinate() {
        return x;
    }

    public String getOrientation() {
        return orientation.orientation;
    }

    void rotateLeft() {
        orientation.rotateLeft();
    }

    void rotateRight() {
        orientation.rotateRight();
    }

    void moveForward() {
        if ("E".equals(orientation.orientation)){
            x ++;
        } else if ("N".equals(orientation.orientation)){
            y ++;
        } else if ("W".equals(orientation.orientation)){
            x --;
        } else if ("S".equals(orientation.orientation)){
            y --;
        }
    }

}
