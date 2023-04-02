package Seminar02_1;

public class Start {
    public static void main(String[] args) {
//        NumTest test = new NumTest();
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Следующее значение" + test.getNext());
//        }
//        System.out.println("Сброс");
//        test.reset();
//        System.out.println("Начальное значение - 100");
//        test.setStart(100);
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Следующее значение" + test.getNext());
//        }
        NumTest test = new NumTest();
        NumTest2 test2 = new NumTest2();
        Test ob;
        for (int i = 0; i < 5; i++) {
            ob = test2;
            System.out.println("Следующее значение" + ob.getNext());
            ob = test;
            System.out.println("Следующее значение" + ob.getNext());
        }
    }
}
