
package ProgramasFA;

import java.util.Scanner;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;

public class ImprimirPares {
     
    double pares;

    /**
     *
     * @param args
     */
    public static void main (String[]args){
        ImprimirPares SA = new ImprimirPares();
        SA.Pares();
    }
    public void Pares(){
        
        Scanner Nu = new Scanner (System.in); 
          int Contador;
          
       Contador = Integer.parseInt(JOptionPane.showInputDialog("Diguite Un Numero"));
    
     for(int i=2; i <=Contador; i+=2){
        
        JOptionPane.showMessageDialog(null,"los pares son:" +i);
         
     }
    
     
    }
}


