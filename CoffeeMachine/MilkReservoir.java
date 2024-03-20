public class MilkReservoir {
    public MilkReservoir(int volumeOfTheReservoir, int amountOfMilk){
        this.volumeOfTheReservoir = volumeOfTheReservoir;
        this.amountOfMilk = amountOfMilk;
        if(volumeOfTheReservoir<amountOfMilk){
            amountOfMilk = volumeOfTheReservoir;
            System.out.println("Вы перелили молоко. Теперь количество молока = "+volumeOfTheReservoir);
        }
    }
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
        if(milkIsNeeded && amountOfMilkToPour>amountOfMilk){
            System.out.println("Не хватает молока, добавьте "+amountOfMilk+" мл. молока");
            amountOfMilk = 0;
        } else if(milkIsNeeded){
            System.out.println("Наливаю "+amountOfMilkToPour+" мл. молока");
            amountOfMilk = amountOfMilk - amountOfMilkToPour;
        }else {
            System.out.println("Молоко не нужно");
        }
    }
}
