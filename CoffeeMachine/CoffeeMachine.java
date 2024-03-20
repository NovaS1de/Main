public class CoffeeMachine {
    public CoffeeMachine(int volumeOfTheMilkReservoir, int amountOfMilk, int volumeOfTheWaterReservoir, int amountOfWater, int volumeOfTheDispenser, int amountOfBeans){
        this.boiler = new Boiler();
        this.grinder = new Grinder();
        this.milkReservoir = new MilkReservoir(volumeOfTheMilkReservoir, amountOfMilk);
        this.waterReservoir = new WaterReservoir(volumeOfTheWaterReservoir, amountOfWater);
        this.coffeeDispenser = new CoffeeDispenser(volumeOfTheDispenser, amountOfBeans);
    }
    Boiler boiler;
    Grinder grinder;
    MilkReservoir milkReservoir;
    WaterReservoir waterReservoir;
    CoffeeDispenser coffeeDispenser;
    public Capuccino capuccino(){
        boiler.boil(95);
        coffeeDispenser.dropBeans(10);
        grinder.grind(3);
        waterReservoir.pourWaterInTheCup(100);
        milkReservoir.pourMilk(true, 100);
        System.out.println("Ваш капучино готов!");
        return new Capuccino();
    }
    public Americano americano(){
        boiler.boil(100);
        coffeeDispenser.dropBeans(8);
        grinder.grind(2);
        waterReservoir.pourWaterInTheCup(200);
        milkReservoir.pourMilk(false, 0);
        System.out.println("Ваш американо готов!");
        return new Americano();
    }
    public Espresso espresso(){
        boiler.boil(100);
        coffeeDispenser.dropBeans(8);
        grinder.grind(1);
        waterReservoir.pourWaterInTheCup(75);
        milkReservoir.pourMilk(false, 0);
        System.out.println("Ваш эспрессо готов!");
        return new Espresso();
    }
    public Latte latte(){
        boiler.boil(95);
        coffeeDispenser.dropBeans(9);
        grinder.grind(2);
        waterReservoir.pourWaterInTheCup(80);
        milkReservoir.pourMilk(true, 130);
        System.out.println("Ваш латте готов!");
        return new Latte();
    }
}
