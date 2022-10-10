package com.indra;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cajero {

    double saldo = 1000;
    Scanner input = new Scanner(System.in);
    HashMap<String, Date> movimientos = new HashMap<>();

    public void consultar(){
        if(saldo > 0){
            System.out.println("Su saldo actual es de: " + saldo);
        }else {
            System.out.println("No cuenta con fondos");
        }
    }

    public void retirar(){
        if(saldo > 0){
            System.out.println("Ingrese la cantidad de dinero a retirar: ");
            double retiro = input.nextDouble();
            if(retiro > 0){
                if(retiro <= saldo){
                    saldo = saldo - retiro;
                    movimientos.put("Saldo anterior: " + (saldo + retiro) + " | Retiro: " + retiro + " | Saldo actual: " + saldo + " | Fecha: ", new  Date());
                    System.out.println("Su saldo actual es de: " + saldo);
                }else {
                    System.out.println("Saldo insuficiente");
                }
            }else {
                System.out.println("Ingrese una cantidad correcta");
            }


        }else {
            System.out.println("No tiene saldo a retirar");
        }
    }

    public void historico(){
        movimientos.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
