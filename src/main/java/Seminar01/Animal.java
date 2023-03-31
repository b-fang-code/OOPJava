package Seminar01;

//Task_1
//Опишите класс Animal. У класса Animal должны быть свойства:
//type - тип животного (String)
//name - имя животного (String)
//age - возраст животного (int)
//weight - вес животного (double)
//isFly - ответ на вопрос, умеет ли это животное летать? (boolean)
//isWalk - ответ на вопрос, умеет ли это животное ходить? (boolean)
//isSwim - ответ на вопрос, умеет ли это животное плавать? (boolean)
//У животного должны быть методы:
//display - выводит информацию о животном в формате: "Тип: <Тип животного>, Имя: <Имя животного>,
// Возраст: <Возраст животного>, Вес: <Вес животного>, Умеет летать: <Да/Нет>, Умеет ходить: <Да/Нет>,
// Умеет плавать: <Да/Нет>."
//rename(String) - принимает новое имя животного
//holiday(int) - принимает на вход число праздничных дней.Увеличивает массу животного на 0.1 за каждый праздничный день.
public class Animal {
    public String type;
    public String name;
    public Integer age;
    public Double weight;
    public Boolean isFly;
    public Boolean isWalk;
    public Boolean isSwim;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(String type, String name, Integer age, Double weight, Boolean isFly, Boolean isWalk, Boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public String display() {
        return "Animal{" +
                " Животное- " + type + '\'' +
                " Имя- " + name + '\'' +
                " Возраст- " + age +
                " Вес- " + weight +
                " Умеет летать- " + isFly +
                " Умеет ходить- " + isWalk +
                " Умеет плавать- " + isSwim +
                '}';
    }

    public void rename(String name) {
        this.name = name;
    }

    public void holiday(Integer numberHoliday) {
        this.weight = weight + numberHoliday * 0.1;
    }
}
