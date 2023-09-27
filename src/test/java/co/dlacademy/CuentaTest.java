package co.dlacademy;

import org.junit.jupiter.api.Test;

public class CuentaTest {

    @Test
    public void testTransferenciaCuentasExitosa(){
        Cuenta cuentaOrigen = new Cuenta();
        Cuenta cuentaDestino = new Cuenta();
        cuentaOrigen.transferir(10000, cuentaDestino);
    }
}
