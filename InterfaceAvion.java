/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepasoInterMaquinas;

/**
 *
 * @author usuario
 */
interface InterfaceAvion {
    public boolean DESPEGAR(int min_dist,int vel_vento,int poten_min,int peso);
    public boolean ATERRAR(int min_dist,int vel_vento);
    public void VER_DATOS();
    public void ALTA();
}
