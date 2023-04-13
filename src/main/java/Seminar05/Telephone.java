package Seminar05;

import java.util.Objects;
import java.util.SplittableRandom;

public class Telephone {
    private String label;
    private  String model;
    private double displaySize;
    private int batteryCapacity;
    private double price;
    private String TypeOs;

    public String getLabel() {
        return label;
    }

    public String getModel() {
        return model;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getPrice() {
        return price;
    }

    public String getTypeOs() {
        return TypeOs;
    }

    public Telephone() {

    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTypeOs(String typeOs) {
        TypeOs = typeOs;
    }

    public Telephone(String label, String model, double displaySize, int batteryCapacity, double price, String typeOs) {
        this.label = label;
        this.model = model;
        this.displaySize = displaySize;
        this.batteryCapacity = batteryCapacity;
        this.price = price;
        TypeOs = typeOs;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "label='" + label + '\'' +
                ", model='" + model + '\'' +
                ", displaySize=" + displaySize +
                ", batteryCapacity=" + batteryCapacity +
                ", price=" + price +
                ", TypeOs='" + TypeOs + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telephone telephone = (Telephone) o;
        return Double.compare(telephone.displaySize, displaySize) == 0 && batteryCapacity == telephone.batteryCapacity && Double.compare(telephone.price, price) == 0 && Objects.equals(label, telephone.label) && Objects.equals(model, telephone.model) && Objects.equals(TypeOs, telephone.TypeOs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, model, displaySize, batteryCapacity, price, TypeOs);
    }
}
