package co.dlacademy;

import java.util.Date;

public class Compra {
    private Date fecha;
    private Carrito carrito;

    public Compra(Carrito carrito) {
        if (carrito == null ){
            throw new IllegalArgumentException("El parametro nombre no puede ser nulo o vacio");
        }else {
            this.fecha = new Date();
            this.carrito = carrito;
        }
    }

    public Date getFecha() {
        return fecha;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public double getTotal() {
        return carrito.calcularTotal();
    }


}

