public class CoffeeDispenser {
    public CoffeeDispenser(int volumeOfTheDispenser, int amountOfBeans){
        this.volumeOfTheDispenser = volumeOfTheDispenser;
        this.amountOfBeans = amountOfBeans;
        if (amountOfBeans>volumeOfTheDispenser){
            int c = amountOfBeans - volumeOfTheDispenser;
            amountOfBeans = volumeOfTheDispenser;
            System.out.println("Вы пересыпали "+c+" гр. зёрен кофе. Теперь количество зёрен = "+amountOfBeans+" гр.");
        }
    }
    int amountOfBeans;
    int volumeOfTheDispenser;
    public void dropBeans(int amountOfBeansToDrop){
        if(amountOfBeansToDrop>amountOfBeans){
            System.out.println("Недостаточно зёрен кофе! Нехватает "+(amountOfBeansToDrop-amountOfBeans)+" гр. кофе");
            System.exit(0);
        }else{
            System.out.println("Я высыпаю "+amountOfBeansToDrop+" гр.зёрен");
        }
    }
}
