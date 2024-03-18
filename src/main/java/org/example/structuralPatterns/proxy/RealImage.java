package org.example.structuralPatterns.proxy;

class RealImage implements Image {
    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    void load() {
        System.out.println("Происходит загрузка файла " + file);
    }

    @Override
    public void display() {
        System.out.println("Просмотр файла " + file);
    }
}
