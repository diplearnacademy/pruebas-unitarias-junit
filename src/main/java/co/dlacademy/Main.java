package co.dlacademy;

public class Main {
    public static void main(String[] args) {
        Cuenta cuentaUno = new Cuenta("121212", 5.0);
        Cuenta cuentaDos = new Cuenta("131313", 4.0);
        Cuenta cuentaTres = new Cuenta("121218", 8.0);
        Cuenta cuentaCuatro = new Cuenta("1431212", 9.0);

        Persona personaUno = new Persona("Raquel");
        Persona personaDos = new Persona("Ramon");
        //Persona personatre = new Persona("Linda");

        personaUno.agregarCuenta(cuentaUno);
        personaUno.agregarCuenta(cuentaTres);
        personaUno.agregarCuenta(cuentaDos);
        //personaUno.agregarCuenta(cuentaCuatro);

        personaUno.mostrarCuentas();
        personaUno.eliminarCuenta(cuentaUno);
        //personaUno.eliminarCuenta(cuentaCuatro);
        personaUno.mostrarCuentas();
        /*
        personaDos.agregarCuenta(cuentaUno);
        personaDos.agregarCuenta(cuentaDos);
        personaDos.mostrarCuentas();
*/
        //System.out.println("persona 1 " + personaUno);
        //System.out.println("persona 2 " + personaDos);

    }


}
