package SistemaBancario;

public class CuentaInversion extends CuentaBancaria {

    public CuentaInversion(int numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public double calcularInteresMensual() {
        double tasa;

        if (getSaldo() < 1000){
            tasa =0.04;
        }else if (getSaldo()<=5000){
            tasa=0.05;
        }else {
            tasa =0.06;
        }
        return getSaldo() *(tasa /12);
    }
}
