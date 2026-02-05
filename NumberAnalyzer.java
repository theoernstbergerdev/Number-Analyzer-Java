import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];

        int soma = 0;
        int quantosPares = 0;
        int quantosImpares = 0;

        int maiorNum = 0;
        int menorNum = 0;

        try {
            System.out.println("--- Analisador de Números ---");
            System.out.println("Regra: Digite apenas 10 números inteiros positivos!");


            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o " + (i + 1) + "º " + "número:");
                numeros[i] = input.nextInt();

                //Validação para impedir números negativos
                if (numeros[i] < 0){
                    throw new IllegalArgumentException("Por favor, apenas números positivos");
                }

                if (i == 0) { //Inicializa maior e menor com o primeiro número digitado
                   maiorNum = numeros[i];
                   menorNum = numeros[i];

                }
                else {
                    if (numeros[i] > maiorNum){
                        maiorNum = numeros[i];
                    }
                    if (numeros[i] < menorNum) {
                        menorNum = numeros[i];
                    }
                }

                if (numeros[i] %2 == 0) { // Verifica se o número é par ou ímpar
                    quantosPares++;
                }
                else {
                    quantosImpares++;
                }
                soma += numeros[i];
            }
            System.out.println("A soma dos 10 números digitados: " + soma);
            System.out.println("Quantidade de números pares: " + quantosPares);
            System.out.println("Quantidade de números impares: " + quantosImpares);
            System.out.println("O maior número digitado: " + maiorNum);
            System.out.println("O menor números digitado: " + menorNum);
            System.out.println("Fim do programa!");
        }
        catch (IllegalArgumentException erroDeNumNega) {
            System.out.println(erroDeNumNega.getMessage());
        }
        catch (Exception letraInvali) {
            System.out.println("Erro: Apenas números");
        }
        finally {
            input.close();
        }
    }
}

