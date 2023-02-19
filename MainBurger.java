

package hillel;

import java.lang.String;

public class MainBurger {
    public static void main(String[] args) {
        Burger burger1 = new Burger("bun", "meat", "cheese", "salad", "mayonnaise");
        Burger burger2 = new Burger("bun", "meat", "cheese", "salad", "mayonnaise");
        Burger burger3 = new Burger("bun", "meat", "cheese", "salad", "mayonnaise");


        System.out.println(burger1.usualBurger());
        System.out.println(burger2.dietaryBurger());
        System.out.println(burger3.doubleBurger());


    }
}

class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String salad;
    private String mayonnaise;

    public Burger(String bun, String meat, String cheese, String salad, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
    }

    public String usualBurger() {

        return "Usual burger is  " + this.bun + "," + this.meat + "," + this.cheese + "," + this.salad + "," + this.mayonnaise;

    }

    public String dietaryBurger() {
        return "Dietary burger is  " + this.bun + "," + this.meat + "," + this.cheese + "," + this.salad;
    }

    public String doubleBurger() {
        this.meat = "double meat";
        return "Double meat burger is  " + this.bun + "," + this.meat + "," + this.cheese + "," + this.salad + "," + this.mayonnaise;

    }
}

