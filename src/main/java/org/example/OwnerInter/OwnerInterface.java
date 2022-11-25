package org.example.OwnerInter;


import org.example.Command.Receiver;
import org.example.Tariff.Paytariff;
import org.example.Tariff.Tariff_plan;

import java.util.Scanner;

public class OwnerInterface {

private final Tariff_plan plan = new Tariff_plan();
    private final Paytariff plan2= new Paytariff(plan);
    private final Scanner scanner = new Scanner(System.in);
    private final Receiver receiver = new Receiver(plan, plan2);


    public void menu(){
        String value;
        do{
            System.out.print("----------------------------------------------------------\n");
            Show_menu();
            value = scanner.nextLine();
            receiver.run(Integer.parseInt(value)-1);
        }while(true);
    }

    public void Show_menu(){
        System.out.println("1.Вивести список  тарифів");
        System.out.println("2.Додати тарифний план");
        System.out.println("3.Видалити тарифний план");
        System.out.println("4.Перевірити кошти на мобільному рахунку");
        System.out.println("5.Поповнити мобільний рахунок");
        System.out.println("6.Замовити тариф");
        System.out.println("7.Знайти тариф за параметрами");
        System.out.println("8.Вивести відсортований список тарифів ");
        System.out.println("9.Підрахувати загальну численість клієнтів");
        System.out.println("Поле вводу:");
    }
}


