/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import java.util.Scanner;

/**
 *
 * @author utp
 */
public class carpintero extends trabajadores {

    Scanner in = new Scanner(System.in);


    public void ingresar_datos() {
        System.out.println("Digite la hora: ");
        int hora = in.nextInt();
        System.out.println("Digite el sueldo");
        double sueldo = in.nextInt();
        this.nombre=in.next();
        System.out.println("");
    }

}
