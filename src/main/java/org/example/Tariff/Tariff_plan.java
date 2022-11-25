package org.example.Tariff;





import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Tariff_plan {

    private ArrayList<Tariff> Plan = new ArrayList<Tariff>();

Scanner scanner= new Scanner(System.in);
    private void FormPlan() {
        Plan.add(new Tariff("Простий", 120, "300", "8", TariffType.BASIC));
        Plan.add(new Tariff("Шкільний", 100, "100", "7", TariffType.BASIC));
        Plan.add(new Tariff("Smart", 150, "500", "20", TariffType.MEDIUM));
        Plan.add(new Tariff("Простий+ ", 140, "300", "12", TariffType.BASIC));
        Plan.add(new Tariff(" Smart+", 250, "500", "45", TariffType.MEDIUM));
        Plan.add(new Tariff("Бізнес", 300, "Безліміт", "30", TariffType.MEDIUM));
        Plan.add(new Tariff("Преміум+", 500, "Безліміт", "Безліміт", TariffType.PREMIUM));
        Plan.add(new Tariff("Преміум", 350, "800", "Безліміт", TariffType.PREMIUM));
        Plan.add(new Family_tariff("Родинний простий", 120, "300", "8", TariffType.FAMILY, 3));
        Plan.add(new Family_tariff("Родинний розширний", 150, "500", "20", TariffType.FAMILY, 5));
        Plan.add(new Family_tariff("Родинний преміум", 200, "Безлім", "80", TariffType.FAMILY, 5));

    }

    public Tariff_plan() {
        this.FormPlan();
    }


    public void printTariff(TariffType type) {
    int ind =0;
        for (Tariff i : Plan) {
            if (i.tariffType == type) {
                ind++;
                System.out.println(ind +". "+ i);
            }

        }
    }


    public void printAllTariff() {
        int ind =0;
        for (Tariff i : Plan) {
                ind++;
                System.out.println(ind +". "+ i);
        }
    }
    public void SortTariff() {
        Plan.sort(  new ValueComparator());
        int ind =0;
        for (Tariff i : Plan) {
            ind++;
            System.out.println(ind +". "+ i);
        }
    }
    public TariffType choose_type_tariff(){
        TariffType type= TariffType.BASIC;
        System.out.println("Виберіть тип тарифного плану:\n 1.Базовий: \n 2.Середній \n 3.Преміальний\n 4.Cімейний\n 5.Крафтовий ");
        int in1= scanner.nextInt();
        switch (in1) {
            case 1-> type= TariffType.BASIC;
            case 2-> type= TariffType.MEDIUM;
            case 3-> type= TariffType.PREMIUM;
            case 4-> type= TariffType.FAMILY;
            default -> System.out.println("Некоректне введене значення(Обрано базовий клас)");
        }
        return type;
    }

    public Tariff choose_tariff(){

        Tariff tariff1= Plan.get(0);
        TariffType type=  this.choose_type_tariff();
        printTariff(type);
        System.out.print("Виберіть тариф:");
        int tar= scanner.nextInt();
        switch (tar){
            case 1-> tariff1 =Plan.get(0);
            case 2-> tariff1 =Plan.get(1);
            case 3-> tariff1 =Plan.get(2);
            case 4-> tariff1 =Plan.get(3);
            case 5-> tariff1 =Plan.get(4);
            case 6-> tariff1 =Plan.get(5);
            case 7-> tariff1 =Plan.get(6);
            case 8-> tariff1 =Plan.get(7);
            case 9-> tariff1 =Plan.get(8);
            case 10-> tariff1 =Plan.get(9);
            case 11-> tariff1 =Plan.get(10);
            case 12-> tariff1 =Plan.get(11);
            default -> {System.out.print("Тариф відсутній,спробуйте ввести ще раз"); this.choose_tariff();}
        }
        return tariff1;
    }

    public void find_tarriff(){

        Tariff tariff1= Plan.get(0);
        String time,inter;

        System.out.println("Виберіть параметри тарифу:");
        System.out.println("Введіть кількість хвилин:");
        time=scanner.nextLine();
        System.out.println("Виберіть кількість інтернету:");
        inter=scanner.nextLine();
        for(Tariff i:new Tariff_plan().Plan){
            if(i.getNetwork().equals(inter)& i.getMinuteOnOtherNetworks().equals(time)) {
                System.out.println(i);
            }
        }

    }

    public  void deleteTariff(){
        printAllTariff();
        System.out.println("Виберіть який тариф ви хочете видалити:");
        int i= scanner.nextInt();
        Plan.remove(i-1);
        System.out.println("Тариф успішно видалено");
    }

    public  void addTariff(String nam1, double price1,String minut1, String internet1)
    {

            System.out.println("Тариф успішно добавлено");
            Plan.add(new Tariff(nam1,price1,minut1,internet1, TariffType.CRAFT));

    }

    public ArrayList<Tariff> getPlan() {
        return Plan;
    }

    public void setPlan(ArrayList<Tariff> plan) {
        Plan = plan;
    }
}

class  ValueComparator implements Comparator<Tariff> {

    @Override
    public int compare(Tariff tar1,  Tariff tar2 ){
        if(tar1.getPrice()==tar2.getPrice()) {
            return 0;
        } else if (tar1.getPrice()<tar2.getPrice()) {
            return -1;
        }
        else {
            return 1;
        }
        }

    }




