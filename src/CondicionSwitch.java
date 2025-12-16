import java.util.Scanner;

public class CondicionSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa el nombre del producto: ");
        String nombreProducto = scan.nextLine();
        System.out.print("Ingrese el stock del producto: ");
        int stockProducto = scan.nextInt();

        switch (nombreProducto.toUpperCase()) {
            case "BEBIDA":
                if(stockProducto >= 10){
                    System.out.println("Stock alto, no es necesario reponer mercaderia");
                } else if (stockProducto >= 5) {
                    System.out.println("Stock moderado, todavía no has llegado al minimo");
                } else {
                    System.out.println("Stock bajo, debe reponer mas mercaderia");
                }
                break;
            case "POSTRE":
                if(stockProducto < 3){
                    System.out.println("Stock bajo, debes reponer mas mercaderia");
                } else {
                    System.out.println("Stock alto, no es necesario reponer mercaderia");
                }
                break;
            default:
                System.out.println("El producto ingresado (" + nombreProducto + ") no esta registrado");
        }
        System.out.println("Gracias por usar nuestro sistema, vuelva pronto !!!");
    }
}
