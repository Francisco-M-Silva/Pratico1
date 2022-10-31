import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int linhas;
        System.out.println("Quantas Linhas? ");
        linhas = myObj.nextInt();

        System.out.println("# Padrão A");
        for (int h = 1; h <= linhas; ++h) {
            for (int j = 1; j <= h; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("# Padrão B");
        for (int h = linhas; h >= 1; --h) {
            for (int j = 1; j <= h; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("# Padrão C");
        for (int h = 1; h <= linhas; ++h)
        {
            for (int j = linhas - 1; j >= h; --j)
            {
                System.out.print("  ");
            }

            for( int v = h; v >= 1; --v)
            {
                System.out.print(v + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}