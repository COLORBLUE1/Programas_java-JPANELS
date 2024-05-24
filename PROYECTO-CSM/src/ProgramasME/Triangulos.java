package ProgramasME;

import javax.swing.JOptionPane;


public class Triangulos {
    private String TipoTriangulo;
    private double Lado1, Lado2, Lado3;
    
    public Triangulos () {
        TipoTriangulo="";
        Lado1=0.0;
        Lado2=0.0;
        Lado3=0.0;
    }
    public void PedirLadosTriangulos () {
        Lado1=Double.parseDouble(JOptionPane.showInputDialog ("Ingrese El Valor Del Primner lado"));
        Lado2=Double.parseDouble(JOptionPane.showInputDialog ("Ingrese El Valor Del Segundo lado"));
        Lado3=Double.parseDouble(JOptionPane.showInputDialog ("Ingrese El Valor Del Terser lado"));
    }
    public String DeterminarTipoTriangulo () {
        if (Lado1==Lado2 && Lado2==Lado3) {
            TipoTriangulo="Equilatero";
        }
        else if (Lado1!=Lado2 &&Lado2!=Lado3 && Lado3!=Lado1) {
        TipoTriangulo="Escaleno" ;
        
    }
        else
        {
                
        TipoTriangulo="Isóceles";
        }
        return (TipoTriangulo);
    }
    public void MostrarTipoTriangulo () {
        JOptionPane.showMessageDialog
                (null, "El Triangulo Segun Sus Lados es: "+TipoTriangulo);
    }
}
