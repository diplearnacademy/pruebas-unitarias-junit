package co.dlacademy;

import org.junit.jupiter.api.*;

public class CarritoTest {

    private Carrito carrito;
    private Producto producto;
    private Producto producto2;



    @BeforeEach
    void incializar(){
        System.out.println("Se ejecuto el inizializar");
         carrito = new Carrito();
         producto =new Producto("pantalon", 50);
         producto2 =new Producto("Camisa", 50);
    }

    @AfterEach
    void limpiar(){
        carrito = null;
        producto= null;
        producto2=null;
        System.out.println("Se ejecuto el limpiar");
    }
    @Test
    @Order(1)
    void agregarProducto(){
        System.out.println("Test 1");

        //Act
        carrito.agregarProducto(producto);
        //Assertion
        Assertions.assertEquals(1, carrito.getProductos().size());
    }


    @Test
    @Order(2)
    void testEliminarProducto(){
        System.out.println("Test 2");

        //Act
        carrito.agregarProducto(producto);
        carrito.eliminarProducto(producto);
        //Assertion
        Assertions.assertTrue(carrito.getProductos().isEmpty());
    }

    @Test
    @Order(3)
    void calcularTotalProductos(){

        System.out.println("Test 3");
        //Act
        carrito.agregarProducto(producto);
        carrito.agregarProducto(producto2);

        double totalObtenido =carrito.calcularTotal();

        //Assertion
        Assertions.assertEquals(100, totalObtenido);
    }



}
