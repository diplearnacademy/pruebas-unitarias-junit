package co.dlacademy;

import java.util.ArrayList;
import java.util.HashMap;

public class Persona {

    private Cuenta cuenta;

    private HashMap <String, Double> cuentas = new HashMap <String, Double> ();

    public Persona(HashMap <String, Double> cuentas) {
        this.cuentas = cuentas;
    }

    public void agregarCuenta(String numeroCuenta, Double fondos) {
        if(cuentas.isEmpty()){
            cuentas.put(numeroCuenta,fondos);
        }else{
            if (cuentas.containsKey(numeroCuenta)){
                throw new IllegalArgumentException();
            }else {
                cuentas.put(numeroCuenta,fondos);
            }
        }

        }

    public void eliminarCuenta(String numeroCuenta){
        if(cuentas.containsKey(numeroCuenta)){
            cuentas.remove(numeroCuenta);
        }else{
            throw new IllegalArgumentException("No se encontro la cuenta a elimina");
        }



    }




}
