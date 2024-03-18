package org.example.behavirolPatterns.command;

public class StartCommand implements Command {
    Comp comp;

    public StartCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.start();
    }
}
