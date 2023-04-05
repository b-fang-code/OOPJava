package Seminar03_7;
import java.util.function.UnaryOperator;
public class Main {
    public static void main(String[] args) {
    UnaryOperator<Integer> unaryOperator = (x) -> (x*x);
        System.out.println(unaryOperator.apply(3));
    }
}
