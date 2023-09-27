package co.dlacademy;

public class Cuenta {

    private String numeroCuenta;
    private double fondos;

    public Cuenta(String numeroCuenta, double fondos) {
        this.numeroCuenta = numeroCuenta;
        this.fondos = fondos;
    }

    public double getFondos() {
        return fondos;
    }

    public void setFondos(int fondos) {
        this.fondos = fondos;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = String.valueOf(numeroCuenta);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String validarCuentas(int dinero, Cuenta cuentaOrigen, Cuenta cuentaDestino){
        String cuentasMensaje;
        if(!(cuentaOrigen.getNumeroCuenta().equals(cuentaDestino.getNumeroCuenta()))){
            cuentasMensaje="Cuentas diferentes";
        }else{
            cuentasMensaje="Cuentas iguales";
        }
       return cuentasMensaje;
    }

    public boolean fondosSuficientes()
    {
        return getFondos() > 0;
    }
}
