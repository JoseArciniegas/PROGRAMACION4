/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo1;

/**
 *
 * @author utp
 */
public class Datos {

    private String matricula;
    private String marca;
    private long numero_chasis;
    
    public Datos(){
        
    }

    public Datos(String matricula, String marca, long numero_chasis) {
        this.matricula = matricula;
        this.marca = marca;
        this.numero_chasis = numero_chasis;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public long getNumero_chasis() {
        return numero_chasis;
    }

    public void setNumero_chasis(long numero_chasis) {
        this.numero_chasis = numero_chasis;
    }

    @Override
    public String toString() {
        return "Datos{" + "matricula=" + matricula + ", marca=" + marca + ", numero_chasis=" + numero_chasis + '}';
    }

}
