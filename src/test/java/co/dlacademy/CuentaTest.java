package co.dlacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CuentaTest {

    @Test
    public void testCuentaOrigenDestinoDiferentes(){
        Cuenta cuentaOrigen = new Cuenta("4578963",1.0);
        Cuenta cuentaDestino = new Cuenta("9638520",1.0);
        String resultado=cuentaOrigen.validarCuentas(10000,cuentaOrigen, cuentaDestino);

        Assertions.assertEquals("Cuentas diferentes", resultado);
    }

    @Test
    public void testOrigenFondosSuficientes()
    {
        //A
        Cuenta cuentaOrigen = new Cuenta("1234",1.0);
        //A
        //A
        Assertions.assertTrue(cuentaOrigen.fondosSuficientes());
    }

    @Test
    public void testOrigenFondosInsuficientes()
    {
        //A
        Cuenta cuentaOrigen = new Cuenta("1234",0.0);
        //A
        //A
        Assertions.assertFalse(cuentaOrigen.fondosSuficientes());
    }
}
