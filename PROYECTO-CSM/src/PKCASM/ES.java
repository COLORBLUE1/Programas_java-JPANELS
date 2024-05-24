/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PKCASM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class ES {
    




   
public static int leaEntero(String m){
    int r=0;
     Scanner teclado = new Scanner(System.in);
     muestreMensaje(m);
     r=teclado.nextInt();
    return r;
}
public static double leaReal(String m){
    double  r=0;
     Scanner teclado = new Scanner(System.in);
     muestreMensaje(m);
     r=teclado.nextDouble();
    return r;
}
public static String leaCadena (String mensaje){
    Scanner teclado = new Scanner(System.in);
    muestreMensaje(mensaje);
    String r=teclado.nextLine();
    return r;
}
public static char leaCaracter(String mensaje){
    char r=' ';
    Scanner teclado = new Scanner(System.in);
    muestreMensaje(mensaje);
    String sr=teclado.nextLine();
    r=sr.charAt(0);
    return r;
}
//estos leen por ventana
public static String leaCadenaV (String mensaje){
    String r=JOptionPane.showInputDialog(mensaje);
    return r;
}
public static int leaEnteroV(String mensaje){
   
   
String snro="";
int nro=0;
boolean salga=false;
while(salga==false){
try{
    snro=leaCadenaV(mensaje);
 nro=Integer.parseInt(snro);
 salga=true;
}catch(Exception e){
     salga=false;
     muestreMensajeV("NO SEA ASI ERA UN NRO ENTERO");
}
}
return nro;
}
public static double  leaRealV(String mensaje){
   
String snro=leaCadenaV(mensaje);
double nro=Double.parseDouble(snro);



return nro;
}
public static char leaCaracterV (String mensaje){
    char r=' ';
    String sr=JOptionPane.showInputDialog(mensaje);
    r=sr.charAt(0);
    return r;
}
public static void muestreMensaje(String mensaje){
  System.out.println(mensaje);
}
public static void muestreMensaje(int  n){
  muestreMensaje(n+"");
}
public static void muestreMensaje(double  n){
  muestreMensaje(n+"");
}
public static void muestreMensaje(char  n){
  muestreMensaje(n+"");
}
public static void muestreMensajeV(String mensaje){
    JOptionPane.showMessageDialog(null, mensaje);
}
public static void muestreMensajeV(int n){
  muestreMensajeV(n+"");
}
public static void muestreMensajeV(double n){
  muestreMensajeV(n+"");
}
public static void muestreMensajeV(char n){
  muestreMensajeV(n+"");
}
public static  int  menu(String opciones){
 int n=0;
 String sn=javax.swing.JOptionPane.showInputDialog( opciones);
 n = Integer.parseInt(sn);  
 return n;  
}
public static String  menu(String titulo,String pregunta,String[] opciones){
  String respuesta ="";
  int n = JOptionPane.showOptionDialog(null,
    pregunta,
    titulo,
    JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null, //don't use a custom Icon
    opciones, //the titles of buttons
    opciones[0]); //default button title
     respuesta = opciones[n];
   return respuesta;
 }
public static String pregunteSiNo(String pregunta,String titulo){
String r;
int n= JOptionPane.showConfirmDialog(null,pregunta,titulo,
                  JOptionPane.YES_NO_OPTION);
if (n==JOptionPane.YES_OPTION)
  r="SI";
else
if (n==JOptionPane.NO_OPTION)
  r="NO";
   else
r="SI";
return r;  
}
  public static char pregunteSN(String pregunta,String titulo){
char r;
int n= JOptionPane.showConfirmDialog(null,pregunta,titulo,
                  JOptionPane.YES_NO_OPTION);
if (n==JOptionPane.YES_OPTION)
  r='S';
else
if (n==JOptionPane.NO_OPTION)
  r='N';
   else
r='S';
return r;  
}
public static int  menuBotones(String titulo,String pregunta,String[] opciones){
char respuesta =' ';
         int nro=opciones.length;
int n = JOptionPane.showOptionDialog(null,
pregunta,
titulo,
JOptionPane.YES_NO_OPTION,
JOptionPane.QUESTION_MESSAGE,
null, //don't use a custom Icon
opciones, //the titles of buttons
opciones[0]); //default button title
        if(n==nro-1){
           n=8;
        }
return n+1;
}
public static void mostrarFigura(String r,String titulo,String mensaje) {
      try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }  
               ImageIcon icon = new ImageIcon(r);
                JOptionPane.showMessageDialog(
                        null,
                        mensaje,
                        titulo, JOptionPane.INFORMATION_MESSAGE,
                        icon);
            }
public static void copiar(String sentrada,String ssalida){
   try{
  FileInputStream fis=new FileInputStream(sentrada);
  FileOutputStream fous=new FileOutputStream(ssalida);
  int paleer=0;
  paleer=   fis.read();
  while(paleer!=-1){
                //System.out.print((char)paleer);
                fous.write(paleer);
                paleer=fis.read();
   }
  fis.close();
  fous.close();
  }catch(IOException e){
         System.out.println("ERROR\n"+e);
  }
 
    }

    public static void mostrarMensajeV(String no_sea_asi_digite_un_numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
