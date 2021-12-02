/*
Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida
pelo automóvel e o total de combustível gasto.
 * */

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Distância (kms) --> ");
        float dist = input.nextFloat();
        System.out.print("Combustível gasto (Litros) --> ");
        float comb = input.nextFloat();
        float media = comb / dist;
        System.out.printf("Fez uma media de %.2f L a cada km", media);
        float media2 = (comb / dist) * 100;
        System.out.printf("Fez uma media de %.2f L a cada 100 kms", media2);
    }
}
