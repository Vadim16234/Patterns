package org.example.creatingPatterns.prototype;

class PrototypeRunner {
    public static void main(String[] args) {
        Human origin = new Human(29, "Vadim");
        System.out.println(origin);

        Human copy = (Human) origin.copy();
        System.out.println(copy);

        // Фабрика
        HumanFactory humanFactory = new HumanFactory(copy); // передал копию оригинала
        Human h1 = humanFactory.makeCopy(); // сделал копию копии
        System.out.println(h1);

        humanFactory.setHuman(new Human(30, "Дмитрий"));
        Human h2 = humanFactory.makeCopy();
        System.out.println(h2);
    }
}
