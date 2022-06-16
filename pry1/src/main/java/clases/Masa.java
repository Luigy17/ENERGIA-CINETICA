/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class Masa extends Superclase{

    public Masa(double m, double c, double v) {
        super(m, c, v);
    }

    public Masa() {
    }
    
    public void calculamasa(){
        double m = (2*getC())/Math.pow(getV(),2);
        setM(m);
        
    }
    
}
