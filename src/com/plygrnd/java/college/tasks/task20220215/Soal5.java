package com.plygrnd.java.college.tasks.task20220215;

class NenekMoyang {

    protected String senjata;

    protected String fungsiSenjata() {
        return "Tidak ada";
    }

}

class CaptainAmerica extends NenekMoyang {

    CaptainAmerica(String senjata) {
        this.senjata = senjata;
    }

    @Override
    protected String fungsiSenjata() {
        return "bertahan dari musuh";
    }

}

class Thor extends NenekMoyang {

    Thor(String senjata) {
        this.senjata = senjata;
    }

    @Override
    protected String fungsiSenjata() {
        return "memanggil halilintar";
    }

}

class IronMan extends NenekMoyang {

    IronMan(String senjata) {
        this.senjata = senjata;
    }

    @Override
    protected String fungsiSenjata() {
        return "terbang";
    }
}

public class Soal5 {

    public static void main(String[] args) {

        CaptainAmerica captainAmerica = new CaptainAmerica("Tameng");
        Thor thor = new Thor("Palu");
        IronMan ironMan = new IronMan("Jet Pack");

        System.out.println("Nenek moyang punya senjata " + captainAmerica.senjata + " yang berfungsi untuk " + captainAmerica.fungsiSenjata());
        System.out.println("Nenek moyang punya senjata " + thor.senjata + " yang berfungsi untuk " + thor.fungsiSenjata());
        System.out.println("Nenek moyang punya senjata " + ironMan.senjata + " yang berfungsi untuk " + ironMan.fungsiSenjata());

    }

}