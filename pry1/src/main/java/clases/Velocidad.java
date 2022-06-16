
package clases;


public class Velocidad extends Superclase{

    public Velocidad(double m, double c, double v) {
        super(m, c, v);
    }

    public Velocidad() {
    }
    
    public void calculavelocidad(){
        double v = Math.sqrt((2*getC())/getM());
        setV(v);
    }
}
