package org.example.behavirolPatterns.command;

public class ResetCommand implements Command {
    Comp comp;

    public ResetCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.reset();
    }
}
