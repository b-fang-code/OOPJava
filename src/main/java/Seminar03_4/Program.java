package Seminar03_4;

public class Program {
    public static void main(String[] args) {

        MyInterface<Integer> test2 = (n, m) -> (n % m == 0);
        if (test2.test(10,10));
        System.out.println("10 является делителем 10");

        MyInterface<Double> test3 = (n,m) -> (n%m ==0);
        if(test3.test(10.5, 10.5)){
            System.out.println("10.5 является делителем 10.5");
        }

        MyInterface<String> test4 = (n,m) -> (n.indexOf(m) != -1);
        String string = "Обобщенный интерфейс";
        if(test4.test(string, "Обобщенный")){
            System.out.println("Найдено");
        }
    }
}
