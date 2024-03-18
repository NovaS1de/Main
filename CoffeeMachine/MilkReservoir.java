public class MilkReservoir {
    boolean milkIsNeeded;
    int amountOfMilk;
    int volumeOfTheReservoir;
    public void pourMilkIntoTheReservoir(int amountOfMilkToPourIntoTheReservoir){
        if(volumeOfTheReservoir<=this.amountOfMilk+amountOfMilkToPourIntoTheReservoir){
            System.out.println("Ты пролил "+(amountOfMilk+amountOfMilkToPourIntoTheReservoir-volumeOfTheReservoir)+" мл. молока, грёбанный психопат!!");
            amountOfMilk = volumeOfTheReservoir;
        }else {
            amountOfMilk = amountOfMilk + amountOfMilkToPourIntoTheReservoir;
        }
    }
    //наливаем молоко в стакан
    public void pourMilk(boolean milkIsNeeded, int amountOfMilkToPour){
        if(milkIsNeeded){
            System.out.println("Наливаю "+amountOfMilkToPour+" мл. молока");
            amountOfMilk = amountOfMilk - amountOfMilkToPour;
        }else {
            System.out.println("Молоко не нужно");
        }
    }
}
