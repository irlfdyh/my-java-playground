package com.plygrnd.java.college.tasks.task20220215;

class Komputer {

    protected String merk;
    protected int memori;

    public void cetakInfo() {
        System.out.println("Spek Komputer Belum Diketahui");
    }

}

class Desktop extends Komputer {

    private final String modelDesktop;
    private final String processorDesktop;

    public Desktop() {
        super.merk = "\"Belum Diketahui\"";
        this.modelDesktop = "\"Belum Diketahui\"";
        this.processorDesktop = "\"Belum Diketahui\"";
        super.memori = 0;
    }

    public Desktop (String modelDesktop, String processorDesktop) {
        this.modelDesktop = modelDesktop;
        this.processorDesktop = processorDesktop;
    }

    public void setMemori(int memori) {
        super.memori = memori;
    }

    public void setMerk(String merk) {
        super.merk = merk;
    }
    public void cetakInfo() {
        System.out.println("Merk Desktop        : " + super.merk);
        System.out.println("Model Desktop       : " + this.modelDesktop);
        System.out.println("Prosessor Desktop   : " + this.processorDesktop);
        System.out.println("Memori Desktop      : " + super.memori + " GB");
    }

}

class Laptop extends Komputer {

    private final String modelLaptop;
    private final String processorLaptop;

    public Laptop() {
        super.merk = "\"Belum Diketahui\"";
        this.modelLaptop = "\"Belum Diketahui\"";
        this.processorLaptop = "\"Belum Diketahui\"";
        super.memori = 0;
    }

    public Laptop(String modelLaptop, String processorLaptop) {
        this.modelLaptop = modelLaptop;
        this.processorLaptop = processorLaptop;
    }

    public void setMemori(int memori) {
        super.memori = memori;
    }

    public void setMerk(String merk) {
        super.merk = merk;
    }

    public void cetakInfo() {
        System.out.println("Merk Laptop        : " + super.merk);
        System.out.println("Model Laptop       : " + this.modelLaptop);
        System.out.println("Prosessor Laptop   : " + this.processorLaptop);
        System.out.println("Memori Laptop      : " + super.memori + " GB");
    }

}

public class Soal4 {

    public static void main(String[] args) {

        Komputer komputer = new Komputer();
        System.out.println("Memanggil metode cetakInfo di objek komputer");
        komputer.cetakInfo();

        System.out.println("\nMemanggil metode cetakInfo di objek desktop1");
        Desktop desktop1 = new Desktop();
        desktop1.cetakInfo();

        System.out.println("\nMemanggil metode cetakInfo di objek desktop2");
        Desktop desktop2 = new Desktop("G41D3C", "Pentium(R) Dual-Core CPU E6600");
        desktop2.setMemori(4);
        desktop2.setMerk("Simbada");
        desktop2.cetakInfo();

        System.out.println("\nMemanggil metode cetakInfo di objek laptop1");
        Laptop laptop1 = new Laptop();
        laptop1.cetakInfo();

        System.out.println("\nMemanggil metode cetakInfo di objek laptop2");
        Laptop laptop2 = new Laptop("PICO DJV", "Intel(R) Atom(TM) CPU N280");
        laptop2.setMemori(2);
        laptop2.setMerk("Axioo");
        laptop2.cetakInfo();

    }

}