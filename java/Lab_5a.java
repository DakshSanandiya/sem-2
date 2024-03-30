abstract class vegetable {
    String color;
    String veginame;
    abstract public String toString();
}
class potato extends vegetable {
    potato(String c){
        super.color=c;
        super.veginame="potato";
    }
    public String toString(){
        return "color = " + super.color + "    veginame = " + super.veginame;
    }
}
class tomato extends vegetable {
    tomato(String c){
        super.color=c;
        super.veginame="tomato";
    }
    public String toString(){
        return "color = " + super.color + "      veginame = " + super.veginame;
    }
}
class brinjal extends vegetable {
    brinjal(String c){
        super.color=c;
        super.veginame="Brinjal";
    }
    public String toString(){
        return "color = " + super.color + "   veginame = " + super.veginame;
    }
}

public class Lab_5a {
    public static void main (String[] args){
        potato p = new potato("broun");
        System.out.println(p);

        tomato t = new tomato("red");
        System.out.println(t);

        brinjal b = new brinjal("purple");
        System.out.println(b);
    }
}