package jogo;

import console.Console;
import mecanicas.Carta;
import mecanicas.Tabuleiro;

import java.util.Random;

public class Tabaleiro extends Tabuleiro {

    private Carta teste;
    private Carta a2;

    public Tabaleiro(int numLinhas, int numColunas, Carta fundo) {
        super(numLinhas, numColunas, fundo);
    }



    public void colocaCartaAleatoriaA2() {
        Random rand = new Random();

        int totalLinhas = getTotalLinhas();
        int totalColunas = getTotalColunas();

        // Verifica se o tabuleiro está vazio
        if (totalLinhas == 0 || totalColunas == 0) {
            Console.println("O tabuleiro está vazio, não é possível adicionar uma carta.");
            return;
        }

        // Gera coordenadas aleatórias até encontrar uma posição com a carta teste no tabuleiro
        int linha, coluna;
        do {
            linha = rand.nextInt(totalLinhas);
            coluna = rand.nextInt(totalColunas);
        } while (!pegaCarta(linha, coluna).equals(teste)); // Verifica se a carta na posição é a carta teste

        // Substitui a carta teste na posição gerada pela carta a2
        colocaCarta(linha, coluna, a2);
    }

}

