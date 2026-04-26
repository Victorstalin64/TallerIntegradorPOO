package SistemaBancario;

public abstract class CuentaBancaria {
    private int numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(int numeroCuenta, String titular, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Depósito exitoso de: $" + cantidad);
        } else {
            System.out.println("Error: La cantidad a depositar debe ser mayor a 0");
        }
    }

    public void retiro(double cantidad) {
        if (cantidad > 0) {
            if (this.saldo >= cantidad) {
                this.saldo -= cantidad;
                System.out.println("Retiro exitoso de: $" + cantidad);
            } else {
                System.out.println("Error: Fondos insuficientes. Su saldo es de: $" + this.saldo);
            }
        } else {
            System.out.println("Error: La cantidad a retirar debe ser mayor a 0.");
        }
    }
    public abstract double calcularInteresMensual();

    @Override
    public String toString() {
        return "====== DATOS DE LA CUENTA ======\n"
                +"Titular: " + titular +"\n"
                + " | Cuenta: " + numeroCuenta +"\n"
                + " | Saldo: $" + saldo;
    }
}
