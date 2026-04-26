package SistemaBancario;
//Permite realizar sobregiros de hasta 500 USD sin generar intereses.
public class CuentaCorriente extends CuentaBancaria {
    private final double sobregiro = 500;
    public CuentaCorriente(int numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public double calcularInteresMensual() {
        return 0;
    }
}
