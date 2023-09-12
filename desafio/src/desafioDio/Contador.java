package desafioDio;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = teclado.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = teclado.nextInt();
        ;

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        teclado.close();

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int p = 1; p <= contagem; p++) {
            System.out.println("Imprimindo o número " + p);
        }
    }
}