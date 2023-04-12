package Seminar05;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements CreateTelephone, SellTelephone, AddPhone {

   private ArrayList<Telephone> listTelephon;

    @Override
    public ArrayList<Telephone> create(ArrayList<Telephone> listTelephone) {


        Telephone nokia = new Telephone("Nikia", "N95", 6.12, 3000,
                7000, "Simbian");
        Telephone samsung = new Telephone("Samsung", "C100", 13.2, 3500,
                7.110, "Android");
        Telephone apple = new Telephone("Apple", "Iphone13", 16.3, 4000,
                20000, "IOs");
        Telephone xiaomi = new Telephone("Xiaomi", "Mi 13", 11, 5000,
                12.230, "Android");

        listTelephone.add(nokia);
        listTelephone.add(samsung);
        listTelephone.add(apple);
        listTelephone.add(xiaomi);

        return listTelephone;
    }

    @Override
    public ArrayList<Telephone> sell(ArrayList<Telephone> listTelephone) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой телефон купили? ");
        String buyPhone = sc.next();
        sc.close();
        ArrayList<Telephone> tempList = new ArrayList<>();
        for(Telephone telephone:listTelephone){
            if(!buyPhone.equals(telephone.getLabel())){
                tempList.add(telephone);
            }
            else {
                System.out.println("Такого телефона нет");
                break;
            }
        }
        listTelephone.clear();
        listTelephone.addAll(tempList);
        return listTelephone;

    }

    @Override
    public ArrayList<Telephone> add(ArrayList<Telephone> listTelephone) {
        Telephone phone = new Telephone();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите название производителя: ");
        String label = sc.next();
        System.out.println("Введите модель телефона: ");
        String model = sc.next();
        System.out.println("Введите размер экрана: ");
        double displaySize =  sc.nextDouble();
        System.out.println("Введите емкость батареи: ");
        int Capacity = sc.nextInt();
        System.out.println("Введите тип операционной системы: ");
        String os = sc.next();
        System.out.println("Введите стоимость телефона: ");
        double price = sc.nextDouble();
        sc.close();
        return listTelephone;
    }
}
