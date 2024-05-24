
package ProgramasCOM;

public class CASMCASA {
 private int codigo;
 private String direccion;
 private double valor;
 private char tipo;
 private String ubicaFoto;

    public CASMCASA(int codigo, String direccion, double valor, char tipo) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.valor = valor;
        this.tipo = tipo;
        ubicaFoto = "";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getUbicaFoto() {
        return ubicaFoto;
    }

    public void setUbicaFoto(String ubicaFoto) {
        this.ubicaFoto = ubicaFoto;
    }

    @Override
    public String toString() {
        return "CASMCASA{" + "codigo=" + codigo + ", direccion="
                + direccion + ", valor=" + valor + ", tipo=" + 
                tipo + ", ubicaFoto=" + ubicaFoto + "}\n";
    }
    public String[] getCols(){
        String [] r= new String[5];
        r[0]="Codigo";
        r[1]="Direccion";
        r[2]="Valor";
        r[3]="Tipo";
        r[4]="Direccion";
        return r;
    }
     public String[] getValores(){
        String [] r= new String[5];
        r[0]=codigo+"";
        r[1]=direccion;
        r[2]=valor+"";
        r[3]=tipo+"";
        r[4]=ubicaFoto;
        return r;
    }
    public static void main(String[] args) {
        CASMCASA a= new CASMCASA(11,"Cra80 nro 5 -27",50000.0,'A');
        CASMCASA b= new CASMCASA(12,"Cra80 nro 5 -29",51000.0,'A');
        CASMCASA c= new CASMCASA(14,"Cra80 nro 5 -31",152000.0,'B');
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

