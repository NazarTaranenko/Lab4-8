package org.example.Command;


import org.example.Tariff.Tariff_plan;

public class SortTariff  implements Command{

    Tariff_plan plan;

    public SortTariff(Tariff_plan plan) {
        this.plan = plan;
    }

    @Override
    public void execute() {
        plan.SortTariff();
    }
}
