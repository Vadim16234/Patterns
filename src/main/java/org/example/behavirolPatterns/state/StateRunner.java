package org.example.behavirolPatterns.state;

class StateRunner {
    public static void main(String[] args) {
        Station station = new RadioDFM();
        Radio radio = new Radio();
        radio.setStation(station);

        for (int i = 0; i < 10; i++) {
            radio.play();
            radio.nextStation();
        }
    }
}
