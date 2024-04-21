public class Persona {

    // Atributos
    private String nombre;
    private int edad;
    private int cantidad_dedos;

    // Constructor
    public Persona(String nombre, int edad, int cantidad_dedos) {
        this.nombre = nombre;
        this.edad = edad;
        this.cantidad_dedos = cantidad_dedos;
    }

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public int getCantidad_dedos() {
    return cantidad_dedos;
}

public void setCantidad_dedos(int cantidad_dedos) {
    this.cantidad_dedos = cantidad_dedos;
}


}
