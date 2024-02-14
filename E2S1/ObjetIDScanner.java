import java.util.Scanner;

public class ObjetIDScanner {

    private static int firstID;
    private int ID;

    static {
        Scanner sc = new Scanner(System.in);

        firstID = -1;

        while (firstID < 0) {
            System.out.println("Enter the first ID: ");
            firstID = sc.nextInt();
        }

        sc.close();
    }

    public ObjetIDScanner() {
        this.ID = firstID;
        firstID++;
    }

    public int getIdent() {
        return ID;
    }

    public int getIdentMax() {
        return firstID - 1;
    }

}
