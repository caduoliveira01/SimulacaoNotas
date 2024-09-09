package entities;

public class Notas {
    public double n1,n2,n3;

    public double Media(){
        return (n1+n2+n3);
    }

    public String toString(){
        System.out.println("Final grade:"+Media());
        if (Media()>=60) {
            return "Pass!";
        }
        else{
            return "Failed! "+
            "Missing "+(60-Media())+" point";
        }
    }
}
