package com.plygrnd.java.college.tasks.task20220118;

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

public class PolymorphismTask {

    private static final String SENJATA_CAPTAIN_AMERAICA = "Tameng";
    private static final String SENJATA_THOR = "Palu";
    private static final String SENJATA_IRON_MAN = "Jet Pack";

    private static void cetakInfoNenekMoyang(NenekMoyang nenekMoyang) {
        System.out.println("Nenek moyang punya senjata " + nenekMoyang.senjata + " yang berfungsi untuk " + nenekMoyang.fungsiSenjata());
    }

    public static void main(String[] args) {

        CaptainAmerica captainAmerica = new CaptainAmerica(SENJATA_CAPTAIN_AMERAICA);
        Thor thor = new Thor(SENJATA_THOR);
        IronMan ironMan = new IronMan(SENJATA_IRON_MAN);

        cetakInfoNenekMoyang(captainAmerica);
        cetakInfoNenekMoyang(thor);
        cetakInfoNenekMoyang(ironMan);

    }

}
