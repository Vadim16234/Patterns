package org.example.structuralPatterns.fasade;

class FasadeRunner {
    public static void main(String[] args) {
        FasadeComputer computer = new FasadeComputer();
        computer.copy();
    }
}

class Power {
    void on() {
        System.out.println("Включение питание");
    }

    void off() {
        System.out.println("Выключение питание");
    }
}

class DVDRom {
    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    void load() {
        data = true;
    }

    void unload() {
        data = false;
    }
}

class HDD {
    void copyFromDVD(DVDRom dvd) {
        if (dvd.hasData()) {
            System.out.println("клонируем");
        } else {
            System.out.println("вставьте диск с данными");
        }
    }
}

class FasadeComputer{
    Power power = new Power();
    DVDRom dvd = new DVDRom();
    HDD hdd = new HDD();

    void copy() {
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);
    }
}
