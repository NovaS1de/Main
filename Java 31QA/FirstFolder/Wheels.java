package FirstFolder;

public class Wheels {

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    Tyres tyres;
    int innerRadius, outerRadius, width;

    public void setInnerRadius(int innerRadius) {
        this.innerRadius = innerRadius;
    }

    public void setOuterRadius(int outerRadius) {
        this.outerRadius = outerRadius;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void scr(){

        if (tyres.getDensity()>=1 && tyres.getDensity()<=10){

            System.out.println("wzhhh!");

        } else if (tyres.getDensity()>10 && tyres.getDensity()<=20) {

            System.out.println("wzhoooh!");

        }else {

            System.out.println("yuppieee!");

        }

    }

}
