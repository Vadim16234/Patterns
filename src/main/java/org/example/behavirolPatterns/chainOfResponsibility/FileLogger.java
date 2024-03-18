package org.example.behavirolPatterns.chainOfResponsibility;

class FileLogger extends Logger {
    public FileLogger(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("Пишем в файл: " + message);
    }
}
