public class BicicletaElectrica extends Vehiculos implements Electrico {
    public BicicletaElectrica(String modelo, int anio) throws VehiculoAntiguoException{
        super(modelo, anio);
    }

    @Override
    public void recargarBateria() {
        System.out.println("Recargando bateria");
    }

    @Override
    public void revisar() {
        recargarBateria();
        presentarse();
        System.out.println("Revisando frenos...");
        for(int i = 0; i < 2; i ++){
            System.out.println("Revisando llanta " + i+1);
        }
    }
    
}
