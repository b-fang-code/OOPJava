package Seminar05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();
        ArrayList<Telephone> listTelephone = new ArrayList<>();
        shop.create(listTelephone);

        for(Telephone temp:listTelephone){
            System.out.println(temp.toString());
        }
        shop.sell(listTelephone);
        for (Telephone temp: listTelephone){
            System.out.println(temp.toString());
        }
    }
}
