package patterns.abstrackFactory.builder;

public class BuilderTestDrive {
    public static void main(String[] args) {
        BurgerBuilder burgerBuilder = new BurgerBuilder(14);
        burgerBuilder.addCheese();
        burgerBuilder.addPepperoni();
        Burger burger = burgerBuilder.build();
        System.out.println(burger);
    }
}
