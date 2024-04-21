public class Estudiante extends Persona{


public Estudiante(String nombre, int edad, int cantidad_dedos) {
        super(nombre, edad, cantidad_dedos);
        //TODO Auto-generated constructor stub
    }


protected String carnet;
protected double beca;


public String getCarnet() {
    return carnet;
}
public void setCarnet(String carnet) {
    this.carnet = carnet;
}
public double getBeca() {
    return beca;
}
public void setBeca(double beca) {
    this.beca = beca;
}




}
