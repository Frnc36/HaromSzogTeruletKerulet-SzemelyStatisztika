package main;

import java.time.LocalDate;

public class Statisztika {
    private static void koszontes(String s) {
        koszontes(s, false);
    }

    //private static String koszontes(String[] s, int velszam)
    private static String koszontes(String[] s, boolean keveres) {
        //return s[velszam];
        String t[] = {"Szia", "Szius", "Hello"};
        if (keveres) {
            int i = (int) (Math.random() * t.length);
        }
    }

    private static int eletKorSzamitas(int szulEv, LocalDate maiEv) {
        return maiEv.getYear() - szulEv;
    }

    private static int nyugdijSzamitas(int eletkor) {
        int i = 0;
        while (eletkor < 65) {
            eletkor++;
            i++;
        }
        return i;
    }

    private static boolean pozitivSzam(int szulEv) {
        return szulEv > 0;
    }
}
