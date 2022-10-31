import java.util.Scanner;

public class test2
{
    public static void main(String[] args)
    {
        System.out.println("Jogo do Adivinha");
        double R;
        int n;
        int num;
        n = 0;
        int t;
        t = 0;
        R = Math.floor(Math.random() * 1000) + 1;
        // Uma hora para por o loop a funcionar quando o unico problema era um ; no for
        for (int i = 1; i > n; i++)
        {
            Scanner num1 = new Scanner(System.in);
            System.out.println("Numero? ");
            num = num1.nextInt();

            if (num == R)
            {
                System.out.println("Acertou, o numero e " + R);
                System.out.println("Numero de tentativas = " + t);

                break;
            }
            else if (num < R)
            {
                System.out.println("Mais alto");
                t = t + 1;
            }
            else if (num > R)
            {
                System.out.println("Mais baixo");
                t = t + 1;
            }
        }
    }
}
