public class CoffeeDispenser {
    int amountOfBeans;
    public void dropBeans(int amountOfBeansToDrop){
        if(amountOfBeansToDrop>amountOfBeans){
            System.exit(0);
        }else{
            System.out.println("Я высыпаю "+amountOfBeansToDrop+" гр.зёрен");
        }
    }
}
