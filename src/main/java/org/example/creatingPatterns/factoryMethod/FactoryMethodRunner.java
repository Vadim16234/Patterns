package org.example.creatingPatterns.factoryMethod;

public class FactoryMethodRunner {
    public static void main(String[] args) {
        MakerPen makerPen = new MakerPenGermany();
        Pen pen = makerPen.createPen();
        pen.showPen();

        makerPen = new MakerPenTaiwan();
        pen = makerPen.createPen();
        pen.showPen();

        makerPen = new MakerPenJapan();
        pen = makerPen.createPen();
        pen.showPen();
    }
}

interface Pen {
    void showPen();
}

class PenGermany implements Pen {

    @Override
    public void showPen() {
        System.out.println("Lamy Safary Fine");
    }
}

class PenTaiwan implements Pen {

    @Override
    public void showPen() {
        System.out.println("TWSBI Extra Fine");
    }
}

class PenJapan implements Pen{

    @Override
    public void showPen() {
        System.out.println("Pilot Falcon FA Medium");
    }
}

interface MakerPen {
    Pen createPen();
}
class MakerPenGermany implements MakerPen{

    @Override
    public Pen createPen() {
        return new PenGermany();
    }
}

class MakerPenTaiwan implements MakerPen{

    @Override
    public Pen createPen() {
        return new PenTaiwan();
    }
}

class MakerPenJapan implements MakerPen {

    @Override
    public Pen createPen() {
        return new PenJapan();
    }
}