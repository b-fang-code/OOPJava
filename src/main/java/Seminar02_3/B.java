package Seminar02_3;

public interface B extends A{
    void meth3();
}
class MyClass implements B{

    @Override
    public void meth1() {
        System.out.println("Реализация метода 1\n");
    }

    @Override
    public void meth2() {
        System.out.println("Реализация метода 2\n");
    }

    @Override
    public void meth3() {
        System.out.println("Реализация метода 3\n");
    }
}
