package com.company;

import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        double valorPlato, numeroMesa, numeroPersonas, condicion, propina,  totalCompra, valorPropina, descuento, totalPago;
        String plato;
        propina = 1;
        condicion = -1;
        descuento = 0;
        valorPlato = 0;
        valorPropina = 0;
        totalCompra =0;


        System.out.println("Numero de mesa: ");
        numeroMesa = inputData.nextDouble();
        System.out.println("Numero de personas en la mesa: ");
        numeroPersonas = inputData.nextDouble();

            for (int i = 1; i <= numeroPersonas; i++) {
                System.out.println("Plato: ");
                plato = inputData.next();
                System.out.println("ValorPlato");
                valorPlato = inputData.nextDouble();

                totalCompra = totalCompra + valorPlato;

                if (totalCompra > 20000) {
                    descuento = totalCompra * 0.10;
                } else {
                    descuento = 0;
                }

                if (propina == 1) {
                    valorPropina = totalCompra * 0.10;

                } else {
                    valorPropina = 0;
                }

            }


        System.out.println("¿Desea incluir propina?");
        propina = inputData.nextInt();

        totalPago = (totalCompra + valorPropina) - descuento;

        System.out.println("Se le ha realizado un descuento de " + descuento + " por que su compra fue superior a $20.000.");
        System.out.println("Total propina: " + valorPropina);
        System.out.println("El total a pagar es " + totalPago);

    }
}
