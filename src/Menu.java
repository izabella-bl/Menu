import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean continuar = true;

        System.out.println("\n-------------- Bem Vindo! ----------------\n");

        do {
            System.out.println("\nMenu : \n1-Numeros pares\n2-Numeros impares\n3-Numeros primos\n4-Calculo de investimento\n5-sair");
            System.out.print("\nDigite:");
            int opcao = sc.nextInt();

            boolean valido = true;
            sc.nextLine();

            switch(opcao){
                case 1:
                    do {
                        System.out.println("Digite um numero:");
                        int num = sc.nextInt();

                        valido = validaNumero(num);
                         if(valido) {
                             System.out.printf("Numeros pares ate %d :\n",num);
                             for (int i = 1; i <= num; i++) {
                                 if(i % 2 == 0)
                                 {
                                     System.out.print(i +"\t");
                                 }
                             }
                         }
                    }while (!valido);
                    break;

                case 2:
                    do {
                        System.out.println("Digite um numero:");
                        int num = sc.nextInt();

                        valido = validaNumero(num);
                        if(valido) {
                            System.out.printf("Numeros impares ate %d :\n",num);
                            for (int i = 1; i <= num; i++) {
                                if(i % 2 == 1)
                                {
                                    System.out.print(i +"\t");
                                }
                            }
                        }
                    }while (!valido);
                    break;

                case 3:
                    do {
                        System.out.println("Digite um número:");
                        int num = sc.nextInt();
                        sc.nextLine();

                        valido = validaNumero(num);

                        if(valido) {
                            System.out.printf("Números primos até %d: \n", num);
                            for(int i = 2; i <= num; i++) {
                                if (primo(i)) {
                                    System.out.printf("%d ", i);
                                }
                            }
                        }
                    } while (!valido);
                    break;
                case 4:
                    double valor, taxa;
                    int prazo;

                    do {
                        System.out.print("Valor: ");
                        valor = sc.nextDouble();
                    } while (!validaNumero(valor));

                    do {
                        System.out.print("Taxa(%): ");
                        taxa = sc.nextDouble();
                    } while (!validaNumero(taxa));

                    do {
                        System.out.print("Prazo: ");
                        prazo = sc.nextInt();
                    } while (!validaNumero(prazo));

                    for (int i = 1; i <= prazo; i++) {
                        double retornoMes = valor * (taxa/100);

                        System.out.printf("\nRetorno do mês %d: %.2f", i, retornoMes);

                        valor += retornoMes;
                    }

                    System.out.printf("\n\nMontante para resgate ao final do prazo: %.2f\n", valor);

                    break;

                case 5:
                    System.out.println("Aplicação finalizada.");
                    continuar = false;
                    break;

                default:
                    System.out.println("Numero invalido!");
                    break;
            }

        }while(continuar);
    }

    public static boolean primo(int num) {
        for (int i = 2; i < num; i++) {
            if(num % i ==0) {
                return false;
            }
        }
        return true;
    }

    public static boolean validaNumero(double num) {
        if(num < 0) {
            System.out.println("Erro. Número não pode ser negativo.");
            return false;
        }
        return true;
    }
}
