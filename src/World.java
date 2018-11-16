
public class World {

    public static void main(String[] args) {
        int rows = 10;
        int columns = 10;
        int[][] multi = new int[rows][columns];
        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<columns; j++){
                multi[i][j] = 0;
                multi[0][j] = 1;
                multi[rows-1][j] = 1;
                multi[i][0] = 1;
                multi[i][columns-1] = 1;
            }
        }

        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                System.out.print(multi[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
