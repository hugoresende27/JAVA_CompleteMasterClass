import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NOTA--> ");
        int exameRes = sc.nextInt();

        switch (exameRes){
            case 50:
                System.out.println("Nota D");
                break;
            case 65:
                System.out.println("Nota C");
                break;
            case 80:
                System.out.println("Nota B");
                break;
            case 90:
                System.out.println("Nota A");
                break;
        }
    }
}
