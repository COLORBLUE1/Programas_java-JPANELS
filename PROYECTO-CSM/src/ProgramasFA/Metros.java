
package ProgramasFA;
import javax.swing.*;

public class Metros {
    
    private double metrosC,pulgadas,conversion;
    
    public Metros(){
        metrosC=0.0;
        pulgadas=2.54;
        conversion=0.0;
    }
    
    public void pedirDatos(){
        metrosC=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en metros para convertirlos a pulgadas"));
    }
    
    public double calcularConversion(){
        conversion=(metrosC*100)/pulgadas;
        return(conversion);
    }
    
    public void mostrarResultado(){
        JOptionPane.showMessageDialog(null,"Es igual a: "+conversion+" pulgadas.");
    }
    
}