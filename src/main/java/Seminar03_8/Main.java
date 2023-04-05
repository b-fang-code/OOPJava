package Seminar03_8;
import java.util.function.Function;
public class Main {
    public static void main(String[] args) {
        Function<Integer, String> func = (x) -> (String.valueOf(x) + " Долларов");
        System.out.println(func.apply(10));
    }
}
