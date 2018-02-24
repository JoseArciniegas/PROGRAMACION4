//MAIN

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author utp
 */
public class Vehiculo1 {

    Scanner in = new Scanner(System.in);
    ArrayList list_carro = new ArrayList();

    public ArrayList llenar() {
        int tamaño = 3;
        for (int i = 0; i < tamaño; i++) {
            Datos carro = new Datos();
            System.out.println("lista" + i);
            System.out.println("Digite la matricula");
            carro.setMatricula(in.next());
            System.out.println("Digite la marca");
            carro.setMarca(in.next());
            System.out.println("Digite el numero del chasis");
            carro.setNumero_chasis(in.nextLong());
            list_carro.add(carro);

        }
        return list_carro;
    }

    public void imprimir(ArrayList auto) {
        for (int i = 0; i < auto.size(); i++) {
            System.out.println("***");
            Datos aut = (Datos) auto.get(i);
            System.out.println("La matricula es:" + aut.getMatricula());
            System.out.println("La marca es:" + aut.getMarca());
            System.out.println("El numero del chasis es:" + aut.getNumero_chasis());
        }
    }

    public static void main(String[] args) {
        Vehiculo1 veh = new Vehiculo1();
        ArrayList lista = new ArrayList();
        lista = veh.llenar();
        veh.imprimir(lista);
    }

}
