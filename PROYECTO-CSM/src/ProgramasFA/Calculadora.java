/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramasFA;


public class Calculadora {

    
protected double a;
    protected double b;

public Calculadora(){
    a=0.0;
    b=0.0;
}

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double sumar(){
      double r=0.0;
      r=a+b;
      return r;
    }
    
    public double restar(){
      double r=0.0;
      r=a-b;
      return r;
    }
    public double multiplicar(){
      double r=0.0;
      r=a*b;
      return r;
    }
    public double dividir(){
      double r=0.0;
      if(b!=0)
      r=a/b;
      else
            System.out.println("ERROR DIVISION*0");
      return r;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double sumar(double x, double y){
        a=x;
        b=y;
        return sumar();
    }
    public static void main(String[] args) {
         Calculadora n=new Calculadora();

                double res=n.sumar();
                System.out.println("la suma de estos datos es ="+res);
                double res1=n.restar();
                System.out.println("la resta de estos datos es ="+res1);
                 double res2=n.multiplicar();
                System.out.println("la multiplicacion de estos datos es ="+res2);
                 double res3=n.dividir();
                System.out.println("la division de estos datos es ="+res3);
                 
    }

  
    
}



