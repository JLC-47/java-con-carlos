package Examenes.Examen;

import java.util.Scanner;

public class gestorPedidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de Menu a registrar");
        int npedidos = sc.nextInt();


       itemMenu[] menu = new itemMenu[npedidos];


       for (int i = 0; i < itemMenu.length; i++) {
        System.out.println("Ingrese el id del plato ");
        String id = sc.nextLine();

        System.out.println("Ingrese el nombre del plato ");
        String id = sc.nextLine();

        System.out.println("Ingrese el id de pedido ");
        String id = sc.nextLine();
       }


    }

}
