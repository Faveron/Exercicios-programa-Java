import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("O programa a seguir calcula os números primos no intervalo entre dois valores inseridos: ");

        int[] n = new int[2];
        ArrayList<Integer> numerosPrimos = new ArrayList();

        n = armazenaDoisNumeros(n);

        for (int i = n[0]; i <= n[1]; i++) {
            if (i == 2 || i == -2) {
                numerosPrimos.add(i);
            } else if (i % 2 != 0 && i != 1 && i != -1 && verificaSeEPrimo(i)) {
                numerosPrimos.add(i);
            }
        }

        if (numerosPrimos.size() == 0) {
            System.out.println("Não existe números primos entre " + n[0] + " e " + n[1] + "\n");
        } else {
            System.out.println("São número primos entre " + n[0] + " e " + n[1] + "\n" + numerosPrimos);
        }
    }

    public static int[] devolveNumerosEmOrdemCrescente(int[] v) {
        if (v[0] > v[1]) {
            int aux = v[0];
            v[0] = v[1];
            v[1] = aux;
        }
        return v;
    }

    public static int[] armazenaDoisNumeros(int[] v) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o 1º valor: ");
        v[0] = entrada.nextInt();
        System.out.print("Digite o 2º valor: ");
        v[1] = entrada.nextInt();

        return devolveNumerosEmOrdemCrescente(v);
    }

    public static boolean verificaSeEPrimo(int a) {
        for (int j = 2; j <= (Math.abs(a) / 2) + 1; j++) {
            if (a % j == 0) {
                return false;
            }
        }
        return true;
    }
}