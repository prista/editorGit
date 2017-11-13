package patterns.abstrackFactory.builder;

public class BurgerBuilder {
    protected int size;
    protected boolean cheese;
    protected boolean pepperoni;
    protected boolean lettuce;
    protected boolean tomato;

    public BurgerBuilder(int size) {
        this.size = size;
    }

    public boolean addPepperoni() {
        this.pepperoni = true;
        return pepperoni;
    }

    public boolean addLettuce() {
        this.lettuce = true;
        return lettuce;
    }
    public boolean addCheese() {
        this.cheese = true;
        return cheese;
    }
    public boolean addTomato() {
        this.tomato = true;
        return tomato;
    }

    public Burger build() {
        return new Burger(this);
    }
}
