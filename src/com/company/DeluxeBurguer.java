package com.company;

public class DeluxeBurguer extends Burguer{
    private String drink;
    private final double drinkPrice = 2.00;
    private String chips;
    private final double chipsPrice = 1.00;


    public DeluxeBurguer(String name, String meat, double price, String breadRollType, String drink, String chips) {
        super(name, meat, price, breadRollType);
        this.drink = drink;
        this.chips = chips;
    }

}
