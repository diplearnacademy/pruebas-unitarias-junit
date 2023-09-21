package co.dlacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CompraTest {

    private Carrito carrito;
    private Carrito carrito2;
    private Compra compra;
    private Producto producto;
    private Producto producto2;

    private Date myDate = new Date();
    @BeforeEach
    void incializar(){
        System.out.println("Se ejecuto el inizializar");
        carrito = new Carrito();
        compra = new Compra(carrito);
        producto =new Producto("pantalon", 50);
        producto2 =new Producto("Camisa", 50);
        carrito.agregarProducto(producto);
        carrito.agregarProducto(producto2);

    }

    @Test
    void obtenerFecha(){
        Date fechaEsperada = myDate;
        Date fechaObtenida = compra.getFecha();
        Assertions.assertEquals(new SimpleDateFormat("dd-MM-yyyy").format(fechaEsperada),new SimpleDateFormat("dd-MM-yyyy").format(fechaObtenida));
    }

    @Test
    void obtenerCarrito(){

        Assertions.assertEquals(carrito,compra.getCarrito());
    }

    @Test
    void obtenerTotal(){

        double totalObtenido = compra.getTotal();
        Assertions.assertEquals(100, totalObtenido);


    }





}
