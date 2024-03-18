package org.example.creatingPatterns.prototype;

class HumanFactory {
    Human human;

    public HumanFactory(Human human) {
        this.human = human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    Human makeCopy() {
        return (Human) human.copy();
    }
}
