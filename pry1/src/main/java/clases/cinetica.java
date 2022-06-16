
package clases;

public class cinetica extends Superclase{

    public cinetica(double m, double c, double v) {
        super(m, c, v);
    }

    public cinetica() {
    }
    
    public void energiacinetica(){
        double c = ((getM()*Math.pow(getV(),2)))/2;
        setC(c);
    }
}
