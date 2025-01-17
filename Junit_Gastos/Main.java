import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);

        //iniciamos la base de datos
        SQlite db = new SQlite();

        System.out.println("Bienvenido al Banco Satander");
        System.out.println("");

        Usuario usuario = null;
        GestionFinanzas gestiob =null;

        int op;

        do {

            System.out.println("\nQue quiere hacer hoy:");
            System.out.println("1. Agregar un nuevo usuario");
            System.out.println("2. Registrar un ingreso");
            System.out.println("3. Registrar un gasto");
            System.out.println("4. Mostrar datos del usuario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            op = l.nextInt();
            l.nextLine(); // Limpiar buffer


            switch (op) {


                case1:
                break;

                case2;
                break;

                case3;
                break;

                case4;
                break;

                case5;
                break;


            } while (op != 5);

        }


    }

}
