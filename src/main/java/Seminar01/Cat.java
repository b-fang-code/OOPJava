package Seminar01;

public class Cat extends Animal{
    public Cat(String type, String name, Integer age, Double weight, Boolean isFly, Boolean isWalk, Boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
    }
    public void say(){
        System.out.println("Мяуш!");
    }
}
