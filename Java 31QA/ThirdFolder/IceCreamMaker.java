package ThirdFolder;

public class IceCreamMaker {
    public void makeIceCream(){
        System.out.println("Я работаю и делаю мороженное");
    }
    public StrawberryIceCream makeIceCream(Strawberry strawberry, Milk milk){
        return new StrawberryIceCream(strawberry, milk);
    }
    public ChocolateIceCream makeIceCream(Chocolate chocolate, Milk milk){
        return new ChocolateIceCream(chocolate, milk);
    }
    public VanillaIceCream makeIceCream(Vanilla vanilla, Milk milk){
        return new VanillaIceCream(vanilla, milk);
    }
}
