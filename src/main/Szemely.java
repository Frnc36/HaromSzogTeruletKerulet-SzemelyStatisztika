package main;

public class Szemely {
    private String nev;
    private int szulEv;

    public Szemely() {
        this("ismeretlen", 0);
    }

    public Szemely(String nev, int szulEv) {
        setNev(nev);
        setSzulEv(szulEv);
    }

    public String getNev() {
        return nev;
    }

    public int getSzulEv() {
        return szulEv;
    }

    public void setNev(String nev) {
        if (nev.isBlank()) {
            nev = "Fani";
        }
        this.nev = nev;
    }

    public void setSzulEv(int szulEv) {
        if (szulEv < 1900) {
            szulEv = 2000;
        }
        this.szulEv = szulEv;
    }
    
    
    
    
    
}//class
