public class Funciones {

    public boolean esPrimo(int num){
        int counter = 0;
        for(int i = 1; i<=num; i++){
            if(num%i==0){
                counter++;
            }
        }
        if(counter == 2){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(){
        Funciones f1 = new Funciones();
        System.out.println(f1.esPrimo(5));
    }
}
