public class Rover {

    private Coordinate position;
    private Orientation orientation;

    public Rover() {
        position = new Coordinate(0,0);
        orientation = new Orientation();
    }

    void rotateLeft() {
        orientation.rotateLeft();
    }

    void rotateRight() {
        orientation.rotateRight();
    }

    void moveForward() {
        position = position.moveForward(orientation);
    }

    public String currentLocalization(){
        return String.format("%s:%s:%s", position.getX(), position.getY(), orientation.getOrientation());
    }

}
