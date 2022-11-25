package org.example.Command;


import org.example.Tariff.Paytariff;
import org.example.Tariff.Tariff_plan;

import java.util.ArrayList;
import java.util.List;

public class Receiver {
    private final List<Command> commandList = new ArrayList<>();
    private  final Tariff_plan plan3;
    private  final Paytariff plan2;

    public Receiver(Tariff_plan plan3, Paytariff plan2) {
        this.plan3 = plan3;
        this.plan2 = plan2;
        addCommands();
    }
    public void run(int index){
        commandList.get(index).execute();
    }
    public void addCommands() {
        commandList.add(new PrintTariff(plan3));
        commandList.add(new AddTariff(plan3));
        commandList.add(new Delete_Tariff(plan3));
        commandList.add(new СheckMoney(plan2));
        commandList.add(new Set_Money(plan2));
        commandList.add(new Pay_tariff(plan2));
        commandList.add(new CheckTariff(plan3));
        commandList.add(new SortTariff(plan3));
        commandList.add(new Caunt_abonent(plan2));
        commandList.add(new ExitCommand());
    }
}
