package Seminar03_9;
import java.util.function.Consumer;
public class Main {
    public static void main(String[] args) {
        Consumer<Integer> func = (x) -> System.out.printf(" %d $%n", x);
        func.accept(10);
    }
}
