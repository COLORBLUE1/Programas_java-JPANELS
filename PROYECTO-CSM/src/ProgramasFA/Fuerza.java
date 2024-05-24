package ProgramasFA;

public class Fuerza {

public double masa;
public double aceleracion;

  public Fuerza() {
        this.masa = 0.0;
        this.aceleracion = 0.0;
    }
    public Fuerza(double masa, double aceleracion) {
        this.masa = masa;
        this.aceleracion = aceleracion;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }
public double calcularFuerza(){
    double r=0.0;
    r=masa*aceleracion;
    return r;
}


}
