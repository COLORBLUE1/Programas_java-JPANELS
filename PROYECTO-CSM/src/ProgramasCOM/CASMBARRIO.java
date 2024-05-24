
package ProgramasCOM;

public class CASMBARRIO {
 public static final int MAXIMO=5000;
 private String nombre;
 private int nro;
 private int actual;
 CASMCASA[] casas;

 public CASMBARRIO(String nombre) {
        this.nombre = nombre;
        casas = new CASMCASA[MAXIMO];
        nro=0;
        actual=-1;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    @Override
    public String toString() {
     String  r=  "CASMBARRIO{" + "nombre=" + nombre + ", nro=" + nro +
                ", actual=" + actual + "}\n";
        for (int i = 0; i < nro; i++) {
            r= r+ casas[i];
        }
         return r;
    }

    public void adicionar(CASMCASA x){
        casas[nro]=x;
        actual=nro;
        nro++;
    }
 public void imprimir(){
     System.out.println(this.toString());
 }
 public void llenar(){
       int baseCarrera=80;
       int baseFoto=1;
       int baseNroCasa=10;
       String sBaseFoto="src/b/";
       double costo=0.0;
       char tipo =' ';
       for (int i = 1; i <= 600; i++) {  
           costo=(int)(  Math.random()*50000.0);
           tipo =(i%2==0)?'A':'B';
         CASMCASA a= new CASMCASA(i,"Cra80  nro 5 -"+i,costo,tipo);
         a.setUbicaFoto(sBaseFoto+i+".jpg");
          adicionar(a);
       }    
 }
 

 public void primero(){
     actual=0;
 }
 public void ultimo(){
     actual=nro-1;
 }
 public void anterior(){
     if(actual==0 || actual==-1)
        actual=-1;
     else
         actual--;
 }
 public void siguiente(){
     if(actual==nro-1)
         actual=-1;
     else
     actual++;
 }
 public CASMCASA getActualCasa(){
     return casas[actual];
 }
 public double calcValorTOt(String dir){
     double t=0.0;
     CASMCASA  x=null;
     for (int i = 0; i < nro ; i++) {
         x= casas[i];
         String d= x.getDireccion();
         if(d.indexOf(dir)>=0){
            t=t+ x.getValor();
         }
         
     }
   return t;
 }
 public CASMCASA  buscarValor(double valor){
   CASMCASA r=null;
     for (int i = 0; i < nro; i++) {
         CASMCASA m= casas[i];
         if(m.getValor()==valor) {
             r=m;
             break;
             
         }
     }

   
   return r;   
 }
 public static void main(String[] args) {
   CASMCASA a= new CASMCASA(11,"Cra80 nro 5 -27",50000.0,'A');
        CASMCASA b= new CASMCASA(12,"Cra80 nro 5 -29",51000.0,'A');
        CASMCASA c= new CASMCASA(14,"Cra80 nro 5 -31",152000.0,'B');
        CASMBARRIO ba= new CASMBARRIO("LA MERCED");
        ba.adicionar(a);
        ba.adicionar(b);
       ba.adicionar(c);
       ba.imprimir();
            
 }
}
