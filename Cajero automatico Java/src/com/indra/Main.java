package com.indra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Cajero cajero = new Cajero();
        boolean flag = true;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~ Bienvenid@ ~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        //Inicio de sesión
        //Delimitar el número de inicios de sesión a 3
        System.out.println("Ingrese su nombre:");
        String nombre = input.next();
        for(int i = 1; i <= 3; i++){
            System.out.println("Por favor ingrese su PIN:");
            String pass = input.next();

            //Verificar la PIN
            if(pass.equals("1235")){
                flag = true;
                break;
            }else {
                if(i <= 2){
                    System.out.println("El PIN es incorrecto, aun tienes " + (3-i) + " intentos");
                }else {
                    System.exit(0);
                }
                flag = false;
            }

        }

        if(flag){
            System.out.println("Bienvenido " + nombre);

            char respuesta = 's';
            while (respuesta == 's'){
                System.out.println("Selecciona la opción que desee");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Retirar Saldo");
                System.out.println("3. Histórico de movimientos");

                int opcion = input.nextInt();

                switch (opcion){
                    case 1:
                        System.out.println("~~~~~~~~ Consultar ~~~~~~~~");
                        cajero.consultar();
                        break;
                    case 2:
                        System.out.println("~~~~~~~~ Retirar ~~~~~~~~");
                        cajero.retirar();
                        break;
                    case 3:
                        System.out.println("~~~~~~~~ Histórico de movimientos ~~~~~~~~");
                        cajero.historico();
                        break;
                    default:
                        System.out.println("La opción que eligio no es correcta");
                        break;
                }
                System.out.println("Continuar: s/n");
                respuesta = input.next().charAt(0);
            }
            System.out.println("Gracias por su preferencia");
            
            //Cambio Java
        }
    }
}
