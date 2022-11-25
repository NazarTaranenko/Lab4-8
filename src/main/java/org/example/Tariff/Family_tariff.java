package org.example.Tariff;

public class Family_tariff  extends  Tariff{

    protected  int people;
    public Family_tariff(String name, double price, String minuteOnOtherNetworks, String network, TariffType tariffType,int people) {
        super(name, price, minuteOnOtherNetworks, network, tariffType);
        this.people=people;
        this.price*=people;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Тарифний план{" +
                ", Назва='" + name + '\'' +
                ", Ціна=" + price +
                ", Хвилини на інші оператори='" + minuteOnOtherNetworks + '\'' +
                ", Інтернет='" + network + '\'' +
                ", Тип тарифу=" + tariffType +
                ",Кількість людей, приєднана до тарифу=" + people +
                '}';
    }
}
