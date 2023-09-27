package co.dlacademy;

import java.sql.SQLOutput;

public class Cuenta {

  private double fondos;
  private String numeroCuenta;

  public Cuenta(double fondos, String numeroCuenta) {
    this.fondos = fondos;
    this.numeroCuenta = numeroCuenta;
  }

  public double getFondos() {
    return fondos;
  }

  public void setFondos(double fondos) {
    this.fondos = fondos;
  }

  public String getNumeroCuenta() {
    return numeroCuenta;
  }

  public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  public String verificarCuentas ( String numeroCuentaOrigen, String numeroCuentaDestino)  {
      String mensaje;
       if (numeroCuentaOrigen.equals(numeroCuentaDestino)){
              mensaje = "Las cuentas no pueden ser iguales";
       }else{
              mensaje = "Transaccion exitosa";
       }
      return mensaje;
  }

 public void verificarSaldo (Cuenta cuenta){
    if(cuenta.getFondos()<=0){
      throw new IllegalArgumentException("Su saldo debe ser mayor  a 0");
    }else {
      System.out.println("Su saldo es" + cuenta.getFondos());
    }
 }

public void tranferirDinero (Cuenta cuenta, double valorTranferencia){

      if ((valorTranferencia > 0) ){
          System.out.println("Dinero disponible");
      }else {
           throw new IllegalArgumentException("Su saldo debe ser mayor  a 0");
      }
}



}
