package co.dlacademy;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        if (Math.signum(precio) == 1)
        {
            this.precio = precio;
        }
        else
        {
            throw new IllegalArgumentException("Precios mayores a cero, hay que facturar.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
