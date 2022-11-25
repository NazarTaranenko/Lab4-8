package org.example.Command;


import org.example.Tariff.Tariff_plan;

import java.util.Scanner;

public class AddTariff implements Command{
    Tariff_plan plan1;

    public AddTariff(Tariff_plan plan1) {
        this.plan1 = plan1;
    }

    @Override
    public void execute() {
        Scanner scanner= new Scanner(System.in);
        Scanner scanner2 =new Scanner(System.in);
        Scanner scanner3=new Scanner(System.in);
        System.out.println("Виберіть назву тарифу:");
        String nam1 = scanner.nextLine() ;
        System.out.println("Виберіть  ціну тарифу:");
        Double price1 = scanner.nextDouble() ;
        System.out.println("Виберіть кількість інтернету:");
        String internet1 = scanner2.nextLine() ;
        System.out.println("Виберіть кількість хвилин:");
        String minut1 = scanner3.nextLine() ;
        plan1.addTariff(nam1,price1,minut1,internet1);
    }
}
