package org.example.Command;


import org.example.Tariff.Tariff_plan;

public class CheckTariff implements Command{

 Tariff_plan plan;

    public CheckTariff(Tariff_plan plan) {
        this.plan = plan;
    }

    @Override
    public void execute() {
        plan.find_tarriff();
    }
}
