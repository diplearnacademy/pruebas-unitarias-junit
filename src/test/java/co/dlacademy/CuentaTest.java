package co.dlacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CuentaTest {

    @Test
    public void testCuentaDestinoDiferente(){
        Cuenta cuentaOrigen = new Cuenta("1234");
        Cuenta cuentaDestino = new Cuenta("4321");
        String resultado = cuentaOrigen.validarCuentas(1000, cuentaOrigen, cuentaDestino);

        Assertions.assertEquals("Cuentas diferentes", resultado);
    }

    @Test
    public void testOrigenFondosSuficientes(){
        Cuenta cuentaOrigen = new Cuenta("5678");
        Assertions.assertTrue(cuentaOrigen.fondosSuficientes());
    }

}
