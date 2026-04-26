package SistemaBancario;

public class Main {
    public static void main (String []args){
        CuentaBancaria c1 = new CuentaAhorros(1234567890, "Ana Pérez", 1200);
        CuentaBancaria c2 = new CuentaCorriente(1123456789, "Luis Gómez", 800);
        CuentaBancaria c3 = new CuentaInversion(1998877445, "María López", 7000);

        System.out.println(c1);
        c1.retirar(200);
        c1.calcularInteresMensual();

        System.out.println("\n" + c2);
        c2.retirar(1000);

        System.out.println("\n" + c3);
        System.out.println("Interés mensual: $" + c3.calcularInteresMensual());
    }
}
