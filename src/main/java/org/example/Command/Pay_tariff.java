package org.example.Command;


import org.example.Tariff.Paytariff;

public class Pay_tariff  implements Command{

    Paytariff tar;

    public Pay_tariff(Paytariff tar) {
        this.tar = tar;
    }

    @Override
    public void execute() {
        tar.pay_the_tariff();
    }
}
