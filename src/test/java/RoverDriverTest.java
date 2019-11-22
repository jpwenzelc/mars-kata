import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverDriverTest {

    private Rover rover;
    private RoverDriver roverDriver;
    private String command;
    private String output;

    @BeforeEach
    void setUp() {
        given_a_rover();
        given_a_rover_driver();
    }

    @Test
    void execute_command_with_a_r_should_change_the_direction_of_the_rover_to_east() {
        given_a_command("R");

        when_the_command_is_executed();

        then_the_new_rover_position_is("0:0:E");
    }

    @Test
    void execute_command_with_a_rr_should_change_the_direction_of_the_rover_to_south() {
        given_a_command("RR");

        when_the_command_is_executed();

        then_the_new_rover_position_is("0:0:S");
    }

    @Test
    void execute_command_with_a_rrr_should_change_the_direction_of_the_rover_to_west() {
        given_a_command("RRR");

        when_the_command_is_executed();

        then_the_new_rover_position_is("0:0:W");
    }

    @Test
    void execute_command_with_a_l_should_change_the_direction_of_the_rover_to_west() {
        given_a_command("L");

        when_the_command_is_executed();

        then_the_new_rover_position_is("0:0:W");
    }

    @Test
    void execute_command_with_a_m_should_move_the_y_coordinate_to_1() {
        given_a_command("M");

        when_the_command_is_executed();

        then_the_new_rover_position_is("0:1:N");
    }

    @Test
    void execute_command_with_a_mm_should_move_the_y_coordinate_to_2() {
        given_a_command("MM");

        when_the_command_is_executed();

        then_the_new_rover_position_is("0:2:N");
    }

    @Test
    void execute_command_with_a_rm_should_make_the_rover_end_in_10E() {
        given_a_command("RM");

        when_the_command_is_executed();

        then_the_new_rover_position_is("1:0:E");
    }

    private void then_the_new_rover_position_is(String expectedPosition) {
        assertEquals(expectedPosition, output);
    }

    private void given_a_command(String command) {
        this.command = command;
    }

    private void then_the_new_rover_position_is_01N() {
        assertEquals("0:1:N", output);
    }

    private void then_the_new_rover_direction_is_west() {
        assertEquals("0:0:W", output);
    }

    private void then_the_new_rover_direction_is_south() {
        assertEquals("0:0:S", output);
    }

    private void then_the_new_rover_direction_is_east() {
        assertEquals("0:0:E", output);
    }

    private void when_the_command_is_executed() {
        output = roverDriver.executeCommand(command);
    }

    private void given_a_rover_driver() {
        roverDriver = new RoverDriver(rover);
    }

    private void given_a_rover() {
        rover = new Rover();
    }
}