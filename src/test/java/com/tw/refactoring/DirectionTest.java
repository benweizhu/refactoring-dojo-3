package com.tw.refactoring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DirectionTest {

    private Direction north;
    private Direction east;

    @BeforeEach
    public void setUp() throws Exception {
        north = new Direction('N');
        east = new Direction('E');
    }

    @Test
    public void shouldTurnEastWhenTurnRightFromNorth() {
        Direction east = north.turnRight();
        assertEquals(east, new Direction('E'));
    }

    @Test
    public void shouldTurnWestWhenTurnLeftFromNorth() {
        Direction west = north.turnLeft();
        assertEquals(west, new Direction('W'));
    }

    @Test
    public void shouldTurnNorthWhenTurnLeftFromEast() {
        Direction north = east.turnLeft();
        assertEquals(north, new Direction('N'));
    }
}
