package co.dlacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductoTest {
    @Test
    void testObtainName()
    {
        //Arranque
        Producto producto = new Producto("Bareta",50);
        String expectedResult = "Bareta";
        //Acto
        String obtainedResult = producto.getNombre();
        //Aserción
        Assertions.assertEquals(expectedResult, obtainedResult);
    }

    @Test
    void testPriceProductInNegativeValues ()
    {
        //A
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Producto("Calzon", -13));
        //A
        //A
    }

    @Test
    void testZero ()
    {
        //A
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Producto("Nada", 0));
        //A
        //A
    }
}
