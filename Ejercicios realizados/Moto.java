public class Moto extends Vehiculos implements Combustion {
    public Moto(String modelo, int anio) throws VehiculoAntiguoException{
        super(modelo, anio);
    }

    @Override
    public void cambiarAceite() {
        System.out.println("Cambiando aceite de la moto...");
    }

    @Override
    public void revisar() {
        cambiarAceite();
        presentarse();
        System.out.println("Revisando frenos...");
        for(int i = 0; i < 2; i ++){
            System.out.println("Revisando llanta " + i+1);
        }
    }
    
}
