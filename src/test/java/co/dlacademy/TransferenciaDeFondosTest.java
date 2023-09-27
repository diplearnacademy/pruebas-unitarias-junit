package co.dlacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransferenciaDeFondosTest {



     @Test
    void testTransferenciaDeFondosCuentasIguales(){
         Cuenta cuentaOrigen = new Cuenta (500,"123456");
         Cuenta cuentaDestino = new Cuenta (500,"123456");
         String mensaje = cuentaOrigen.verificarCuentas(cuentaOrigen.getNumeroCuenta(),cuentaDestino.getNumeroCuenta());
         Assertions.assertEquals("Las cuentas no pueden ser iguales",mensaje );

     }

     @Test
    void testConsultaDeFondos(){
         Cuenta cuentaOrigen = new Cuenta (0,"123456");

         Assertions.assertThrows(IllegalArgumentException.class ,()->cuentaOrigen.verificarSaldo(cuentaOrigen));

     }

     @Test
    void testTranferenciaDeFondosMenoresaCero(){

         Cuenta cuentaOrigen = new Cuenta (500,"123456");

         Assertions.assertThrows(IllegalArgumentException.class ,()-> cuentaOrigen.tranferirDinero(cuentaOrigen,-100));



     }

}
