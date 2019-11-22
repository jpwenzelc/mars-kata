public class Rover {
    private int y;
    private int x;
    private String orientation;

    public Rover() {
        y = 0;
        orientation = "N";
    }

    public String getOrientation() {
        return orientation;
    }

    public void newOrientation(String newOrientation) {
        orientation = newOrientation;
    }

    public int getYCoordinate() {
        return y;
    }

    public void setYCoordinate(int newY) {
        y = newY;
    }

    public int getXCoordinate() {
        return x;
    }

    public void setXCoordinate(int newX) {
        x = newX;
    }

    void rotateLeft() {
        if (getOrientation().equals("N")){
            newOrientation("W");
        } else if (getOrientation().equals("W")){
            newOrientation("S");
        } else if (getOrientation().equals("S")){
            newOrientation("E");
        } else if (getOrientation().equals("E")){
            newOrientation("N");
        }
    }

    void rotateRight() {
        if (getOrientation().equals("N")){
            newOrientation("E");
        } else if (getOrientation().equals("E")){
            newOrientation("S");
        } else if (getOrientation().equals("S")){
            newOrientation("W");
        } else if (getOrientation().equals("W")){
            newOrientation("N");
        }
    }

    void moveForward() {
        if ("E".equals(getOrientation())){
            setXCoordinate(getXCoordinate() + 1);
        } else if ("N".equals(getOrientation())){
            setYCoordinate(getYCoordinate() + 1);
        } else if ("W".equals(getOrientation())){
            setXCoordinate(getXCoordinate() - 1);
        } else if ("S".equals(getOrientation())){
            setYCoordinate(getYCoordinate() - 1);
        }
    }
}
