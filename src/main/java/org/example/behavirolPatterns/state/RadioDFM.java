package org.example.behavirolPatterns.state;

class RadioDFM implements Station {
    @Override
    public void play() {
        System.out.println("Радио DFM...");
    }
}
