package FirstFolder;

public class Automobile {

    Wheels wheels;
    Tyres tyres;
    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public void howCoolIm(){

        System.out.println("I've got "+tyres.getType()+" tyres ");

    }

}
