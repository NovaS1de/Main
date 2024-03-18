public class MilkReservoir {
    boolean milkIsNeeded;
    int amountOfMilk;
    public void pourMilk(boolean milkIsNeeded, int amountOfMilk){
        if(milkIsNeeded){
            System.out.println("Наливаю "+amountOfMilk+" мл. молока");
        }else {
            System.out.println("Молоко не нужно");
        }
    }
}
