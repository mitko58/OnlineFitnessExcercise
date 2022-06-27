package com.company;

public class Positions {

    private boolean layDown;

    public void layDown() {
        System.out.println("Instructor change position to 'layDown'");
        this.layDown = true;
    }

    public void standUp() {
        System.out.println("Instructor change position to 'standUp'");
        this.layDown = false;
    }
}
