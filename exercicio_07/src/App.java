import java.util.Scanner;

public class App {

    public static void main(String[] args) {
//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
        double lados;
        double area;
        double dobroarea;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a medida dos lados do quadrado:");

        lados = teclado.nextDouble();

        area = Math.pow(lados, 2);

        System.out.println("O valor da área do quadrado é:" + area);

        dobroarea = area * 2;

        System.out.println("O dobro da área do quadrado é:" + dobroarea);
    }
}