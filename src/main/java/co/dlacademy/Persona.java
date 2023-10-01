package co.dlacademy;
public class Persona {
    public String emoticonTriste = "😢😢😢";
    public String emoticonFeliz = "😀😀😀";
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

    public boolean validarCuentasRepetidas(Cuenta[] numerosDeCuentas, Cuenta nuevaCuenta) {
        boolean numeroDeCuentaExistente = false;
        for (Cuenta cuentaExistente : cuentas) {
            if (cuentaExistente != null && cuentaExistente.getNumeroCuenta().equals(nuevaCuenta.getNumeroCuenta())) {
                numeroDeCuentaExistente = true;
                break; // Salir del bucle si se encuentra una cuenta con el mismo número
            }
        }
        return numeroDeCuentaExistente;
    }

    public void agregarCuenta(Cuenta cuenta) {
        if (!(this.contadorCuentasAgregadas < Persona.MAX_CUENTAS)) {
            System.out.println(emoticonTriste + " Has superado el limite de cuentas " + Persona.MAX_CUENTAS + emoticonTriste);
        } else if (validarCuentasRepetidas(cuentas, cuenta)) {
            System.out.println(emoticonTriste + " La cuenta que quieres agregar ya existe " + emoticonTriste);
        } else {
            this.cuentas[this.contadorCuentasAgregadas++] = cuenta;
            System.out.println(emoticonFeliz + "Se agregó la cuenta con exito " + cuenta + " " + emoticonFeliz);
        }
    }

    public void eliminarCuenta(Cuenta cuenta) {
        for (int i = 0; i < this.contadorCuentasAgregadas; i++) {
            if (cuentas[i].equals(cuenta)) {
                // Desplazar las cuentas restantes hacia la izquierda
                for (int j = i; j < this.contadorCuentasAgregadas - 1; j++) {
                    cuentas[j] = cuentas[j + 1];
                }
                cuentas[this.contadorCuentasAgregadas - 1] = null;
                this.contadorCuentasAgregadas--;
                System.out.println(emoticonFeliz + " La cuenta ha sido eliminada correctamente. " + emoticonFeliz);
                return;
            }
        }
        System.out.println(emoticonTriste + " La cuenta no se encontró en el banco. " + emoticonTriste);
    }


    public void mostrarCuentas() {
        // System.out.println("Id persona: " + this.IdPersona);
        System.out.println("Información de la persona con ID #: " + IdPersona);
        System.out.println("nombre: " + nombre);
        for (int i = 0; i < this.contadorCuentasAgregadas; i++) {
            int item = i + 1;
            System.out.println("--- cuenta # " + item + " -> " + this.cuentas[i]);
        }
    }
}
