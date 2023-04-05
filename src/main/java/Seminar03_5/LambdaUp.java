package Seminar03_5;
import java.util.function.Predicate;
public class LambdaUp {
    public static void main(String[] args) {
        Predicate<Integer> pred = (x) -> (x>0);
        System.out.println(pred.test(5));
        System.out.println(pred.test(-7));
    }
}
