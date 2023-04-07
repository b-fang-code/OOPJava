package Seminar04_2;

public class Main {
    public static void main(String[] args) {
        Numeric<Integer> ob = new Numeric<>(5);
        System.out.println("Обратная величина ob: "+ ob.getNum());
        System.out.println("Дробная часть ob: "+ ob.getNum2());

        Numeric<Double> ob2 = new Numeric<>(5.6);
        System.out.println("Обратная величина ob: "+ ob2.getNum());
        System.out.println("Дробная часть ob: "+ ob2.getNum2());
    }
}
