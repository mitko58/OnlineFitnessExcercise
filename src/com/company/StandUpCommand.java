package com.company;

public class StandUpCommand implements Command {

    private Positions positions;

    public StandUpCommand(Positions positions) {

        this.positions = positions;

    }
    @Override
    public void execute() {
        this.positions.standUp();
    }
}
