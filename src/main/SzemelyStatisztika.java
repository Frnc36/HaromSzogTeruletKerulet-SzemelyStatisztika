package main;

import java.time.LocalDate;

public class SzemelyStatisztika {

    public static void main(String[] args) {
        Program();
    }//main

    private static void Program() throws IllegalArgumentException {
        String nev = "Fani";
        int szulEv = 2004;
        LocalDate maiEv = LocalDate.now();

        if (!pozitivSzam(szulEv)) {
            throw new IllegalArgumentException("Nem lehet negatív a szám!");
        }

        int eletKor = eletKorSzamitas(szulEv, maiEv);
        int n = nyugdijSzamitas(eletKor);

        String s = "Szia %s, %d éves vagy!".formatted(nev, eletKor);
        s += "\nNyugdíjig még van %d éved!".formatted(n);
        koszontes(s);
    }

    private static void koszontes(String s) {
        System.out.println(s);
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

}//class
