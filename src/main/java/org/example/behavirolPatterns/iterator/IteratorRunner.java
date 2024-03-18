package org.example.behavirolPatterns.iterator;

class IteratorRunner {
    public static void main(String[] args) {
        ConcreteAggregate c = new ConcreteAggregate();

        Iterator it = c.getIterator();

        while (it.hasNext()) {
            System.out.println((String) it.next());
        }
    }
}
