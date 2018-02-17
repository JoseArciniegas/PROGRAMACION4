/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author utp
 */
public class trabajadores {

    String nombre;
    String direccion;
    String cargo;

    trabajadores() {
    }
    //Inicializar constructor

    public trabajadores(String nombre, String direccion, String cargo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cargo = cargo;
    }
    
    public double registrar_horas(int horas,double sueldo){
        return horas*sueldo;
    }
    
}
