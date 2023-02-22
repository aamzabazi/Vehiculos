/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepasoInterMaquinas;

import java.util.*;

/**
 *
 * @author Ahmed
 */
public class main {

    public static void main(String[] args) {
        int respuesta;
        ArrayList<Transatlantico> ListaTransatl = new ArrayList();
        Transatlantico Transatlantico1;
        ArrayList<Container>ListaContainers=new ArrayList();
        Container Container1;
        ArrayList<HidroAvion>ListaHA=new ArrayList();
        HidroAvion HidroAvion1;
        do {
            respuesta = MENU();
            switch (respuesta) {
                case 1:
                    Transatlantico1 = new Transatlantico();
                    ListaTransatl.add(Transatlantico1);
                    break;
                case 2:
                    Container1= new Container();
                    ListaContainers.add(Container1);
                    break;
                case 3:
                    HidroAvion1=new HidroAvion();
                    ListaHA.add(HidroAvion1);
                    break;
                case 4:
                    
                    break;
            }
        } while (respuesta != 0);
    }

    public static int MENU() {
        Scanner teclado = new Scanner(System.in);
        int respuesta;
        System.out.println("Menu de creacion de vehiculos");
        System.out.println("Pulsa 0 : Para salir del menu");
        System.out.println("Pulsa 1 : Para dar de alta un Transatlantico.");
        System.out.println("Pulsa 2 : Para dar de alta un Container.");
        System.out.println("Pulsa 3 : Para dar de alta un HidroAvion.");
        System.out.println("Pulsa 4: Para ");
        respuesta = teclado.nextInt();
        return respuesta;
    }
}
