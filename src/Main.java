import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            MoveMin mm = new MoveMin();
            mm.readMatrix();
            mm.printMatr();
            mm.moveMinimal();
            mm.printMatr();
        }
        catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        }
    }
}
