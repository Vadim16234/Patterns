package org.example.behavirolPatterns.observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

class FileObserver implements Observer {
    @Override
    public void handleEvent(int temp, int presser) {
        File f;
        try {
            f = File.createTempFile("TempPressure", "_txt");
            PrintWriter pw = new PrintWriter(f);
            pw.print("Погода изменилась. Температура = " + temp + ", Давление = " + presser);
            pw.println();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
