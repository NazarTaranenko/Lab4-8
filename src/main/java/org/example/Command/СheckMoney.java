package org.example.Command;


import org.example.Tariff.Paytariff;

public class СheckMoney implements  Command{
    Paytariff tar;

    public СheckMoney(Paytariff tar) {
        this.tar = tar;
    }

    @Override
    public void execute() {
        System.out.println("Кількість грошей на вашому рахунку:"+ tar.getMoney());
    }
}
