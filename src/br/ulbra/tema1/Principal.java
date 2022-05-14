package br.ulbra.tema1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Principal {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Tema1 tema1 = new Tema1();

        System.out.println("Informe qual a conta deve ser realizada, digite: "
                + "\n 1 para MA = (N1 + N2 + N3)/3"
                + "\n 2 para MP = (N1*2 + N2*3 + N*5) / 10"
                + "\n 3 para MH = 2/(1/n+1/n2)"
                + "\n 4 para S = (a + b + c)/2"
                + "\n 5 para a =  (5*(5-a)*(5-b)*(5-c))"
                + "\n 6 para EP = Kx²/2"
                + "\n 7 para Baskara"
                + "\n 8 para Distancia entre dois pontos: ");

        int opcao = ler.nextInt();
        switch (opcao) {
            case 1:
                System.out.print("Digite o 1° valor: ");
                tema1.n1 = ler.nextDouble();

                System.out.print("Digite o 2° valor: ");
                tema1.n2 = ler.nextDouble();

                System.out.print("Digite o 3° valor: ");
                tema1.n3 = ler.nextDouble();

                System.out.println("O resultado é: " + tema1.ma(tema1.n1, tema1.n2, tema1.n3));
                break;

            case 2:
                System.out.print("Digite o 1° valor: ");
                tema1.n1 = ler.nextDouble();

                System.out.print("Digite o 2° valor: ");
                tema1.n2 = ler.nextDouble();

                System.out.print("Digite o 3° valor: ");
                tema1.n3 = ler.nextDouble();

                System.out.println("O resultado é: " + tema1.mp(tema1.n1, tema1.n2, tema1.n3));
                break;

            case 3:
                System.out.print("Digite o 1° valor: ");
                tema1.n1 = ler.nextDouble();

                System.out.print("Digite o 2° valor: ");
                tema1.n2 = ler.nextDouble();

                System.out.println("O resultado é: " + tema1.mh());
                break;

            case 4:
                System.out.println("Digite o valor de a: ");
                tema1.a = ler.nextDouble();

                System.out.println("Digite o valor de b: ");
                tema1.b = ler.nextDouble();

                System.out.println("Digite o valor de c: ");
                tema1.c = ler.nextDouble();

                System.out.println("O resultado é: " + tema1.s(tema1.a, tema1.b, tema1.c));
                break;

            case 5:
                System.out.println("Digite o valor de a: ");
                tema1.a = ler.nextDouble();

                System.out.println("Digite o valor de b: ");
                tema1.b = ler.nextDouble();

                System.out.println("Digite o valor de c: ");
                tema1.c = ler.nextDouble();
                
                System.out.println("Digite o valor de s: ");
                tema1.s = ler.nextDouble();

                System.out.println("O resultado é: " + tema1.a());
                break;

            case 6:
                System.out.println("Digite o valor da constate K:");
                tema1.k = ler.nextDouble();

                System.out.println("Digite o valor de x: ");
                tema1.xi = ler.nextDouble();

                System.out.println("O resultado é: " + tema1.ep() + "j");
                break;

            case 7:
                System.out.println("Digite o valor de a: ");
                tema1.a = ler.nextDouble();
                
                System.out.println("Digite o valor de b: ");
                tema1.b = ler.nextDouble();
                
                System.out.println("Digite o valor de c: ");
                tema1.c = ler.nextDouble();
                
                System.out.println(" " + tema1.calcularB());
                
            case 8:
                System.out.println("Digite o X1: ");
                tema1.xi = ler.nextDouble();
                
                System.out.println("Digite o X2: ");
                tema1.xii = ler.nextDouble();
                
                System.out.println("Digite o Y1: ");
                tema1.yi = ler.nextDouble();
                
                System.out.println("Digite o 2: ");
                tema1.yii = ler.nextDouble();
                
                System.out.println("O resultado é: " + tema1.d()+ " u.c.");
                
        }

    }
}
