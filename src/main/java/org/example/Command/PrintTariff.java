package org.example.Command;


import org.example.Tariff.Tariff_plan;

public class PrintTariff implements Command{
    Tariff_plan plan1;

    @Override
    public void execute() {
                plan1.printAllTariff();
    }

    public PrintTariff(Tariff_plan plan1) {
        this.plan1 = plan1;
    }
}
