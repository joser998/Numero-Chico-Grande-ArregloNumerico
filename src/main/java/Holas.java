import java.util.Scanner;
public class Holas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Numero menor y Numero mayor en un Arreglo numerico.\n");
        System.out.println("¿Cuantos numeros vas a guardar?");
        int cantidad=sc.nextInt();
        
        int numeros[] = new int [cantidad];
        
        System.out.println("Guardar Datos");
        for(int i=0; i<numeros.length; i++){
            System.out.print("Numero: ");
            numeros[i]=sc.nextInt();
        }
        
        //Numero Menor
        int menor=numeros[0];
        for(int i=1; i<numeros.length; i++){
            if(numeros[i] < menor){
                menor=numeros[i];
            }
        }
        System.out.println("El numero mas chico del arreglo es: "+menor);
        
        //Numero Mayor
        int mayor=numeros[0];
        for(int i=1; i<numeros.length; i++){
            if(numeros[i] > mayor){
                mayor=numeros[i];
            }
        }
        System.out.println("El numero mas grande del arreglo es:"+mayor);
        
        //Se muestran todos los numeros del Arreglo
        System.out.println("Todos los numeros del Arreglo son: ");
        for(int mostrarTodos:numeros)
            System.out.println(mostrarTodos);
        
    }
}