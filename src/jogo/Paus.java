package jogo;

import console.Console;

import java.util.Scanner;

public class Paus extends Menu {

    public static void paus1() {


        Scanner scanner = new Scanner(System.in);
        int escolha;


        do{
            paus1();
            escolha = scanner.nextInt();

            switch (escolha){

                case 1:
                    Console.println("Voltar ao jogo");

                    //ADD JOVO JOGO
                    break;

                case 2:
                    Console.println("Salvo");

                    //ADD JOGO SALVO
                    break;

                case 3:
                    Console.println("voltar ao menu");
                    break;

                case 4:
                    Console.println("Sair");
                    return;


                default:
                    Console.println("ESCOLHA");
                    break;


            }
        }while(true);



    }

    public static void pause(){
        Console.println("MENU DE PAUSE" );
        Console.println("1-VOLTAR AO JOGO");
        Console.println("2-SALVAR O JOGO");
        Console.println("3-VOLTAR AO MENU");
        Console.println("4-Sair");
        Console.print("Escolha: ");

    }
}
