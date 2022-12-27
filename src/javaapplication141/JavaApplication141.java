/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication141;

import javax.swing.JOptionPane;

/**
 *
 * @author Davo
 */
public class JavaApplication141 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op1 = 0;
        int op2 = 0;
        
        String user = "david";
        int clave = 123;
        String usuariobusqueda1 = "juan";

        String contraseña = "124587";
        String email = "juan@correo.com";
        String fechaNacimiento = "2 ene 1990";
        String men = "";
        do {
            men = "";
            men += "****** Menú ******\n";
            men += "1.- Iniciar Sesion \n";
            men += "2.- Recuperar Contraseña \n";
            men += "3.- Salir \n";
            men += "Elija una opción";
            op1 = Integer.parseInt(JOptionPane.showInputDialog(men));
            switch (op1) {
                case 1:
                    String us = JOptionPane.showInputDialog("Digite su usuario: ");
                    int clav = Integer.parseInt(JOptionPane.showInputDialog("Digite su clave: "));

                    if (clav == clave) {
                        JOptionPane.showMessageDialog(null, "Usuario Inicio Sesion Correctamente - Bienvenido: " + user);

                        
                        String men2 = "";
                        do {
                            men2 = "";
                            men2 += "****** Menú ******\n";
                            men2 += "1.- Consultar Usuario 1 \n";
                            men2 += "2.- Salir \n";
                            men2 += "Elija una opción";
                            op2 = Integer.parseInt(JOptionPane.showInputDialog(men2));
                            switch (op2) {
                                case 1:
                                    String usuariobusqueda2 = JOptionPane.showInputDialog("Digite nombre de usuario");
                                    if (usuariobusqueda2.equals(usuariobusqueda1)) {
                                        JOptionPane.showMessageDialog(null, "Usuario encontrado " + usuariobusqueda1);
                                        System.out.println(usuariobusqueda1 + "\n"
                                        + contraseña + "\n"
                                        + email + "\n"
                                        +fechaNacimiento);

                                                
                                    }else{
                                        JOptionPane.showMessageDialog(null, "Usuario no Existe");
                                    }

                                    break;
                            }
                        } while (op2 != 2);

                    } else {
                        JOptionPane.showMessageDialog(null, "Datos Incorectos al Iniciar Sesion  - Quiere Recuperar la Contraseña?");
                    }

                    break;
                case 2:
                    String usu = JOptionPane.showInputDialog("Digite su usuario: ");
                    if (usu.equals(user)) {
                        JOptionPane.showMessageDialog(null, "datos validados se envia link de verificacion a email");
                        JOptionPane.showMessageDialog(null, "Actualizacion Exitosa");

                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no existe");

                    }

                    break;
            }
        } while (op1 != 3);
    }

}
