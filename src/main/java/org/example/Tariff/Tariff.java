package org.example.Tariff;




public    class Tariff {

    protected String name;
    protected double price;
    protected String minuteOnOtherNetworks;
    protected String network;
    protected TariffType tariffType;

    public Tariff(String name, double price, String minuteOnOtherNetworks, String network, TariffType tariffType) {
        this.name = name;
        this.price = price;
        this.minuteOnOtherNetworks = minuteOnOtherNetworks;
        this.network = network;
        this.tariffType=tariffType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMinuteOnOtherNetworks() {
        return minuteOnOtherNetworks;
    }

    public void setMinuteOnOtherNetworks(String minuteOnOtherNetworks) {
        this.minuteOnOtherNetworks = minuteOnOtherNetworks;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return "Тариф{" +
                "Назва='" + name + '\'' +
                ", Ціна=" + price +
                ", Хвилини на інші оператори=" + minuteOnOtherNetworks +
                ", Інтернет=" + network + "gb"+
                '}';
    }
}
