package SecondFolder;

public class SuperCube {

    public SuperCube(){
        System.out.println("БЕБЕБЕ");
    }
    public SuperCube(int chislo){
        System.out.println("Я вывожу числа, допустим: "+chislo);
    }
    public SuperCube(String stroka){
        System.out.println("Я вывожу строки, допустим: "+stroka);
    }
    public SuperCube(OurClass ourClass){
        System.out.println("Я принимаю " + "в аргументах объекты! Сейчас он выполнит метод");
        ourClass.hello();
    }
}
