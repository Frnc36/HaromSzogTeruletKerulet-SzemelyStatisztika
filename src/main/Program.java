package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Program {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;

//        System.out.println(haromszogKerulet(a, b, c));
//        System.out.println(haromszogTerulet(a, b, c));
        int k = haromszogKerulet(a, b, c);
        double t = haromszogTerulet(a, b, c);

        String adat = "A %d, %d, %d oldalú háromszög".formatted(a, b, c);
        adat += "\n\tkerülete: %d, területe: %.2f".formatted(k, t);
        megjelenites(adat);
    }//main

    private static int haromszogKerulet(int a, int b, int c) {
        //int kerulet = a + b + c;
        //return kerulet;
        return a + b + c;
    }

    private static double haromszogTerulet(int a, int b, int c) {
        //int terulet = a + b + c / 2;
        int s = haromszogKerulet(a, b, c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    private static void megjelenites(String adat) {
        try {
            boolean jog = true;
            if (!jog) {
                throw new IOException("Nincs írási jog!");
            }
            //Files.write(Path.of("kimenet.txt"), adat.getBytes());
        } catch (IOException ex) {
            //API generálta - Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Nem sikerült a fájlba írás!");
            System.err.println("Hiba oka: " + ex.getMessage());
        }
    }

}//class
