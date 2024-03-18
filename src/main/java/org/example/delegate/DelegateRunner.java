package org.example.delegate;

public class DelegateRunner {
    public static void main(String[] args) {
        Artist artist = new Artist();
        artist.setGraphics(new Square());
        artist.showGraphic();
        artist.setGraphics(new Triangle());
        artist.showGraphic();
        artist.setGraphics(new Circle());
        artist.showGraphic();
    }
}

interface Graphics {
    void showGraphic();
}

class Square implements Graphics {
    @Override
    public void showGraphic() {
        System.out.println("квадрат");
    }
}

class Triangle implements Graphics {
    @Override
    public void showGraphic() {
        System.out.println("треугольник");
    }
}

class Circle implements Graphics {
    @Override
    public void showGraphic() {
        System.out.println("круг");
    }
}

class Artist {
    Graphics graphics;

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    void showGraphic() {
        graphics.showGraphic();
    }
}