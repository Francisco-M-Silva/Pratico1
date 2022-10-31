import java.util.Scanner;

public class Pratico {

    public static void main(String[] args) {
        int condicao = 0;
        boolean condition = true;
        while (condition) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Escolha o programa: \n(1) Desenho de Padroes;\n(2) Jogo do Adivinha;\n(3) Sudoku Simplificado;\n(4) Sair;");
            condicao = myObj.nextInt();
            switch (condicao) {
                case 1:
                    programa1();
                    break;

                case 2:
                    programa2();
                    break;

                case 3:
                    programa3();
                    break;

                case 4:
                    programa4();
                    break;

            }
        }
    }


    public static void programa1()
    {

        System.out.println("Desenho de Padroes");
        Scanner l = new Scanner(System.in);
        int linhas;
        //Delimita o limite das linhas
        System.out.println("Quantas Linhas? ");
        linhas = l.nextInt();

        System.out.println("# Padrao A");
        // linhas
        for (int h = 1; h <= linhas; ++h) {
            // Numeros
            for (int j = 1; j <= h; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("# Padrao B");
        // linhas
        for (int h = linhas; h >= 1; --h) {
            // Numeros
            for (int j = 1; j <= h; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("# Padrao C");
        // Numero de linhas
        for (int h = 1; h <= linhas; ++h) {
            //Numero de espaços entre o inicio do string e do numero
            // linhas - 1 porque fica com 1 espaço a mais
            for (int j = linhas - 1; j >= h; --j) {
                System.out.print("  ");
            }
            // Numeros
            for (int v = h; v >= 1; --v) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
        System.out.println();

        Scanner rep1 = new Scanner(System.in);
        System.out.println("Deseja repetir? (1) Sim  (2)Nao");
        int rep;
        rep = rep1.nextInt();

        if (rep == 1)
        {
            programa1();
        }
            else if (rep == 2)
            {
                System.out.println("------------------ \n");
            }
        }


    public static void programa2()

    {
        System.out.println("Jogo do Adivinha");
        double R;
        int n;
        int num;
        int t;
        t = 1;
        n = 0;
        t = 0;
        // Cria um numero random até 1000
        R = Math.floor(Math.random() * 1000) + 1;
        // Uma hora para por o loop a funcionar quando o unico problema era um ; no for
        System.out.println("Escolha um numero entre 1 e 1000");
        for (int i = 1; i > n; i++)
        {
            Scanner num1 = new Scanner(System.in);
            System.out.println("Numero? ");
            num = num1.nextInt();
            // Se a tentativa estiver correta
            if (num == R)
            {
                // Numero correto
                System.out.println("Acertou, o numero e " + R);
                // Numero de Tentativas
                t = t+ 1;
                System.out.println("Numero de tentativas = " + t);

                break;
            }
            // Se a tentativa for abaixo do numero
            else if (num < R)
            {
                System.out.println("Mais alto");
                t = t + 1; // Erro = +1 nas tentativas
            }
            // Se a tentative for acima do numero
            else if (num > R)
            {
                System.out.println("Mais baixo");
                t = t + 1; // Erro = +1 nas tentativas
            }

        }
        Scanner rep2 = new Scanner(System.in);
        System.out.println("Deseja repetir? (1) Sim  (2)Nao");
        int rep;
        rep = rep2.nextInt();

        if (rep == 1)
        {
            programa2();
        }
        else if (rep == 2)
        {
            System.out.println("------------------ \n");
        }
    }
    public static void programa3()
    {


        int[][] initialFrame1 =
                {
                        {0, 0, 0, 2, 6, 0, 7, 0, 1},
                        {6, 8, 0, 0, 7, 0, 0, 9, 0},
                        {1, 9, 0, 0, 0, 4, 5, 0, 0},
                        {8, 2, 0, 1, 0, 0, 0, 4, 0},
                        {0, 0, 4, 6, 0, 2, 9, 0, 0},
                        {0, 5, 0, 0, 0, 3, 0, 2, 8},
                        {0, 0, 9, 3, 0, 0, 0, 7, 4},
                        {0, 4, 0, 0, 5, 0, 0, 3, 6},
                        {7, 0, 3, 0, 1, 8, 0, 0, 0}
                };

        boolean ongoingGame = true;
        String frame = "";
        while (ongoingGame)
        {
            for (int y = 0; y <= 8; y++)
            {
                frame += "| ";
                for (int x = 0; x <= 8; x++)
                {
                    frame += initialFrame1[x][y] + " | ";
                }
                //cria as 9 linhas
                frame += "\n";
            }
            System.out.print(frame);
            ongoingGame = false;
        }
        Scanner rep3 = new Scanner(System.in);
        System.out.println("Deseja repetir? (1) Sim  (2)Nao");
        int rep;
        rep = rep3.nextInt();

        if (rep == 1)
        {
            programa3();
        }
        else if (rep == 2)
        {
            System.out.println("------------------ \n");
        }
    }

    public static void programa4()
    {
        System. exit(0);
    }

}