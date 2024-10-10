public class Planeta {
    // Atributos
    private String nombre;
    private int satelites;
    private double masa;
    private double volumen;
    private double diametro;
    private double distanciaSol;
    private boolean observable;

    // Constructor
    public Planeta(String nombre, int satelites, double masa, double volumen, double diametro, double distanciaSol, boolean observable) {
        establecerDatos(nombre, satelites, masa, volumen, diametro, distanciaSol, observable);
    }

    // Método para establecer los datos del planeta
    private void establecerDatos(String nombre, int satelites, double masa, double volumen, double diametro, double distanciaSol, boolean observable) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.observable = observable;
    }

    // Método para calcular la densidad
    public double obtenerDensidad() {
        if (volumen != 0) {
            return masa / volumen;
        } else {
            System.out.println("El volumen no puede ser cero.");
            return 0;
        }
    }

    // Método para mostrar la información del planeta
    public void mostrarInformacion() {
        String observacion = observable ? "Sí" : "No";
        System.out.println("Detalles del planeta:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + satelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia al Sol: " + distanciaSol + " km");
        System.out.println("¿Es observable?: " + observacion);
        System.out.printf("Densidad: %.2f kg/km³%n", obtenerDensidad());
    }

    public static void main(String[] args) {
        // Crear planeta Tierra
        Planeta tierra = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        tierra.mostrarInformacion();

        System.out.println();

        // Crear planeta Júpiter
        Planeta jupiter = new Planeta("Júpiter", 95, 1.899E27, 1.4313E15, 139820, 750000000, true);
        jupiter.mostrarInformacion();
    }
}
