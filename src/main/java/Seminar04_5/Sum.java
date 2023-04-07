package Seminar04_5;

public class Sum {
    int sum;

    <T extends Number> Sum(T arg) {
        this.sum = 0;
        for (int i = 0; i <= arg.intValue(); i++) {
            sum += i;
        }
    }

    int getSum() {
        return sum;
    }
}

class SumDem {
    public static void main(String[] args) {
        Sum ob = new Sum(4.0);
        System.out.println("Сумма от 0 до 4 равна " + ob.getSum());
    }
}
