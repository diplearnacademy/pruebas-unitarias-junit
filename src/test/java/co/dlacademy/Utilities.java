package co.dlacademy;

public class Utilities {
    public static Cuenta[] crearCuentas(int cantidadDeCuentas) {
        Cuenta[] cuentasCreadas = new Cuenta[cantidadDeCuentas];
        Persona personaUno = new Persona("Raquel");
        for (int i = 0; i < cantidadDeCuentas; i++) {
            String numeroCuenta = "Cuenta-" + (i + 1);
            double saldoInicial = 10.0;
            cuentasCreadas[i] = new Cuenta(numeroCuenta, saldoInicial);
            personaUno.agregarCuenta(cuentasCreadas[i]);
        }
        return cuentasCreadas;
    }
}
