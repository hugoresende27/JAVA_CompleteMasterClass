/*
user input de notas com media
 */
import java.util.Scanner;

class Medias {              //classe Medias
    public float calcMedia(float sn,int t){     //Metodo que retorna a media
        return sn/t;
    }
}
public class ciclosFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Medias res = new Medias();//instanciar o objeto res com base na classe Medias()

        int notas=0;
        float somaNotas=0,media=0;
        System.out.print("Quantas notas? --> ");
        notas = input.nextInt();
        for (int i=0; i<notas; i++){
            System.out.printf("Nota %d --> ", i+1);
            somaNotas+=input.nextFloat();
        }
        System.out.printf("\nA sua media vai ser de %.2f",res.calcMedia(somaNotas,notas));
        //chamar o objeto res.metodo calcMedia parametros (somaNotas,notas)
       // media=somaNotas/notas;
        //System.out.printf("\nA sua media vai ser de %.2f",media);

    }

}
