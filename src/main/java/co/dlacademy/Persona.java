package co.dlacademy;

public class Persona {
    private String nombre;
    private int IdPersona;
    private Cuenta cuentas[];
    private static int contadorCuentas;
    private static final int MAX_CUENTAS = 10;
    private int contadorCuentasAgregadas;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.IdPersona = ++Persona.contadorCuentas + 1000;
        this.cuentas = new Cuenta[Persona.MAX_CUENTAS];
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getIdPersona() {
        return IdPersona;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public static int getContadorCuentas() {
        return contadorCuentas;
    }

    public int getContadorCuentasAgregadas() {
        return contadorCuentasAgregadas;
    }

    public boolean validarCuentasRepetidas(Cuenta nuevaCuenta) {
        boolean numeroDeCuentaExistente = false;
        for (Cuenta cuentaExistente : cuentas) {
            if (cuentaExistente != null && cuentaExistente.getNumeroCuenta().equals(nuevaCuenta.getNumeroCuenta())) {
                numeroDeCuentaExistente = true;
                break;
            }
        }
        return numeroDeCuentaExistente;
    }

    public String agregarCuenta(Cuenta cuenta) {
        String respuesta = "";
        if (!(this.contadorCuentasAgregadas < Persona.MAX_CUENTAS)) {
            respuesta = "Has superado el limite de cuentas";
        } else if (validarCuentasRepetidas(cuenta)) {
            respuesta = "La cuenta que quieres agregar ya existe";
        } else {
            this.cuentas[this.contadorCuentasAgregadas++] = cuenta;
            respuesta = "Se agregó la cuenta con exito";
        }
        return respuesta;
    }

    public String eliminarCuenta(Cuenta cuenta) {
        String respuesta = "La cuenta no se encontró en el banco.";
        for (int i = 0; i < this.contadorCuentasAgregadas; i++) {
            if (cuentas[i].equals(cuenta)) {
                for (int j = i; j < this.contadorCuentasAgregadas - 1; j++) {
                    cuentas[j] = cuentas[j + 1];
                }
                cuentas[this.contadorCuentasAgregadas - 1] = null;
                this.contadorCuentasAgregadas--;
                respuesta = "La cuenta ha sido eliminada correctamente.";
            }
        }
        return respuesta;
    }

    public void mostrarCuentas() {
        System.out.println("Información de la persona con ID #: " + IdPersona);
        System.out.println("nombre: " + nombre);
        for (int i = 0; i < this.contadorCuentasAgregadas; i++) {
            int item = i + 1;
            System.out.println("--- cuenta # " + item + " -> " + this.cuentas[i]);
        }
    }
}
