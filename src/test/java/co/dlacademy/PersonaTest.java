package co.dlacademy;

import org.junit.jupiter.api.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class PersonaTest {

    HashMap<String, Double> cuentas;

    @BeforeEach
    void incializar(){
        cuentas = new  HashMap<String, Double>();
        System.out.println("Se ejecuto el inizializar");

    }

    @AfterEach
    void limpiar(){
        System.out.println("Se ejecuto el finalizar");
        cuentas = null;

    }
    @Test
     void agregarCuentaExitosa(){
        Persona persona1 = new Persona(cuentas);
        Cuenta cuenta1 = new Cuenta (500,"123456");
        Cuenta cuenta2 = new Cuenta (600,"1234567");
        Cuenta cuenta3 = new Cuenta (700,"123415678");
        persona1.agregarCuenta(cuenta1.getNumeroCuenta(),cuenta1.getFondos());
        persona1.agregarCuenta(cuenta2.getNumeroCuenta(),cuenta2.getFondos());
        persona1.agregarCuenta(cuenta3.getNumeroCuenta(),cuenta3.getFondos());

        Assertions.assertEquals(3, cuentas.size());


    }
    @Test
    void  agregarCuentaExistente(){
        Persona persona1 = new Persona(cuentas);
        Cuenta cuenta1 = new Cuenta (500,"123456");
        Cuenta cuenta2 = new Cuenta (600,"1234567");
        Cuenta cuenta3 = new Cuenta (700,"123415678");
        persona1.agregarCuenta(cuenta1.getNumeroCuenta(),cuenta1.getFondos());
        persona1.agregarCuenta(cuenta2.getNumeroCuenta(),cuenta2.getFondos());
        persona1.agregarCuenta(cuenta3.getNumeroCuenta(),cuenta3.getFondos());

        Assertions.assertThrows(IllegalArgumentException.class, ()->persona1.agregarCuenta(cuenta1.getNumeroCuenta(),cuenta1.getFondos()));
    }

    @Test
    void eliminarCuentaExitosa(){
        Persona persona1 = new Persona(cuentas);
        Cuenta cuenta1 = new Cuenta (500,"123456");
        Cuenta cuenta2 = new Cuenta (600,"1234567");
        Cuenta cuenta3 = new Cuenta (700,"123415678");
        persona1.agregarCuenta(cuenta1.getNumeroCuenta(),cuenta1.getFondos());
        persona1.agregarCuenta(cuenta2.getNumeroCuenta(),cuenta2.getFondos());
        persona1.agregarCuenta(cuenta3.getNumeroCuenta(),cuenta3.getFondos());

        persona1.eliminarCuenta(cuenta1.getNumeroCuenta());

        Assertions.assertEquals(2,cuentas.size());

    }

    @Test
    void eliminarCuentaInexistente(){

        Persona persona1 = new Persona(cuentas);
        Cuenta cuenta1 = new Cuenta (500,"123456");
        Cuenta cuenta2 = new Cuenta (600,"1234567");

        persona1.agregarCuenta(cuenta1.getNumeroCuenta(),cuenta1.getFondos());


        Assertions.assertThrows(IllegalArgumentException.class, ()->persona1.eliminarCuenta(cuenta2.getNumeroCuenta()));

    }

}
