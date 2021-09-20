import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.println("\n-------------- Bem Vindo! ----------------\n");
            System.out.println("Menu : \n 1-Numeros pares\n2-Numeros impares\n3-Numeros primos\n4-Calculo de investimento\n5-sair");
            System.out.print("Digite:");
            int opcao = sc.nextInt();

            boolean valido = true;
            sc.nextLine();

            switch(opcao){
                case 1:
                    do {
                        System.out.println("Digite um numero:");
                        int num = sc.nextInt();

                        valido = (num >=0);
                         if(valido) {
                             System.out.printf("Numeros pares ate %d :\n",num);
                             for (int i = 1; i <= num; i++) {
                                 if(i % 2 == 0)
                                 {
                                     System.out.print(i +"\t");
                                 }
                             }

                         }else{
                             System.out.println("Erro, numero deve ser maior do que 0!");
                         }
                    }while (valido == false);
                    break;

                case 2:
                    do {
                        System.out.println("Digite um numero:");
                        int num = sc.nextInt();

                        valido = (num >=0);
                        if(valido) {
                            System.out.printf("Numeros impares ate %d :\n",num);
                            for (int i = 1; i <= num; i++) {
                                if(i % 2 == 1)
                                {
                                    System.out.print(i +"\t");
                                }
                            }

                        }else{
                            System.out.println("Erro, numero deve ser maior do que 0!");
                        }
                    }while (valido == false);
                    break;


                default:
                    System.out.println("Numero invalido!");

                    break;


            }

        }while(continuar);
    }
}
