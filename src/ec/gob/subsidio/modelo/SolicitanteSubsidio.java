package ec.gob.subsidio.modelo;

public class SolicitanteSubsidio {
    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    public SolicitanteSubsidio(String nombreCompleto, String cedula, double ingresosMensuales, int cantidadVehiculos, boolean viveEnEcuador) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.ingresosMensuales = ingresosMensuales;
        this.cantidadVehiculos = cantidadVehiculos;
        this.viveEnEcuador = viveEnEcuador;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        if (ingresosMensuales >= 470) {
            this.ingresosMensuales = ingresosMensuales;
        } else {
            System.out.println("El ingreso mensual no puede ser menor a $470");
        }
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        if (cantidadVehiculos > 0) {
            this.cantidadVehiculos = cantidadVehiculos;
        } else {
            System.out.println("La cantidad de los vehiculos no puede ser negativa");
        }
    }

    public boolean isViveEnEcuador() {
        return viveEnEcuador;
    }

    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }

    public boolean isSubsidioAprobado() {
        return ingresosMensuales < 1200 && cantidadVehiculos == 1 && viveEnEcuador;
    }

    public void generarResultado() {
        System.out.println("\n=== RESULTADOS DE LA EVALUACION===");

        if (isSubsidioAprobado()) {
            System.out.println("Subsidio aprobado: Cumple con todos los requisitos establecidos por el Gobierno del Ecuador.");
        } else {
            System.out.println("Subsidio negado por: ");
            if (ingresosMensuales >= 1200) {
                System.out.println("Su ingreso mensual es mayor a 1200");
            }if (cantidadVehiculos > 1) {
                System.out.println("Tiene mas de un vehiculo registrado");
            }if (!viveEnEcuador) {
                System.out.println("Usted no es residente en Ecuador");
            }
        }
    }

    public String toString() {
        return "\n===== DATOS DEL SOLICITANTE =====\n" +
                "Nombre: " + nombreCompleto + "\n" +
                "Cédula: " + cedula + "\n" +
                "Ingresos mensuales: $" + ingresosMensuales + "\n" +
                "Cantidad de vehículos: " + cantidadVehiculos + "\n" +
                "Vive en Ecuador: " + (viveEnEcuador ? "Sí" : "No");
    }

    public static String mostrarReglasSubsidio() {
        return "\n=============== REGLAS PARA OBTENER SUBSIDIO ===============:\n" +
                "1. Tener ingresos mensuales menores o iguales a $1200\n" +
                "2. No poseer mas de un vehiculo registrado \n" +
                "3. Tener residencia en Ecuador\n"+
                "-----------------------------------------------------------\n";
    }

    private double distanciaRecorrida;

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public double calcularConsumoMensual() {
        double galones = this.distanciaRecorrida / 40;
        return galones;
    }
    public double calcularConsumoMensual(double kmExtra) {
        double distanciaTotal = this.distanciaRecorrida + kmExtra;
        double galones = distanciaTotal / 40;
        return galones;
    }
}