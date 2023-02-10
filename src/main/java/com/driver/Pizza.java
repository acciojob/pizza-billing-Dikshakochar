package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;
    boolean isExtracheeseadded;
    boolean isextraToppingsadded;
    boolean isbillCreated;
    boolean isTakeaway;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
            this.price=300;
            this.toppings=70;
        }
        else{
            this.price=400;
            this.toppings=120;
        }
        this.isbillCreated=false;
       this. isExtracheeseadded=false;
        this.isextraToppingsadded=false;
       this.isbillCreated=false;
       this.bill="Base price of pizza:"+this.price;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtracheeseadded==false)
        {
            this.price+=80;
            isExtracheeseadded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isextraToppingsadded==false)
        {
            this.price+=this.toppings;
            isextraToppingsadded=true;
            return;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeaway==false)
        {
           this.price+=20;
            isTakeaway=true;
        }

    }

    public String getBill(){
        // your code goes here
        if(isbillCreated==false) {
            if (isExtracheeseadded) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (isextraToppingsadded) {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (isTakeaway) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price: " + this.price;
            isbillCreated=true;
            return this.bill;
        }
        return "";
    }
}
