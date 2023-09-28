package co.dlacademy;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> cuentas = new HashMap <String, Double> ();
        Persona persona1 = new Persona(cuentas);
        Cuenta cuenta1 = new Cuenta (500,"123456");
        Cuenta cuenta2 = new Cuenta (600,"1234567");
        Cuenta cuenta3 = new Cuenta (700,"123415678");
        Cuenta cuenta4 = new Cuenta (800,"123415678");

        persona1.agregarCuenta(cuenta1.getNumeroCuenta(),cuenta1.getFondos());
        persona1.agregarCuenta(cuenta2.getNumeroCuenta(),cuenta2.getFondos());
        persona1.agregarCuenta(cuenta3.getNumeroCuenta(),cuenta3.getFondos());
        persona1.agregarCuenta(cuenta3.getNumeroCuenta(),cuenta3.getFondos());

        System.out.println("hola");



    }
}
