/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_pagos_empleados;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class Lab2_PAGOS_EMPLEADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int b, a = 0, fin = 1;
        int edad, hijo;
        double adicion = 0, suelm1 = 0,
                iad = 0, i = 0, descseg = 0, idesc = 0, ihijo = 0, subt = 0,
                total = 0, itot = 0, hijos = 0;

        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("\nPAGO A EMPLEADOS");
            System.out.print("Porfavor Ingrese el nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Porfavor Ingrese su edad: ");
            edad = entrada.nextInt();
            System.out.print("Porfavor Ingrese el numero de hijos: ");
            hijo = entrada.nextInt();
            System.out.println("\nINGRESE (#) DE EL TIPO DE EMPLEADO");
            System.out.println("EMPLEADO TIPO (1) Sueldo mensual de 340:");
            System.out.println("EMPLEADO TIPO (2) Sueldo mensual de 460:");
            System.out.println("EMPLEADO TIPO (3) Sueldo mensual de 580:");
            System.out.println("EMPLEADO TIPO (4) Sueldo mensual de 600:\n");
            System.out.print("EMPLEADO TIPO :");

            // TODO code application logic here
            b = entrada.nextInt();

            switch (b) {
                case 1:
                    suelm1 = 340;

                    if (edad <= 20) {
                        descseg = 15;
                    } else {
                        if (edad > 20 && edad <= 30) {
                            descseg = 25;
                        } else {
                            if (edad > 30) {
                                descseg = 35;
                            }
                        }
                    }
                    hijos = hijo * 10;
                    ihijo = ihijo + hijos;
                    idesc = idesc + descseg;
                    i = i + suelm1;
                    adicion = suelm1 * 0.05;
                    iad = iad + adicion;
                    subt = suelm1 + adicion + hijos;
                    total = subt - descseg;
                    itot = itot + total;
                    break;

                case 2:
                    suelm1 = 460;

                    if (edad <= 20) {
                        descseg = 15;
                    } else {
                        if (edad > 20 && edad <= 30) {
                            descseg = 25;
                        } else {
                            if (edad > 30) {
                                descseg = 35;
                            }
                        }
                    }
                    hijos = hijo * 10;
                    ihijo = ihijo + hijos;
                    idesc = idesc + descseg;
                    i = i + suelm1;
                    adicion = suelm1 * 0.10;
                    iad = iad + adicion;
                    subt = suelm1 + adicion + hijos;
                    total = subt - descseg;
                    itot = itot + total;
                    break;
                case 3:
                    suelm1 = 580;

                    if (edad <= 20) {
                        descseg = 15;
                    } else {
                        if (edad > 20 && edad <= 30) {
                            descseg = 25;
                        } else {
                            if (edad > 30) {
                                descseg = 35;
                            }
                        }
                    }
                    hijos = hijo * 10;
                    ihijo = ihijo + hijos;
                    idesc = idesc + descseg;
                    i = i + suelm1;
                    adicion = suelm1 * 0.15;
                    iad = iad + adicion;
                    subt = suelm1 + adicion + hijos;
                    total = subt - descseg;
                    itot = itot + total;
                    break;
                case 4:
                    suelm1 = 600;

                    if (edad <= 20) {
                        descseg = 15;
                    } else {
                        if (edad > 20 && edad <= 30) {
                            descseg = 25;
                        } else {
                            if (edad > 30) {
                                descseg = 35;
                            }
                        }
                    }
                    hijos = hijo * 10;
                    ihijo = ihijo + hijos;
                    idesc = idesc + descseg;
                    i = i + suelm1;
                    adicion = suelm1 * 0.15;
                    iad = iad + adicion;
                    subt = suelm1 + adicion + hijos;
                    total = subt - descseg;
                    itot = itot + total;
                    break;

            }
            System.out.println("\nDETALLE DE PAGO A EMPLEADO ");
            System.out.printf("%nNombre:%s %nEdad:%d %nSueldo mensual:%.2f "
                    + "%nIncentivo:%.2f %nHijos:%d %nDescuento Seguro Social:%.2f "
                    + "%nTotal a pagar:%.2f%n%n%n", nombre, edad, suelm1, adicion, hijo, descseg, total);

            System.out.print("OPCION: (1) CONTINUAR (SIGUIENTE EMPLEADO)     -"
                    + "      OPCION: (2) FINALIZAR (PAGOS TOALES EMPRESA) \n");
            System.out.print("DIGITE UNA OPCION :");
            fin = entrada.nextInt();
            entrada.nextLine();

        } while (fin != 2);
        System.out.print("\nREPORTE ROL DE PAGOS (TOTALES) DE LA EMPRESA :\n");
        System.out.printf("%nTotal Descuento por seguro Social:%.2f"
                + "%nTotal Incentivos:%.2f %nTotal Pago Por Hijos:%.2f"
                + "%nTotal Pago De La Empresa:%.2f", idesc, iad, ihijo, itot);
        System.out.print("\n");

    }

}
