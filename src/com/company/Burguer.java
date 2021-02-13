package com.company;

public class Burguer {
    protected String name;
    private String meat;
    protected double price;
    protected String breadRollType;

    protected String addt1;
    protected double addt1Price;

    protected String addt2;
    protected double addt2Price;

    protected String addt3;
    protected double addt3Price;

    protected String addt4;
    protected double addt4Price;

    public Burguer(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void adicional1(String name, double price)
    {
        this.addt1 = name;
        this.addt1Price = price;
    }

    public void adicional2(String name, double price)
    {
        this.addt2 = name;
        this.addt2Price = price;
    }

    public void adicional3(String name, double price)
    {
        this.addt3 = name;
        this.addt3Price = price;
    }

    public void adicional4(String name, double price)
    {
        this.addt4 = name;
        this.addt4Price = price;
    }

    public double hamburguer()
    {
        double hamburguerPrice = this.price;
        System.out.println(this.name  + " hamburguer on a " + this.breadRollType + " roll price is " + this.price);

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

        return hamburguerPrice;

    }

}
