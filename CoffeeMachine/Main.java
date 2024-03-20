public class Main {
    public static void main(String[] args) {
        CoffeeMachine EBOSCH2000SUK = new CoffeeMachine(500, 200, 1500, 300, 100, 80);
        Latte chashechkaLatte = EBOSCH2000SUK.latte();
        Americano chashechkaAmericano = EBOSCH2000SUK.americano();
        Espresso chashechkaEspresso = EBOSCH2000SUK.espresso();
        Capuccino chashechkaCapuccino = EBOSCH2000SUK.capuccino();
    }
}
