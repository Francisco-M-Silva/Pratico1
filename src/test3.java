public class test3 {
    public static void main(String args[])
    {
        resolvegame();
    }

    public static int[][] initialFrame1 =
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

    public static void resolvegame() {
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
    }

}