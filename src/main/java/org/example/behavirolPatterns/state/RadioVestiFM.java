package org.example.behavirolPatterns.state;

class RadioVestiFM implements Station {
    @Override
    public void play() {
        System.out.println("Вести FM...");
    }
}
