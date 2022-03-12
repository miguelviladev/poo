package aula02;
import java.util.Scanner;
import java.lang.Math;

public class Exec8 {
    public static void main(String[] args) {
        // Declaração das variáveis
        // Inicialização do scanner para leitura dos dados
        double a, b, c, d;
        Scanner val_input = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Cateto A: ");
        a = val_input.nextDouble();
        System.out.print("Cateto B: ");
        b = val_input.nextDouble();
        val_input.close();

        // Cálculo da hipotenusa e do ângulo
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        d = Math.toDegrees(Math.atan(b/a));

        // Apresentação do resultado
        System.out.println("============== RESULTADO ==============");
        System.out.println("Hipotenusa: " + c);
        System.out.println("Ângulo entre cateto A e hipotenusa: " + d);
    }
}
