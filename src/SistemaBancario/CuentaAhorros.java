package SistemaBancario;

public class CuentaAhorros extends CuentaBancaria {
    public CuentaAhorros(int numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public void retirar(double monto) {

    }


    @Override
    public double calcularInteresMensual() {
        double interes = (getSaldo() * 0.03) / 12;
        deposito(interes);
        return interes;
    }
}