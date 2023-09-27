package co.dlacademy;

public class Cuenta {

    private String numeroCuenta;

    public Cuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
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
}
