package org.example.Command;


import org.example.Tariff.Paytariff;

public class Caunt_abonent implements Command {
    Paytariff plan;

    public Caunt_abonent(Paytariff plan) {
        this.plan = plan;
    }

    @Override
    public void execute() {
        plan.count_paytariff();
    }
}
