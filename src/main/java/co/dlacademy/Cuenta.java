package co.dlacademy;

public class Cuenta {
    private String numeroCuenta;

    public Cuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String transferir(int dinero, Cuenta cuentaOrigen, Cuenta cuentaDestino) {
        String cuentasMensaje;
        if(!cuentaOrigen.getNumeroCuenta().equals(cuentaDestino.getNumeroCuenta())){
            cuentasMensaje = "Cuentas diferentes";
        }else {
            cuentasMensaje = "Cuentas iguales";
        }
        return cuentasMensaje;
    }
}
