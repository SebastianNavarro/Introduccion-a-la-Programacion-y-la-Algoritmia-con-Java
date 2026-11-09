
public class Auto extends Vehiculos implements Combustion {
    public Auto(String marca, int anio) throws VehiculoAntiguoException{
        super(marca, anio);
    }

    @Override
    public void cambiarAceite() {
        System.out.println("Cambiando aceite del coche...");
    }

    @Override
    public void revisar() {
        cambiarAceite();
        presentarse();
        System.out.println("Revisando frenos...");
        for(int i = 0; i <= 3; i ++){
            System.out.println("Revisando llanta " + i+1);
        }
    }
}
