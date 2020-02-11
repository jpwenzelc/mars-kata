import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoordinateTest {

    private Coordinate coordinate;

    @Test
    void should_move_y_plus_1_when_given_a_north_orientation() {
        given_a_new_coordinate(0,0);

        when_move_forward_is_executed_looking("N");

        then_the_new_coordinate_is(0,1);
    }

    @Test
    void should_move_y_negative_when_given_a_south_orientation() {
        given_a_new_coordinate(0,0);

        when_move_forward_is_executed_looking("S");

        then_the_new_coordinate_is(0, -1);
    }

    @Test
    void should_move_x_positive_when_given_an_east_orientation() {
        given_a_new_coordinate(0,0);

        when_move_forward_is_executed_looking("E");

        then_the_new_coordinate_is(1, 0);
    }

    @Test
    void should_move_x_negative_when_given_a_west_orientation() {
        given_a_new_coordinate(0,0);

        when_move_forward_is_executed_looking("W");

        then_the_new_coordinate_is(-1, 0);
    }

    private void then_the_new_coordinate_is(int x, int y) {
        assertEquals(new Coordinate(x,y), coordinate);
    }

    private void when_move_forward_is_executed_looking(String direction) {
        coordinate = coordinate.moveForward(new Orientation(direction));
    }

    private void given_a_new_coordinate(int x, int y) {
        coordinate = new Coordinate(x,y);
    }
}