package org.example.behavirolPatterns.command;

class User {
    Command start;
    Command stop;
    Command reset;

    public User(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    void startComp() {
        start.execute();
    }

    void stopComp() {
        stop.execute();
    }

    void resetComp() {
        reset.execute();
    }
}
