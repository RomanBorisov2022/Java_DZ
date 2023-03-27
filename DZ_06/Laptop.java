package DZ_06;

import java.util.Objects;

public class Laptop {
    private String serialNumber;
    private int ram;
    private int hdCapacity;
    private String oSystem;
    private String color;

    public Laptop(String color, int ram, String oSystem, int hdCapacity, String serialNumber) {
        this.serialNumber = serialNumber;
        this.color = color;
        this.hdCapacity = hdCapacity;
        this.oSystem = oSystem;
        this.ram = ram;
    }

    public Laptop(String color, int ram, String oSystem, int hdCapacity) {
        this.color = color;
        this.hdCapacity = hdCapacity;
        this.oSystem = oSystem;
        this.ram = ram;
    }

    public Laptop(String color, int ram, String oSystem) {
        this.color = color;
        this.oSystem = oSystem;
        this.ram = ram;
    }

    public Laptop(String color, int ram) {
        this.color = color;
        this.ram = ram;
    }

    public Laptop(int ram) {
        this.ram = ram;
    }

    public Laptop() {}

    @Override
    public String toString() {
        return String.format("цвет:%s \t оперативная память:%d \t операционная система:%s \t емкость жд:%s \t Серийный номер:%s",
                color, ram, oSystem, hdCapacity, serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, ram);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Laptop laptop = (Laptop) obj;
        return color == laptop.color && ram == laptop.ram;
    }

    public String getColor() {
        return color;
    }

    public int getHdCapacity() {
        return hdCapacity;
    }

    public int getRam() {
        return ram;
    }

    public String getoSystem() {
        return oSystem;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHdCapacity(int hdCapacity) {
        this.hdCapacity = hdCapacity;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setoSystem(String oSystem) {
        this.oSystem = oSystem;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
