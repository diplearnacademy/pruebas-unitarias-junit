package co.dlacademy;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {

        if (nombre == null || nombre.isEmpty() ){
            throw new IllegalArgumentException("El parametro nombre no puede ser nulo o vacio");
        }

        if (Math.signum(precio)==1){
            this.precio = precio;
        } else if (Math.signum(precio)==0 || Math.signum(precio)==-1 ) {

            throw new IllegalArgumentException("El precio debe ser mayor que 0");

        }
        ;

        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
