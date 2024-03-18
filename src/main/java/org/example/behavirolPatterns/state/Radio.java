package org.example.behavirolPatterns.state;

class Radio {
    Station station;

    void setStation(Station st) {
        station = st;
    }

    void nextStation() {
        if (station instanceof Radio7) {
            setStation(new RadioDFM());
        } else if (station instanceof RadioDFM) {
            setStation(new RadioVestiFM());
        } else if (station instanceof RadioVestiFM) {
            setStation(new Radio7());
        }
    }

    void play() {
        station.play();
    }
}
