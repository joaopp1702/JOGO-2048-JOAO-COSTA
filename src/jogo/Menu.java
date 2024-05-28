package jogo;

import console.Console;
import console.Tecla;
import cores.Cor;
import cores.StringColorida;
import mecanicas.Tabuleiro;
import mecanicas.Carta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;


public class Menu {





    public static void main(String[] args) {
        StringColorida fundin = new StringColorida(" 0  ", Cor.BRANCO_BRANCO, Cor.FUNDO_PRETO);
        StringColorida barrae = new StringColorida("|---", Cor.CINZA, Cor.FUNDO_PRETO);
        StringColorida barrad = new StringColorida("---|", Cor.CINZA, Cor.FUNDO_PRETO);
        StringColorida teto = new StringColorida("----", Cor.CINZA, Cor.FUNDO_PRETO);
        StringColorida c1 = new StringColorida("2   ", Cor.AZUL, Cor.FUNDO_PRETO);
        StringColorida c2 = new StringColorida("4   ", Cor.AZUL, Cor.FUNDO_PRETO);
        StringColorida c3 = new StringColorida("8   ", Cor.AZUL, Cor.FUNDO_PRETO);
        StringColorida c4 = new StringColorida("16  ", Cor.AZUL, Cor.FUNDO_PRETO);
        StringColorida c5 = new StringColorida("32  ", Cor.AZUL, Cor.FUNDO_PRETO);
        StringColorida c6 = new StringColorida("64  ", Cor.AZUL, Cor.FUNDO_PRETO);
        StringColorida c7 = new StringColorida("128 ", Cor.AZUL, Cor.FUNDO_PRETO);
        StringColorida c8 = new StringColorida("256 ", Cor.AZUL, Cor.FUNDO_PRETO);
        StringColorida c9 = new StringColorida("512 ", Cor.AZUL, Cor.FUNDO_PRETO);
        StringColorida c10 = new StringColorida("1024", Cor.AZUL, Cor.FUNDO_PRETO);
        StringColorida c11 = new StringColorida("2048", Cor.AZUL, Cor.FUNDO_PRETO);

        carta tet = new carta(teto);
        carta barraae = new carta(barrae);
        carta barraad = new carta(barrad);
        carta a2 = new carta(c1);
        carta a4 = new carta(c2);
        carta a8 = new carta(c3);
        carta a16 = new carta(c4);
        carta a32 = new carta(c5);
        carta a64 = new carta(c6);
        carta a128 = new carta(c7);
        carta a256 = new carta(c8);
        carta a512 = new carta(c9);
        carta a1024 = new carta(c10);
        carta a2048 = new carta(c11);
        carta teste = new carta(fundin);


//        Tabuleiro tab = new Tabaleiro(6, 6, teste);
//        tab.colocaCarta(0 , 0, barraae );
//        tab.colocaCarta(1 , 0, barraae );
//        tab.colocaCarta(2 , 0, barraae );
//        tab.colocaCarta(3 , 0, barraae );
//        tab.colocaCarta(4 , 0, barraae );
//        tab.colocaCarta(5 , 0, barraae);
//        tab.colocaCarta(0 , 1, tet );
//        tab.colocaCarta(0 , 2, tet );
//        tab.colocaCarta(0 , 3, tet );
//        tab.colocaCarta(0 , 4, tet );
//        tab.colocaCarta(0 , 5, tet );
//        tab.colocaCarta(5 , 0, barraae );
//        tab.colocaCarta(5 , 1, tet );
//        tab.colocaCarta(5 , 2, tet );
//        tab.colocaCarta(5 , 3, tet );
//        tab.colocaCarta(5 , 4, tet );
//        tab.colocaCarta(5 , 5, tet );
//        tab.colocaCarta(0 , 5, barraad );
//        tab.colocaCarta(1 , 5 , barraad );
//        tab.colocaCarta(2 , 5, barraad );
//        tab.colocaCarta(3 , 5, barraad );
//        tab.colocaCarta(4 , 5, barraad );
//        tab.colocaCarta(5 , 5, barraad );
//        tab.colocaCarta(0 , 5, barraad );
//
//
//
//
//
//        Console.println(tab);










        Scanner scanner = new Scanner(System.in);
        int escolha;


        do{
            Tela();
            escolha = scanner.nextInt();

            switch (escolha){

                case 1:
                    Console.println("Novo Jogo");


                    Tabaleiro tab = new Tabaleiro(6, 6, teste);
                    tab.colocaCarta(0 , 0, barraae );
                    tab.colocaCarta(1 , 0, barraae );
                    tab.colocaCarta(2 , 0, barraae );
                    tab.colocaCarta(3 , 0, barraae );
                    tab.colocaCarta(4 , 0, barraae );
                    tab.colocaCarta(5 , 0, barraae);
                    tab.colocaCarta(0 , 1, tet );
                    tab.colocaCarta(0 , 2, tet );
                    tab.colocaCarta(0 , 3, tet );
                    tab.colocaCarta(0 , 4, tet );
                    tab.colocaCarta(0 , 5, tet );
                    tab.colocaCarta(5 , 0, barraae );
                    tab.colocaCarta(5 , 1, tet );
                    tab.colocaCarta(5 , 2, tet );
                    tab.colocaCarta(5 , 3, tet );
                    tab.colocaCarta(5 , 4, tet );
                    tab.colocaCarta(5 , 5, tet );
                    tab.colocaCarta(0 , 5, barraad );
                    tab.colocaCarta(1 , 5 , barraad );
                    tab.colocaCarta(2 , 5, barraad );
                    tab.colocaCarta(3 , 5, barraad );
                    tab.colocaCarta(4 , 5, barraad );
                    tab.colocaCarta(5 , 5, barraad );
                    tab.colocaCarta(0 , 5, barraad );

                    tab.colocaCartaAleatoriaA2();

                    Console.println(tab);



                    break;
                case 2:
                    Console.println("Jogo Salvo");
                    break;
                case 3:
                    Console.println("Sair");
                    return;
                case 4:
                    Console.println("menu");
                    paus1();
                default:
                    Console.println("ESCOLHA");
                    break;


            }
        }while(true);



    }

    public Menu() {
    }

    private static void Tela() {


        Console.println("☛2048 por Joao Costa☚");
        Console.println("1-Novo Jogo");
        Console.println("2-Jogo Salvo");
        Console.println("3-Sair");
        Console.print("ESCOLHA ENTRE 1, 2, 3 NAO ERRE DNV SE NAO O SEU PC VAI EXPLODIR: ");



    }


    public static void paus1() {


        Scanner scanner = new Scanner(System.in);
        int escolha1;


        do{
            paus();
            escolha1 = scanner.nextInt();

            switch (escolha1){

                case 1:
                    Console.println("Voltar ao jogo");
                    paus();
                    //ADD JOVO JOGO
                    break;
                case 2:
                    Console.println("Salvo");
                    paus();
                    //ADD JOGO SALVO
                    break;
                case 3:
                    Console.println("voltar ao menu");
                    Tela();
                case 4:
                    Console.println("Sair");
                    exitProgram();
                default:
                    Console.println("ESCOLHA");
                    break;


            }
        }while(true);



    }
    public static void paus(){
        Console.println("MENU DE PAUSE" );
        Console.println("1-VOLTAR AO JOGO");
        Console.println("2-SALVAR O JOGO");
        Console.println("3-VOLTAR AO MENU");
        Console.println("4-Sair");
        Console.print("Escolha: ");

    }



    public static void exitProgram() {
        System.exit(0);
    }





}
