package co.dlacademy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistorialCompra {
    private List<Compra> compras;
    private Date fecha;


    public HistorialCompra() {
        compras = new ArrayList<>();
    }

    public void agregarCompra(Carrito carrito) {
        Compra compra = new Compra(carrito);
        compras.add(compra);
    }

    public List<Compra> obtenerCompras() {
        return compras;
    }
}

