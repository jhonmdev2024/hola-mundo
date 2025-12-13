import java.util.Scanner;

public class CondicionIf {
/* Dado un puntaje de 0 a 100, clasificarlo en uno de los siguientes rangos:
 - De 0 a 20 -> Muy Bajo
 - De 21 a 50 -> Bajo
 - De 51 a 80 -> Medio
 - De 81 a 100 -> Alto
 - Fuera de rango -> Puntaje invalido

Imprimir el msg: Rango: Muy Bajo | Bajo | Medio | Alto | Puntaje invalido
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String msg = "";

        // Solicitar ingresar el puntaje al usuario
        System.out.print("Por favor, ingrese el puntaje: ");
        int puntaje = scan.nextInt();

        // Evaluar el puntaje con los rangos establecidos
        if(puntaje >= 0 && puntaje <= 20){
            msg = "Muy bajo";
        }
        if(puntaje >= 21 && puntaje <= 50){
            msg = "Bajo";
        }
        if(puntaje >= 51 && puntaje <= 80){
            msg = "Medio";
        }
        if(puntaje >= 81 && puntaje <= 100){
            msg = "Alto";
        }
        if(puntaje < 0 || puntaje > 100){
            msg = "Puntaje invalido";
        }

        // Imprimir mensaje
        System.out.println("Rango: " + msg);
    }

}
