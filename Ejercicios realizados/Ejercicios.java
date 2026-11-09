
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


// Ejercicios de reservar mesas

public class Ejercicios{
    public static void ejercicioMesa(){
        int mesasDisponibles = 5;
        int numeroPersonas = 0;
        String nombre;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Escriba su nombre");
            nombre = sc.nextLine();

            System.out.println("Escriba la cantidad de personas");
            numeroPersonas = Integer.parseInt(sc.nextLine());

            if(mesasDisponibles > 0){
                mesasDisponibles =  mesasDisponibles -1;
                System.out.println("Estimado " + nombre + " se ha reservado una mesa para " + Integer.toString(numeroPersonas) + "personas");
                System.out.println("Todavía quedan " + mesasDisponibles + " mesas disponibles");
            }
            else{
                System.out.println("Lo sentimos ya no hay mesas");
                break;
            }

            
        }
    }


    public static void ejercicioNumeros() {
        int numero = 0;
        int contador = 0;
        String respuesta;
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("Escriba S/N para continuar o no");
            respuesta = sc.nextLine();

            if("S".equals(respuesta) || "s".equals(respuesta)){
                System.out.println("Ingrese un número");
                numero = Integer.parseInt(sc.nextLine());
                if(numero % 2 == 0){
                    System.out.println(numero + " es un número par");
                    contador = contador + 1;
                }
                else{
                    System.out.println(numero + " es un numero impar");
                }
            }
            else{
                System.out.println("Se han ingresado " + contador + " números pares");
                break;
            }
        }
    }


    public static void ejercicioInventario(){
        Scanner sc = new Scanner(System.in);
        String respuesta;

        Map<String, Integer> inventario = new HashMap<>();

        inventario.put("productoA", 0);
        inventario.put("productoB", 0);
        inventario.put("productoC", 0);

        while (true) {
            System.out.println("Ingresa S/N para seguir o parar");
            respuesta = sc.nextLine();

            if ("S".equalsIgnoreCase(respuesta)) {
                System.out.println("Ingresa A para agregar productos o ingresa R para retirar productos");
                respuesta = sc.nextLine();

                if ("A".equalsIgnoreCase(respuesta)) {
                    for (Map.Entry<String, Integer> in : inventario.entrySet()) {
                        System.out.println(in.getKey() + " " + in.getValue());
                    }
                    System.out.println("Escribe el producto que deseas agregar");
                    String producto = sc.nextLine();
                    System.out.println("Cuantos quieres agregar");
                    int cantidad = Integer.parseInt(sc.nextLine());

                    if (inventario.containsKey(producto)) {
                        inventario.put(producto, inventario.get(producto) + cantidad);
                        System.out.println("Se ha agregado " + cantidad + " a " + producto);
                    } else {
                        System.out.println("El producto no existe en el inventario");
                    }

                    for (Map.Entry<String, Integer> in : inventario.entrySet()) {
                        System.out.println(in.getKey() + " " + in.getValue());
                    }
                } else if ("R".equalsIgnoreCase(respuesta)) {
                    for (Map.Entry<String, Integer> in : inventario.entrySet()) {
                        System.out.println(in.getKey() + " " + in.getValue());
                    }
                    System.out.println("Escribe el producto que deseas retirar");
                    String producto = sc.nextLine();
                    System.out.println("Cuantos quieres retirar");
                    int cantidad = Integer.parseInt(sc.nextLine());

                    if (inventario.containsKey(producto)) {
                        if (inventario.get(producto) >= cantidad) {
                            inventario.put(producto, inventario.get(producto) - cantidad);
                            System.out.println("Se ha retirado " + cantidad + " de " + producto);
                        } else {
                            System.out.println("No hay suficiente stock de " + producto);
                        }
                    } else {
                        System.out.println("El producto no existe en el inventario");
                    }

                    for (Map.Entry<String, Integer> in : inventario.entrySet()) {
                        System.out.println(in.getKey() + " " + in.getValue());
                    }
                } else {
                    System.out.println("Opción no válida");
                }
            } else if ("N".equalsIgnoreCase(respuesta)) {
                System.out.println("Inventario final:");
                for (Map.Entry<String, Integer> in : inventario.entrySet()) {
                    System.out.println(in.getKey() + " " + in.getValue());
                }
                break;
            } else {
                System.out.println("Respuesta no válida");
            }
        }
    }
        
    

    public static void main(String[] args) {
        ejercicioInventario();
    }
}