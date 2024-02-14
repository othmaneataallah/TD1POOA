public class ObjetID {

    private static int maxID;
    private int ID;

    public ObjetID() {
        this.ID = maxID;
        maxID++;
    }

    public int getIdent() {
        return ID;
    }

    public int getIdentMax() {
        return maxID;
    }

}
