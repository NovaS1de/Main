package FirstFolder;

public class Crew {

    public Crew(AHuman a, AHuman b, AHuman c, AHuman d, AHuman e, AHuman f){

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;

    }
    public Crew(AHuman a, AHuman b, AHuman c, AHuman d, AHuman e){

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;

    }
    public Crew(AHuman a, AHuman b, AHuman c, AHuman d){

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

    }
    public Crew(AHuman a, AHuman b, AHuman c){

        this.a = a;
        this.b = b;
        this.c = c;
    }
    AHuman a,b,c,d,e,f;

    public int theWholeWeightOfACrew(){

        int weightOfACrew = 0;

        if(d!=null){

            weightOfACrew+=d.weight;

        }
        if(e!=null){

            weightOfACrew+=e.weight;

        }
        if(f!=null){

            weightOfACrew+=f.weight;

        }

        weightOfACrew = weightOfACrew+a.weight+ b.weight+ c.weight;

        return weightOfACrew;

    }

}
