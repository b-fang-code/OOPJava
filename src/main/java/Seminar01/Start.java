package Seminar01;

public class Start {
    public static void main(String[] args) {

        Cat cat = new Cat("Кошка", "Матильда", 4, 3.0, false, true,
                true);
        cat.say();
        Cat2 cat2 = new Cat2("Кошка", "Матильда", 4, 3.0, false, true,
                true);
        cat2.say();

        System.out.println(cat.display());
        cat.rename("Всё равно матильда");
        System.out.println(cat.display());
    }
}
