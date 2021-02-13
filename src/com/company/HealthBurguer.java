package com.company;

public class HealthBurguer extends Burguer{

    private String addt5;
    private double addt5Price;

    private String addt6;
    private double addt6Price;

    public HealthBurguer(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }


    //============================= ADICIONAIS EXTRAS =============================
    public void adicional5(String name, double price)
    {
        this.addt5 = name;
        this.addt5Price = price;
    }

    public void adicional6(String name, double price)
    {
        this.addt6 = name;
        this.addt6Price = price;
    }
    //============================= FIM ADICIONAIS EXTRAS =============================

    public void healthBuguerFinalPrice()
    {
        double hamburguerPrice = this.price;
        System.out.println(this.name  + " hamburguer on a " + super.breadRollType + " roll price is " + this.price);
        if(this.addt1 != null) {
            hamburguerPrice += this.addt1Price;
            System.out.println("added " + this.addt1 + " to the burguer for an extra " + this.addt1Price);
        }
        if(this.addt2 != null)
        {
            hamburguerPrice += this.addt2Price;
            System.out.println("added " + this.addt2 + " to the burguer for an extra " + this.addt2Price);
        }
        if(this.addt3 != null) {
            hamburguerPrice += this.addt1Price;
            System.out.println("added " + this.addt3 + " to the burguer for an extra " + this.addt3Price);
        }
        if(this.addt2 != null)
        {
            hamburguerPrice += this.addt2Price;
            System.out.println("added " + this.addt4 + " to the burguer for an extra " + this.addt4Price);
        }
        if(this.addt5 != null)
        {
            hamburguerPrice += this.addt5Price;
            System.out.println("added " + this.addt5 + " to the burguer for an extra " + this.addt5Price);
        }
        if(this.addt6 != null)
        {
            hamburguerPrice += this.addt6Price;
            System.out.println("added " + this.addt6 + " to the burguer for an extra " + this.addt6Price);
        }
    }

}
