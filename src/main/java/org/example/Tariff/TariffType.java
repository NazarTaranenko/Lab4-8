package org.example.Tariff;

public enum TariffType {
    BASIC(10,150),MEDIUM(150,300),PREMIUM(300,800),FAMILY(100,1000), CRAFT(0, 1000);

    private int min_price;
    private int max_price;



    TariffType(int min_price, int max_price) {
        this.min_price = min_price;
        this.max_price = max_price;

    }
}
