package hillel;

public class MainBurger {
    public static void main(String[] args) {
        Burger burger1 = new Burger();
        Burger burger2 = new Burger();
        Burger burger3 = new Burger();
        burger1.usualBurger();
        burger2.dietaryBurger();
        burger3.doubleBurger();

    }
}

class Burger {
    String bun;
    String meat;
    String cheese;
    String greenery;
    String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greenery, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
    }

    public void usualBurger() {
        System.out.println("Usual burger consist of: " + this.bun + "," + this.meat + "," + this.cheese + "," + this.greenery + "," + this.mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greenery) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = "without mayonnaise";


    }

    public void dietaryBurger() {
        System.out.println("Dietary burger consist of: " + this.bun + "," + this.meat + "," + this.cheese + "," + this.greenery + "," + this.mayonnaise);
    }

    public Burger() {
        this.bun = "bun";
        this.meat = "double meat";
        this.cheese = "cheese";
        this.greenery = "greenery";
        this.mayonnaise = "mayonnaise";
    }

    public void doubleBurger() {
        System.out.println("Double meat burger consist of: " + this.bun + "," + this.meat + "," + this.cheese + "," + this.greenery + "," + this.mayonnaise);

    }
}