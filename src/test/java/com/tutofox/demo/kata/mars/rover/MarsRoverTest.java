package com.tutofox.demo.kata.mars.rover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsRoverTest {


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    /*We can start by ignoring the obstacles in the first iteration. In Test-Driven Development (TDD),
     we will write tests first and then implement the functionality to make those tests pass.
     */

    /* Here's the first step:
    Step 1: Define the Basic Functionality

    Requirements:

    Take the rover's starting point (x, y) and direction (N, S, E, W).
    Take a list of commands to move the rover (↑: move forward, →: turn right 90°, ←: turn left 90°).
   */

     /*   Feature: Mars Rover Movement
    Scenario: Moving Forward
    Given: the rover's initial position is (0, 0) and it is facing North
    When: the rover receives the command "↑" [↑ (alt enfoncé+24+relache alt)]     [↓ (alt enfoncé+25+relache alt)]  [→ (alt enfoncé+26+relache alt)] [← (alt enfoncé+27+relache alt)]   [∟ (alt enfoncé+28+relache alt)]  [↔ (alt enfoncé+29+relache alt)] ▲ ▼  ! "
    Then: the rover's position should be (0, 1) and it should be facing North

    /*  Implementation Plan

   1. Write a test for the rover moving forward.
   2. Implement the functionality to make the test pass.
    */


    @Test
    public void testMoveForward() {
        MarsRover marsRover = new MarsRover(0,0,"N", new int[][]{});
        marsRover.executeCommands(new char[]{'↑'});
        Assertions.assertEquals("(0, 1, N)", marsRover.getPosition());
    }

   /* Step 2: Add Functionality for Turning
    Let's continue by adding the functionality for turning left and right. We'll write tests for the rover to turn left (←) and right (→), and then implement the code to make these tests pass.

    Test Case 2: Turning Left
    Test 2: Turning Left

    Initial position: (0, 0), facing North (N)
    Command: ←
    Expected position: (0, 0), facing West (W)


    Test 3: Turning Right

    Initial position: (0, 0), facing North (N)
    Command: →
    Expected position: (0, 0), facing East (E)
    Gherkin Syntax

    Turning Left

    Gherkin

    Feature: Mars Rover Movement

    Scenario: Turning Left
    Given the rover's initial position is (0, 0) and it is facing North
    When the rover receives the command "←"
    Then the rover's position should be (0, 0) and it should be facing West
    Turning Right



    Feature: Mars Rover Movement

    Scenario: Turning Right
    Given the rover's initial position is (0, 0) and it is facing North
    When the rover receives the command "→"
    Then the rover's position should be (0, 0) and it should be facing East */

    @Test
    public void testTurnLeft() {
        MarsRover rover = new MarsRover(0, 0, "N", new int[][]{});
        rover.executeCommands(new char[]{'←'});
        Assertions.assertEquals("(0, 0, W)", rover.getPosition());
    }

    @Test
    public void testTurnRight() {
        MarsRover rover = new MarsRover(0, 0, "N",new int[][]{});
        rover.executeCommands(new char[]{'→'});
        Assertions.assertEquals("(0, 0, E)", rover.getPosition());
    }

    /*
     let's add some additional tests to cover more complex sequences of movements and turns. Here are a few test cases:

    Test Case 4: Move Forward, Turn Left, Move Forward
    Test 4:

    Initial position: (0, 0), facing North (N)
    Commands: ↑, ←, ↑
    Expected position: (-1, 1), facing West (W)
    */
    @Test
    public void testMoveForwardThenTurnLeftThenMoveForward() {
        MarsRover rover = new MarsRover(0, 0, "N",new int[][]{});
        rover.executeCommands(new char[]{'↑', '←', '↑'});
        Assertions.assertEquals("(-1, 1, W)", rover.getPosition());
    }
    /*Test Case 5: Move Forward, Turn Right, Move Forward

    Test 5:

    Initial position: (0, 0), facing North (N)
    Commands: ↑, →, ↑
    Expected position: (1, 1), facing East (E)
    */
    @Test
    public void testMoveForwardThenTurnRightThenMoveForward() {
        MarsRover rover = new MarsRover(0, 0, "N",new int[][]{});
        rover.executeCommands(new char[]{'↑', '→', '↑'});
        Assertions.assertEquals("(1, 1, E)", rover.getPosition());
    }

  /*  Test Case 6: Move in a Square
    Test 6:

    Initial position: (0, 0), facing North (N)
    Commands: ↑, →, ↑, →, ↑, →, ↑, →
    Expected position: (0, 0), facing North (N)
    Gherkin Syntax
    Move Forward, Turn Left, Move Forward
     */
    @Test
    public void testMoveInSquare() {
        MarsRover rover = new MarsRover(0, 0, "N",new int[][]{});
        rover.executeCommands(new char[]{'↑', '→', '↑', '→', '↑', '→', '↑', '→'});
        Assertions.assertEquals("(0, 0, N)", rover.getPosition());
    }


    //Step 3: Introduce Obstacle Detection

 /* Test Case 7: Encountering an Obstacle
    Test 7:

    Initial position: (0, 0), facing North (N)
    Obstacles: [(0, 1)]
    Commands: ↑
    Expected position: (0, 0), facing North (N) (since the rover should stop when encountering an obstacle)
    Gherkin Syntax
    Encountering an Obstacle

    Gherkin
    Feature: Mars Rover Movement with Obstacles

    Scenario: Encountering an Obstacle
    Given the rover's initial position is (0, 0) and it is facing North
    And there is an obstacle at (0, 1)
    When the rover receives the command "↑"
    Then the rover's position should be (0, 0) and it should be facing North */

    @Test
    public void testEncounteringObstacle() {
        MarsRover rover = new MarsRover(0, 0, "N",new int[][]{{0,1}});
        rover.executeCommands(new char[]{'↑'});
        Assertions.assertEquals("(0, 0, N)", rover.getPosition());
    }

}
