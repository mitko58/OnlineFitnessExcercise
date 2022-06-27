package com.company;

public class LayDownCommand implements Command {

    private Positions positions;

    public LayDownCommand(Positions positions) {
        this.positions = positions;

    }
    @Override
    public void execute() {
        this.positions.layDown();
    }
}
