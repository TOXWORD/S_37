import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MoveMin {

    private final String PATHNAME = "input.txt";

    private double[][] matr;
    private int sizeX;
    private int sizeY;

    MoveMin() throws FileNotFoundException {
        File f = new File(PATHNAME);
        try(Scanner sc = new Scanner(f)){
            sizeX = sc.nextInt();
            sizeY = sc.nextInt();
        }
        matr = new double[sizeX][sizeY];
    }

    public void readMatrix() throws FileNotFoundException {
        File f = new File(PATHNAME);
        try(Scanner sc = new Scanner(f)){
            sc.nextInt();
            sc.nextInt();

            for(int i = 0; i < sizeX; i++){
                for(int j = 0; j < sizeY; j++){
                    matr[i][j] = sc.nextDouble();
                }
            }
        }
    }

    public void printMatr(){
        for(int i = 0; i < sizeX; i++){
            for(int j = 0; j < sizeY; j++){
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void moveMinimal(){
        int posX = 0;
        int posY = 0;
        double min = Double.MAX_VALUE;
        double[] tempX;
        double tempY;

        for(int i = 0; i < sizeX; i++){
            for(int j = 0; j < sizeY; j++){
                if(matr[i][j] < min){
                    min = matr[i][j];
                    posX = i;
                    posY = j;
                }
            }
        }

        tempX = matr[sizeX - 1];
        matr[sizeX - 1] = matr[posX];
        matr[posX] = tempX;

        for(int i = 0; i < sizeX; i++){
            tempY = matr[i][sizeY - 1];
            matr[i][sizeY - 1] = matr[i][posY];
            matr[i][posY] = tempY;
        }

    }

}
