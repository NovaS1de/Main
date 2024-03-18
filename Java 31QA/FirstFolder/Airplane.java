package FirstFolder;

public class Airplane {
    int weight, height;
    Engine engine;
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void zoomZoom(){

        if (engine.getPower()>=1 && engine.getPower()<=1000){

            System.out.println("Я супер быстрый!");

        } else if (engine.getPower()>1000) {

            System.out.println("Я мега быстрый!");

        }else {

            System.out.println("Я не запустился((");

        }

    }


}
