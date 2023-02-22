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
public class HidroAvion implements InterfaceBarco,InterfaceAvion {
    Scanner teclado=new Scanner(System.in);
    protected String lugar_atraque,estado;
    protected int id,hora_atraque,potencia,dist_min_aterr,dist_min_desp,peso_max;
    public void CAMBIA_POT(int potencia){
        this.potencia=potencia;
    }
    public void CAMBIA_DIST_ATERR(int dist_min_aterr){
        this.dist_min_aterr=dist_min_aterr;
    }
    public void CAMBIA_DIST_DESP(int dist_min_desp){
        this.dist_min_desp=dist_min_desp;
    }
    public boolean DESPEGAR(int min_dist,int vel_vento,int poten_min,int peso){
        boolean despegue=false;
        if((min_dist*poten_min)-(vel_vento*peso)>=1){
            despegue=true;
        }
        return despegue;
    }
    public boolean ATERRAR(int min_dist,int vel_vento){
        boolean aterrar=false;
        if(min_dist>vel_vento){
            aterrar=true;
        }
        return aterrar;
    }
    public void VER_DATOS(){
        System.out.println("Id do Container: "+this.id);
        System.out.println("Hora de atraque: "+this.hora_atraque);
        System.out.println("Potencia: "+this.potencia);
        System.out.println("Distancia minima de aterrizaje: "+this.dist_min_aterr);
        System.out.println("Distancia minimia de despegue: "+this.dist_min_desp);
        System.out.println("Peso maximo: "+this.peso_max);
        System.out.println("Lugar de atraque: "+this.lugar_atraque);
        System.out.println("Estado: "+this.estado);
    }
    public void ALTA(){
        System.out.println("Introduce o Id do Container del HidroAvion.");
        this.id=teclado.nextInt();
        System.out.println("Introduce la Hora de atraque del HidroAvion.");
        this.hora_atraque=teclado.nextInt();
        System.out.println("Introduce la Potencia del HidroAvion.");
        this.potencia=teclado.nextInt();
        System.out.println("Introduce la Distancia minima de aterrizaje del HidroAvion.");
        this.dist_min_aterr=teclado.nextInt();
        System.out.println("Introduce la Distancia minimia de despegue del HidroAvion.");
        this.dist_min_desp=teclado.nextInt();
        System.out.println("Introduce el Peso maximo del HidroAvion.");
        this.peso_max=teclado.nextInt();
        System.out.println("Introduce el Lugar de atraque del HidroAvion.");
        this.lugar_atraque=teclado.next();
        System.out.println("Introduce o Estado(afundido ou non_afundido) do Transatlantico.");
        this.estado=teclado.next();
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

}
