package model;

public class Computer implements Comparable<Computer>{

    private String brand;
    private int ram;
    private int processors;
    private double processingSpeed;
    private char operatingSystem;

    public Computer(String brand, int ram, int processors, double processingSpeed, char operatingSystem) {
        this.brand = brand;
        this.ram = ram;
        this.processors = processors;
        this.processingSpeed = processingSpeed;
        this.operatingSystem = operatingSystem;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getProcessors() {
        return processors;
    }

    public double getProcessingSpeed() {
        return processingSpeed;
    }

    public char getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public int compareTo(Computer o) {
        if(this.getBrand().compareToIgnoreCase(o.getBrand())>0){
            return 1;
        }
        else if(this.getBrand().compareToIgnoreCase(o.getBrand())<0){
            return -1;
        }
        else{
            return 0;
        }
    }
}
