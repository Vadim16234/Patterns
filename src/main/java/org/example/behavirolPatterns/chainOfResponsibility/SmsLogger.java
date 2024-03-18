package org.example.behavirolPatterns.chainOfResponsibility;

class SmsLogger extends Logger {
    public SmsLogger(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("смс: " + message);
    }
}
