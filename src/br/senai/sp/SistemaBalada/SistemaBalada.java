package br.senai.sp.SistemaBalada;

import java.util.Scanner;


public class SistemaBalada {


    public static void main(String[] args) {
        /** Declara as Variaveis */
        
        String nome, nomeAcompanhante;
        int idade, idadeAcompanhante = 0;
        boolean continuar;


        /** Instanciar Scanner */
        Scanner teclado = new Scanner(System.in);

        while (continuar) {

            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("olá, diga seu nome: ");
            nome = teclado.next();
            System.out.println("Diga sua idade e não minta: ");
            idade = teclado.nextInt();

            /** Avaliação da pessoa */

            if (idade >= 18 && idade % 2 == 0) {
                System.out.println("idade liberada !!!");
            } else if (idade >= 18 && idade % 2 == 1) {


                /** coleta de dados */

                System.out.println("qual o nome do acompanhante: ");
                nomeAcompanhante = teclado.nextLine();
                System.out.println("Olá" + nomeAcompanhante);
                System.out.println("idade do acompanhante: ");
                idadeAcompanhante = teclado.nextInt();
                System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

            } else {
                System.out.println("Proibido entrada de menores !!!");
            }

            if ((idadeAcompanhante) % 2 == 0 && idadeAcompanhante >= 18) {
                System.out.println("Curtam bantante a Nossa Balada !");
            } else {
                System.out.println("Vão Embora !");
            }

            /** avalia loop */

            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("Deseja Continuar: [1-Sim / 2-Não]");

            int opção = teclado.nextInt();

            if (opção == 2){
                continuar = false;
            }



        }



        }
    }

