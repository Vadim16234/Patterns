package org.example.behavirolPatterns.strategy;

class StrategyClient {
    Sorting strategy;
    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int[] arr) {
        strategy.sort(arr);
    }
}
