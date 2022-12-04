import java.util.Scanner;

public class Exercico4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b, c, R1, R2;

        System.out.println("Entre com o valor de A: ");
        a = Float.parseFloat(input.nextLine());
        System.out.println("Entre com o valor de B: ");
        b = Float.parseFloat(input.nextLine());
        System.out.println("Entre com o valor de C: ");
        c = Float.parseFloat(input.nextLine());

        if ((a == 0) || (((b * b) - (4 * a * c)) < 0)) {
            System.out.println("Impossível calcular!!!");
        } else {
            R1 = (float) ((-b + Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a));
            R2 = (float) ((-b - Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a));

            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);

        }

    }

}
