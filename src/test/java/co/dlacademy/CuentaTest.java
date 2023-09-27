package co.dlacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CuentaTest {

    @Test
    public void testCuentaOrigenDestinoDiferentes(){
        Cuenta cuentaOrigen = new Cuenta("4578963");
        Cuenta cuentaDestino = new Cuenta("9638520");
        String resultado=cuentaOrigen.validarCuentas(10000,cuentaOrigen, cuentaDestino);

        Assertions.assertEquals("Cuentas diferentes", resultado);
    }

}
