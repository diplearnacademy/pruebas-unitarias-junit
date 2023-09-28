package co.dlacademy;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TransferenciaDeFondosTest {



     @Test
    void testTransferenciaDeFondosCuentasIguales(){
         Cuenta cuentaOrigen = new Cuenta (500,"123456");
         Cuenta cuentaDestino = new Cuenta (500,"123456");
         String mensaje = cuentaOrigen.verificarCuentas(cuentaOrigen.getNumeroCuenta(),cuentaDestino.getNumeroCuenta());
         Assert.assertEquals(mensaje,"Las cuentas no pueden ser iguales");

     }

     @Test
    void testConsultaDeFondos(){
         Cuenta cuentaOrigen = new Cuenta (0,"123456");

         Assert.assertThrows(IllegalArgumentException.class ,()->cuentaOrigen.verificarSaldo(cuentaOrigen));

     }

     @Test
    void testTranferenciaDeFondosMenoresaCero(){

         Cuenta cuentaOrigen = new Cuenta (500,"123456");
         Assert.assertThrows(IllegalArgumentException.class ,()-> cuentaOrigen.tranferirDinero(cuentaOrigen,-100));



     }

}
