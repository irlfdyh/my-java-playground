package com.plygrnd.java.college.tasks.task20220118;

class Computer {

    protected String merk;
    protected int memori;

    public void cetakInfo() {
        System.out.println("Spek Komputer Belum Diketahui");
    }

}

class DesktopComputer extends Computer {

    private final String modelDesktop;
    private final String processorDesktop;

    public DesktopComputer() {
        super.merk = "\"Belum Diketahui\"";
        this.modelDesktop = "\"Belum Diketahui\"";
        this.processorDesktop = "\"Belum Diketahui\"";
        super.memori = 0;
    }

    public DesktopComputer (String modelDesktop, String processorDesktop) {
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

class LaptopComputer extends Computer {

    private final String modelLaptop;
    private final String processorLaptop;

    public LaptopComputer() {
        super.merk = "\"Belum Diketahui\"";
        this.modelLaptop = "\"Belum Diketahui\"";
        this.processorLaptop = "\"Belum Diketahui\"";
        super.memori = 0;
    }

    public LaptopComputer(String modelLaptop, String processorLaptop) {
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

public class InheritanceTask {

    public static void main(String[] args) {

        Computer komputer = new Computer();
        System.out.println("Memanggil metode cetakInfo di objek komputer");
        komputer.cetakInfo();

        System.out.println("\nMemanggil metode cetakInfo di objek desktop1");
        DesktopComputer desktop1 = new DesktopComputer();
        desktop1.cetakInfo();

        System.out.println("\nMemanggil metode cetakInfo di objek desktop2");
        DesktopComputer desktop2 = new DesktopComputer("G41D3C", "Pentium(R) Dual-Core CPU E6600");
        desktop2.setMemori(4);
        desktop2.setMerk("Simbada");
        desktop2.cetakInfo();

        System.out.println("\nMemanggil metode cetakInfo di objek laptop1");
        LaptopComputer laptop1 = new LaptopComputer();
        laptop1.cetakInfo();

        System.out.println("\nMemanggil metode cetakInfo di objek laptop2");
        LaptopComputer laptop2 = new LaptopComputer("PICO DJV", "Intel(R) Atom(TM) CPU N280");
        laptop2.setMemori(2);
        laptop2.setMerk("Axioo");
        laptop2.cetakInfo();

    }

}

