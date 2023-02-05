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
        Scanner sc = new Scanner(System.in);
        int menu = 10;
        HashSet<Cliente> listaClientes = new HashSet<>();

        Cliente c1 = new Cliente("00000000T", true, "Me llamo Ralph");
        Cliente c2 = new Cliente("R11111111", false, "Empresa de las falsas");
        Cliente c3 = new Cliente("22222222Z", true, "Juanito");
        Cliente c4 = new Cliente("1q", true, "Cliente de prueba.");
        

        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);
        listaClientes.add(c4);

        while (menu != 6) {

            System.out.println("1.- Nuevo \n"
                    + "2.- Registrar Entrega \n"
                    + "3.- Calcular Kilos Aceite \n"
                    + "4.- Total kilos aceitunas \n"
                    + "5.- Listado de personas \n"
                    + "6.- Salir \n");

            menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    Cliente c = new Cliente();
                    System.out.println("Introduce los datos del Socio, NIF");
                    String nif = sc.nextLine();
                    c.setNif(nif);

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

                    float kgTotales = 0;

                    for (Cliente lc : listaClientes) {

                        kgTotales = kgTotales + lc.getKilosAceitunas();

                    }
                    
                    System.out.println("Los Kg totales de aceituna son: " + kgTotales);

                    break;
                case 5:

                    for (Cliente lc : listaClientes) {

                        System.out.println(lc.toString());

                    }

                    break;

            }

        }

    }

}
