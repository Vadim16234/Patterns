package org.example.creatingPatterns.singleton;

class SingletonRunner {
    public static void main(String[] args) {
        final int SIZE = 10;

        Singleton[] arr = new Singleton[SIZE];
        for (int i = 0; i < 10; i++) {
            arr[i] = Singleton.getInstance();
        }
        System.out.println(Singleton.counter);
    }
}

class Singleton {
    public static int counter = 0;
    private static Singleton instance;
    private Singleton() {
        counter++;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
