package org.example.behavirolPatterns.chainOfResponsibility;

public class EmailLogger extends Logger {
    public EmailLogger(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("Отправил сообщение на почту: " + message);
    }
}
