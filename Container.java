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
public class Container implements InterfaceBarco{
    Scanner teclado=new Scanner(System.in);
    protected String nome,estado,lugar_atraque;
    protected int max_containers,num_containers,id,hora_atraque;
    public void CAMBIAMAX(int max_noctainers){
        this.max_containers=max_containers;
    }
    public void CAMBIAREAL(int num_containers){
        this.num_containers=num_containers;
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
        System.out.println("Id do Container: "+this.id);
        System.out.println("Nome do Container: "+this.nome);
        System.out.println("Estado do Container: "+this.estado);
        System.out.println("Numero maximo de containers do Container: "+this.max_containers);
        System.out.println("numero de containers do Container: "+this.num_containers);
        if(this.lugar_atraque!=null){
            System.out.println("O lugar de atraque: "+this.lugar_atraque);
            System.out.println("A hora de atraque: "+this.hora_atraque);
        }
    }
    public void ALTA(){
        System.out.println("Introduce o Id do Container");
        this.id=teclado.nextInt();
        System.out.println("Introduce o Nome do Container");
        this.nome=teclado.next();
        System.out.println("Introduce o Estado(afundido ou non_afundido) do Container.");
        this.estado=teclado.next();
        System.out.println("Introduce o numero maximo de containers do Container.");
        this.max_containers=teclado.nextInt();
        System.out.println("Introduce o numero de containers do Container.");
        this.num_containers=teclado.nextInt();
    }
}
