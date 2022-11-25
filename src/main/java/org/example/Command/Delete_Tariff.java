package org.example.Command;


import org.example.Tariff.Tariff_plan;

public class Delete_Tariff implements  Command  {
    Tariff_plan plan1;

    public Delete_Tariff(Tariff_plan plan1) {
        this.plan1 = plan1;
    }

    @Override
    public void execute() {
plan1.deleteTariff();
    }
}
