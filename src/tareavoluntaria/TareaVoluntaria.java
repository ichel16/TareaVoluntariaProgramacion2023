/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareavoluntaria;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class TareaVoluntaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Para introducir datos.
        int menu = 10; //Variable para el menú.
        HashSet<Cliente> listaClientes = new HashSet<>(); //Estructura de almacenamiento.

        //Creamos 4 clientes de prueba
        Cliente c1 = new Cliente("00000000T", true, "Me llamo Ralph");
        Cliente c2 = new Cliente("R11111111", false, "Empresa de las falsas");
        Cliente c3 = new Cliente("22222222Z", true, "Juanito");
        Cliente c4 = new Cliente("1q", true, "Cliente de prueba.");
        
        //Añadimos los clientes a la estructura de almacenamiento.
        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);
        listaClientes.add(c4);

        //Creamos un menú, mientras sea distinto de 6 se repetirá.
        while (menu != 6) {

            //Mostramos el menú.
            System.out.println("1.- Nuevo \n"
                    + "2.- Registrar Entrega \n"
                    + "3.- Calcular Kilos Aceite \n"
                    + "4.- Total kilos aceitunas \n"
                    + "5.- Listado de personas \n"
                    + "6.- Salir \n");

            //Solicitamos al usuario la opción.
            menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    Cliente c = new Cliente(); //Creamos un objeto de tipo clente.
                    System.out.println("Introduce los datos del Socio, NIF");
                    String nif = sc.nextLine(); //Solicitamos al usuario el nif
                    c.setNif(nif); //Lo añadimos al cliente creado.

                    //Lo mismo con el resto de atributos.
                    System.out.println("¿Es persona físisca?, Si o No");
                    String personaFisica = sc.nextLine();
                    if (personaFisica.equalsIgnoreCase("SI")) {
                        c.setPersonaFisica(true);
                    } else {
                        c.setPersonaFisica(false);
                    }

                    System.out.println("Introduce la denominación");
                    String denominacion = sc.nextLine();
                    c.setDenominacion(denominacion);

                    listaClientes.add(c);

                    break;
                case 2:
                    System.out.println("Introduce el NIF");
                    nif = sc.nextLine();

                    for (Cliente lc : listaClientes) {

                        if (nif.equalsIgnoreCase(lc.getNif())) {

                            System.out.println("Introduce los Kg de aceitunas entregados");
                            float kgAceitunas = Float.parseFloat(sc.nextLine());
                            System.out.println("Introduce el rendimiento.");
                            float rendimiento = Float.parseFloat(sc.nextLine());
                            lc.registrarEntrega(kgAceitunas, rendimiento);
                            System.out.println("Entrega registrada.");

                        }

                    }

                    break;
                case 3:
                    System.out.println("Introduce el NIF");
                    nif = sc.nextLine();

                    for (Cliente lc : listaClientes) {

                        if (nif.equalsIgnoreCase(lc.getNif())) {

                            System.out.println("Los kilos de aceite producidos por: '" +lc.getDenominacion()+ "' son: " + lc.calcularKilosAceite());

                        }

                    }

                    break;
                case 4:

                    float kgTotales = 0; //Variable para contabilizar los kg totales.

                    for (Cliente lc : listaClientes) {

                        //Recorremos todos los clientes y actualizamos los kgtotales.
                        kgTotales = kgTotales + lc.getKilosAceitunas();

                    }
                    
                    //Una vez salimos del bucle, mostramos la suma de todos los kg.
                    System.out.println("Los Kg totales de aceituna son: " + kgTotales);

                    break;
                case 5:

                    //Mostramos por pantalla los clientes.
                    for (Cliente lc : listaClientes) {

                        System.out.println(lc.toString());

                    }

                    break;

            }
        }
    }
}
