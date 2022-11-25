package org.example.Command;


import org.example.Tariff.Paytariff;

public class Set_Money implements Command{
    Paytariff tar;

    public Set_Money(Paytariff tar) {
        this.tar = tar;
    }


    @Override
    public void execute() {
        tar.set_money();
    }
}
