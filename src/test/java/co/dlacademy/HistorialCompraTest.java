package co.dlacademy;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HistorialCompraTest {

    private HistorialCompra historialCompra;
    private Carrito carrito;
    private Compra compra;
    private Producto producto;
    private Producto producto2;

    private List<Compra> compras2= new ArrayList<>();




    @BeforeEach
    void incializar(){
        System.out.println("Se ejecuto el inizializar");
        historialCompra = new HistorialCompra();
        carrito = new Carrito();
        carrito.agregarProducto(producto);
        carrito.agregarProducto(producto2);
        compra = new Compra(carrito);
        producto =new Producto("pantalon", 50);
        producto2 =new Producto("Camisa", 50);
        carrito.agregarProducto(producto);
        carrito.agregarProducto(producto2);


    }

    @AfterEach
    void limpiar(){
        carrito = null;
        producto= null;
        producto2=null;
        compra=null;
        historialCompra=null;
        System.out.println("Se ejecuto el limpiar");
    }

    @Test
    void agregarCompra(){

        historialCompra.agregarCompra(carrito);
        Assertions.assertNotNull(historialCompra.obtenerCompras());


    }
@Test
    void obtenerCompra(){
        historialCompra.agregarCompra(carrito);
        compras2= historialCompra.obtenerCompras();
        Carrito carritoDevuelto =historialCompra.obtenerCompras().get(0).getCarrito();
        //Assertions.assertEquals(1, compras2.size());
        Assertions.assertEquals(carrito, carritoDevuelto);



    }


}
