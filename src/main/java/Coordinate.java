import java.util.Objects;

public class Coordinate {
    private int y;
    private int x;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate moveForward(Orientation orientation){
        if ("N".equals(orientation.getOrientation()))
            return new Coordinate(x, y + 1);
        if ("S".equals(orientation.getOrientation()))
            return new Coordinate(x, y - 1);
        if ("E".equals(orientation.getOrientation()))
            return new Coordinate(x + 1, y);
        if ("W".equals(orientation.getOrientation()))
            return new Coordinate(x - 1, y);
        return null;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return y == that.y &&
                x == that.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(y, x);
    }
}