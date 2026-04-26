package SistemaBancario;

public class Main {
    public static void main (String []args){
        CuentaBancaria c1 = new CuentaAhorros(1234567890, "Ana Pérez", 1200);
        CuentaBancaria c2 = new CuentaCorriente(1123456789, "Luis Gómez", 800);
        CuentaBancaria c3 = new CuentaInversion(1998877445, "María López", 7000);

        System.out.println(c1.toString());
        c1.retiro(300);
        System.out.println("Interes mensual generado: "+c1.calcularInteresMensual());

        System.out.println(c2.toString());
        c2.deposito(300);
        System.out.println("Interes mensual generado: "+c2.calcularInteresMensual());

        System.out.println(c3.toString());
        System.out.println("Interes mensual generado: "+c3.calcularInteresMensual());
    }
}
