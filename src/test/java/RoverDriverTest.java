import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverDriverTest {

    private Rover rover;
    private RoverDriver roverDriver;
    private String command;
    private String output;

    @Test
    void execute_command_with_a_r_should_change_the_direction_of_the_rover_to_east() {
        given_a_rover();
        given_a_rover_driver();
        given_a_right_command();

        when_the_command_is_executed();

        then_the_new_rover_direction_is_east();
    }

    @Test
    void execute_command_with_a_rr_should_change_the_direction_of_the_rover_to_south() {
        given_a_rover();
        given_a_rover_driver();
        given_a_rr_command();

        when_the_command_is_executed();

        then_the_new_rover_direction_is_south();
    }

    @Test
    void execute_command_with_a_rrr_should_change_the_direction_of_the_rover_to_west() {
        given_a_rover();
        given_a_rover_driver();
        given_a_rrr_command();

        when_the_command_is_executed();

        then_the_new_rover_direction_is_west();
    }

    @Test
    void execute_command_with_a_l_should_change_the_direction_of_the_rover_to_west() {
        given_a_rover();
        given_a_rover_driver();
        given_a_l_command();

        when_the_command_is_executed();

        then_the_new_rover_direction_is_west();
    }

    private void given_a_l_command() {
        command = "L";
    }

    private void then_the_new_rover_direction_is_west() {
        assertEquals("0:0:W", output);
    }

    private void given_a_rrr_command() {
        command = "RRR";
    }

    private void then_the_new_rover_direction_is_south() {
        assertEquals("0:0:S", output);
    }

    private void given_a_rr_command() {
        command = "RR";
    }

    private void then_the_new_rover_direction_is_east() {
        assertEquals("0:0:E", output);
    }

    private void when_the_command_is_executed() {
        output = roverDriver.executeCommand(command);
    }

    private void given_a_right_command() {
        command = "R";
    }

    private void given_a_rover_driver() {
        roverDriver = new RoverDriver(rover);
    }

    private void given_a_rover() {
        rover = new Rover();
    }
}