package Seminar02_6;

public abstract class Car {
    private String model;
    private String color;
    private int maxSpeed;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void gas() {
        System.out.println("Газуем");
    }

    public abstract void brake();
}
