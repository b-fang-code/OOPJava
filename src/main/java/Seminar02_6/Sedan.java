package Seminar02_6;

public class Sedan extends Car{


    @Override
    public void brake() {

    }
}
class Main{
    public static void main(String[] args) {
        Sedan car = new Sedan();
        car.gas();
    }
}
