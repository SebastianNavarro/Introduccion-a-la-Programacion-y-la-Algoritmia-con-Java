public class Ejecucion {
    public static void main(String[] args) {
        try {
            Vehiculos v1 = new Auto("Toyota", 1992);
            Vehiculos v2 = new Moto("Yamaha", 2000);
            Vehiculos v3 = new BicicletaElectrica("Xiaomi", 2018);

            v1.revisar();
            v2.revisar();
            v3.revisar();
        } catch (VehiculoAntiguoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
