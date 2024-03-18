package org.example.behavirolPatterns.command;

class CommandRunner {
    public static void main(String[] args) {
        Comp c = new Comp();
        User u = new User(new StartCommand(c), new StopCommand(c), new ResetCommand(c));

        u.startComp();
        u.stopComp();
        u.resetComp();
    }
}
