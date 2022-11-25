package org.example.Tariff;



import java.util.ArrayList;
import java.util.Scanner;

public class Paytariff {

    ArrayList<Tariff> pay_tariff =new ArrayList<Tariff>();

    private int Money=0;
    Scanner scanner=new Scanner(System.in);


    Tariff_plan plan2;

    public Paytariff(Tariff_plan plan2) {
        this.plan2 = plan2;
    }

    public void pay_the_tariff(){
        Tariff tar = plan2.choose_tariff();
        if(tar.getPrice()<Money) {
            pay_tariff.add(tar);
            Money-=tar.getPrice();
            System.out.println("Тариф успішно оплачено");
        }
        else
            System.out.println("Недостатньо коштів на вашому рахунку");
    }

    public void count_paytariff(){
        int paytar = 0;

        for(Tariff i: pay_tariff ){
            paytar++;
        }
        System.out.println("Загальна кількість клієнтів:" +paytar);

    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public void set_money(){
        System.out.println("Введіть суму, на яку ви можете поповнити рахунок:");
        this.Money+= scanner.nextInt();
    }


}
