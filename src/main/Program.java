package main;

public class Program {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;

//        System.out.println(haromszogKerulet(a, b, c));
//        System.out.println(haromszogTerulet(a, b, c));
        int k = haromszogKerulet(a, b, c);
        double t = haromszogTerulet(a, b, c);

        String szoveg = "A %d, %d, %d oldalú háromszög".formatted(a, b, c);
        szoveg += "\n\tkerülete: %d, területe: %.2f".formatted(k, t);
        megjelenites(szoveg);
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

    private static void megjelenites(String szoveg) {
        System.out.println(szoveg);
    }

}//class
