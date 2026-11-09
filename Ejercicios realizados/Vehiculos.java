


public abstract class Vehiculos{
    protected String marca;
    protected int anio;

    public Vehiculos(String marca, int anio) throws VehiculoAntiguoException {
        if (anio < 2000) {
            throw new VehiculoAntiguoException("El vehículo es demasiado antiguo");
        }
        
        this.marca = marca;
        this.anio = anio;
    }

    public void presentarse() {
        System.out.println("Marca: " + marca + ", Año: " + anio);
    }

    public abstract void revisar();

    public int getAnio() {
        return anio;
    }
}