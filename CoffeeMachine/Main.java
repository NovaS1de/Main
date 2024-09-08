public class Main {
    public static void main(String[] args) {
        CoffeeMachine LAMBORGHINI2000SVJ = new CoffeeMachine(500, 200, 1500, 300, 100, 80);
        Latte chashechkaLatte = LAMBORGHINI2000SVJ.latte();
        Americano chashechkaAmericano = LAMBORGHINI2000SVJ.americano();
        Espresso chashechkaEspresso = LAMBORGHINI2000SVJ.espresso();
        Capuccino chashechkaCapuccino = LAMBORGHINI2000SVJ.capuccino();
    }
}
