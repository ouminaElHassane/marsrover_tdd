package com.tutofox.demo.kata.mars.rover;

import java.util.HashSet;
import java.util.Set;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    private Set<String> obstacles;

    MarsRover(int x, int y, String direction, int [][] obstacles) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.obstacles = new HashSet<>();
        for (int[] obstacle : obstacles) {
            this.obstacles.add(String.format("%d,%d", obstacle[0], obstacle[1]));
        }
    }

    public void executeCommands(char[] commands) {
        for (char command : commands) {
            if (command == '↑') {
                moveForward();
            }
            if (command == '←') {
                turnLeft();
            }
            if (command == '→') {
                turnRight();
            }
        }
    }

    private void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "W":
                direction = "S";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
                break;
        }
    }


    private void moveForward() {
        int newX = x;
        int newY = y;

        switch (direction) {
            case "N":
                newY += 1;
                break;
            case "S":
                newY -= 1;
                break;
            case "E":
                newX += 1;
                break;
            case "W":
                newX -= 1;
                break;
        }

        if (!obstacles.contains(newX + "," + newY)) {
            x = newX;
            y = newY;
        }
    }

    public String getPosition() {
        return String.format("(%d, %d, %s)", x, y, direction);
    }
}
