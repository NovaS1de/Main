public class WaterReservoir {

    public WaterReservoir(int volumeOfTheReservoir, int amountOfWaterInTheReservoir){
        this.volumeOfTheReservoir = volumeOfTheReservoir;
        this.amountOfWaterInTheReservoir = amountOfWaterInTheReservoir;
        if(amountOfWaterInTheReservoir>volumeOfTheReservoir){
            amountOfWaterInTheReservoir = volumeOfTheReservoir;
            System.out.println("Вы указали неправильное количетсво воды в резервуаре, теперь количество воды в резервуаре = "+volumeOfTheReservoir);
        }
    }
    int volumeOfTheReservoir;
    int amountOfWaterInTheReservoir;
    public void pourWaterInTheCup(int amountOfWaterToPour){
        if(amountOfWaterInTheReservoir>=amountOfWaterToPour){
            System.out.println("Я наливаю "+amountOfWaterToPour+" мл. воды");
            amountOfWaterInTheReservoir = amountOfWaterInTheReservoir - amountOfWaterToPour;
        }else {
            System.out.println("Воды недостаточно, осталось лишь "+amountOfWaterInTheReservoir+" мл. воды");
            System.exit(0);
        }
    }

}
