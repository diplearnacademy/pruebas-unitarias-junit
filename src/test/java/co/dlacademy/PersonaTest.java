package co.dlacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonaTest {

    @Test
    void testValidarCuentasRepetidas() {
        Persona personaUno = new Persona("Raquel");
        Cuenta cuentaUno = new Cuenta("121212", 5.0);
        Cuenta cuentaDos = new Cuenta("131313", 4.0);
        personaUno.agregarCuenta(cuentaDos);
        personaUno.agregarCuenta(cuentaUno);
        boolean cuantaNoValida = personaUno.validarCuentasRepetidas(new Cuenta("121212", 2.3));
        Assertions.assertTrue(cuantaNoValida);
    }

    @Test
    void testListaCuentasMenorADies() {
        Cuenta[] CuentasCreadas = Utilities.crearCuentas(10);
        Persona personaUno = new Persona("Raquel");
        for (Cuenta cuenta : CuentasCreadas) {
            personaUno.agregarCuenta(cuenta);
        }
        Cuenta cuentaDos = new Cuenta("131313", 4.0);
        Assertions.assertEquals("Has superado el limite de cuentas", personaUno.agregarCuenta(cuentaDos));
    }

    @Test
    public void testNoCrearNumeroCuentaExistente() {
        Cuenta cuentaDos = new Cuenta("131313", 4.0);
        Persona personaUno = new Persona("Raquel");
        personaUno.agregarCuenta(cuentaDos);
        Assertions.assertEquals("La cuenta que quieres agregar ya existe", personaUno.agregarCuenta(cuentaDos));
    }

    @Test
    public void testCuentaAgragadaConExito() {
        Cuenta cuentaUno = new Cuenta("121212", 5.0);
        Persona personaUno = new Persona("Raquel");
        personaUno.agregarCuenta(cuentaUno);
        Assertions.assertEquals(1, personaUno.getContadorCuentasAgregadas());
    }

    @Test
    void testCuentaEliminadaCorrectamente() {
        Cuenta cuentaUno = new Cuenta("121212", 5.0);
        Persona personaUno = new Persona("Raquel");
        personaUno.agregarCuenta(cuentaUno);
        personaUno.eliminarCuenta(cuentaUno);
        Assertions.assertEquals(0, personaUno.getContadorCuentasAgregadas());
    }

    @Test
    void testCuentaNoEncontradaNoEliminada() {
        Cuenta cuentaUno = new Cuenta("121212", 5.0);
        Cuenta cuentaDos = new Cuenta("121212", 5.0);
        Persona personaUno = new Persona("Raquel");
        personaUno.agregarCuenta(cuentaUno);
        Assertions.assertEquals("La cuenta no se encontró en el banco.", personaUno.eliminarCuenta(cuentaDos));
    }
}