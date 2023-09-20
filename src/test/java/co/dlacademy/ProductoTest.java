package co.dlacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductoTest {

    @Test
    void testGetNombre(){
        //Arrange
        Producto producto = new Producto("producto1", 10.0);
        String nombreEsperado = "producto1";

        //Act
        String nombreObtenido= producto.getNombre();

        //assert
        Assertions.assertEquals(nombreObtenido, nombreEsperado);
    }

    @Test
    void testGetPrecio(){
        Producto producto = new Producto("producto1", 10.0);

        double precioEsperado =10.0;

        double precioObtenido = producto.getPrecio();

        Assertions.assertEquals(precioEsperado, precioObtenido,0.01);
    }

    @Test
    void testGetNombre2(){
        //assert
       Assertions.assertThrows(IllegalArgumentException.class,() -> new Producto("",35.0));
    }


    @Test
    void precioNegativo(){
        //assert
        Assertions.assertThrows(IllegalArgumentException.class,() -> new Producto("Juan",10));
    }


}
