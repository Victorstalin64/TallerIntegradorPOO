package ec.gob.subsidio.modelo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(SolicitanteSubsidio.mostrarReglasSubsidio());

        System.out.print("Ingrese su nombre completo: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su cedula: ");
        String cedula = sc.nextLine();

        System.out.print("Ingrese sus ingresos mensuales: ");
        double ingresos = sc.nextDouble();

        System.out.print("Ingrese la cantidad de vehiculos registrados: ");
        int vehiculos = sc.nextInt();
        sc.nextLine();

        System.out.print("¿Vive en Ecuador? (true/false): ");
        Boolean viveEc = sc.nextBoolean();



        SolicitanteSubsidio solicitante = new SolicitanteSubsidio(nombre, cedula, ingresos, vehiculos, viveEc);
        System.out.println("\n" + solicitante.toString());
        solicitante.generarResultado();

        System.out.print("Ingrese su distancia recorrida en km: ");
        double distancia = sc.nextDouble();
        System.out.println("===== CALCULOS DE CONSUMO MENSUAL =====");
        solicitante.setDistanciaRecorrida(distancia);
        solicitante.calcularConsumoMensual();
        solicitante.calcularConsumoMensual(distancia);

    }
}