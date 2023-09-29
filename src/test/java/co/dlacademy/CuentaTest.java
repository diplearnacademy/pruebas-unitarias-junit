package co.dlacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CuentaTest {
    @Test
    public void testTransferenciaDosCuentasExitosa() {
        Cuenta cuentaOrigen = new Cuenta("222223");
        Cuenta cuentaDestino = new Cuenta("2343455");
        String resultado = cuentaOrigen.transferir(10000, cuentaOrigen, cuentaDestino);
        Assertions.assertEquals("Cuentas diferentes", resultado);
    }

    @Test
    public void testOrigenFondosSuficientes() {
        Cuenta cuentaOrigen = new Cuenta("2323232");

    }
}
