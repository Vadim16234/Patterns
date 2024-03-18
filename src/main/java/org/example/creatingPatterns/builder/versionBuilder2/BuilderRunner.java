package org.example.creatingPatterns.builder.versionBuilder2;

class BuilderRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new SubaruBuilder()); // тут меняем билдер на другой и получаем новый объект
        Car car = director.buildCar();
        System.out.println(car);
    }
}
