package Seminar01;

public class Cat2 extends Cat{
    public Cat2(String type, String name, Integer age, Double weight, Boolean isFly, Boolean isWalk, Boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
    }
    @Override
    public void say(){
        System.out.println("Мяуш!, Миуш!");
    }
}
