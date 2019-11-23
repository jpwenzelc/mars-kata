import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RoverTest {

    private Rover rover;

    @BeforeEach
    void setUp() {
        given_a_rover();
    }

    @Test
    void should_face_w_if_it_rotates_left_after_instantiation() {
        when_the_rover_rotates_left();

        then_the_orientation_should_be("W");
    }

    @Test
    void should_face_s_if_the_rotates_left_twice_after_instantiation() {
        when_the_rover_rotates_left();
        when_the_rover_rotates_left();

        then_the_orientation_should_be("S");
    }

    @Test
    void should_face_e_if_the_rotates_left_three_times_after_instantiation() {
        when_the_rover_rotates_left();
        when_the_rover_rotates_left();
        when_the_rover_rotates_left();

        then_the_orientation_should_be("E");
    }

    @Test
    void should_face_n_if_the_rotates_left_four_times_after_instantiation() {
        when_the_rover_rotates_left();
        when_the_rover_rotates_left();
        when_the_rover_rotates_left();
        when_the_rover_rotates_left();

        then_the_orientation_should_be("N");
    }

    @Test
    void should_face_e_if_the_rotates_right_after_instantiation() {
        when_the_rover_rotates_right();

        then_the_orientation_should_be("E");
    }

    private void when_the_rover_rotates_right() {
        rover.rotateRight();
    }

    private void then_the_orientation_should_be(String orientation) {
        assertTrue(orientation.equals(rover.getOrientation()));
    }

    private void when_the_rover_rotates_left() {
        rover.rotateLeft();
    }

    private void given_a_rover() {
        rover = new Rover();
    }
}
