package object;
public class Computer {
    private String cpu;
    private String model;
    private int ram; 
    private int year; 

    public Computer(){
        this.cpu = "default cpu";
        this.model = "default model";
        this.ram = 0;
        this.year = 0;
    }

    // public Computer(String cpu, String model, int ram, int year) {
    //     this.cpu = cpu;
    //     this.model = model;
    //     this.ram = ram;
    //     this.year = year;
    // }

   

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void startUp(){
        System.out.println("Start...");
    } 

    public void shutDown(){
        System.out.println("Shutdown...");
    }
    public void displaySpec(){
        System.out.println("Computer specs: ");
        System.out.println(this.cpu);
        System.out.println(this.model);
        System.out.println(this.ram);
        System.out.println(this.year);
    }
}