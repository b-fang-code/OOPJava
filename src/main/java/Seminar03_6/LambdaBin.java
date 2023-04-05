package Seminar03_6;

import java.util.function.BinaryOperator;

public class LambdaBin {
    public static void main(String[] args) {
        BinaryOperator<Integer> binary = (x, y) -> (x * y);
        System.out.println(binary.apply(10, 2));
    }
}
