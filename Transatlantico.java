/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepasoInterMaquinas;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Transatlantico implements InterfaceBarco {
    Scanner teclado = new Scanner(System.in);
    protected String nome,estado,lugar_atraque;
    protected int pasaxe,num_camas,id,hora_atraque;
    public void CAMBIAPASAXE(int pasaxe){
        this.pasaxe=pasaxe;
    }
    public void CAMBIACAMAS(int num_camas){
        this.num_camas=num_camas;
    }
    public boolean AFUNDIRSE(){
        boolean estado;
        if(this.estado.equalsIgnoreCase("afundido")){
            estado=true;
        }
        else{
            estado=false;
        }
        return estado;
    }
    public void ATRACAR(String porto,int hora){
        this.lugar_atraque=porto;
        this.hora_atraque=hora;
    }
    public void VER_DATOS(){
        System.out.println("Id do Transatlantico: "+this.id);
        System.out.println("Nome do Transatlantico: "+this.nome);
        System.out.println("Numero de pasaxe do Transatlantico: "+this.pasaxe);
        System.out.println("Numero de camas do Transatlantico: "+this.num_camas);
        System.out.println("Estado do Transatlantico: "+this.estado);
        if(this.lugar_atraque!=null){
            System.out.println("O lugar de atraque: "+this.lugar_atraque);
            System.out.println("A hora de atraque: "+this.hora_atraque);
        }
    }
    public void ALTA(){
        System.out.println("Introduce o Id do Transatlantico");
        this.id=teclado.nextInt();
        System.out.println("Introduce o Nome do Transatlantico");
        this.nome=teclado.next();
        System.out.println("Introduce o Numero de pasaxe do Transatlantico.");
        this.pasaxe=teclado.nextInt();
        System.out.println("Introduce o Numero de camas do Transatlantico.");
        this.num_camas=teclado.nextInt();
        System.out.println("Introduce o Estado(afundido ou non_afundido) do Transatlantico.");
        this.estado=teclado.next();
   }
}
