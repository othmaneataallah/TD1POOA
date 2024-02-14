public class Main {
    public static void main(String[] args) {
        NbComp nbComp1 = new NbComp(1, 2);
        NbComp nbComp2 = new NbComp(3, 4);
        NbComp nbComp3 = new NbComp(5, 6);
        NbComp nbComp4 = NbComp.addition(nbComp1, nbComp2);
        NbComp nbComp5 = NbComp.addition(nbComp1, nbComp2);
        NbComp nbComp6 = NbComp.addition(nbComp1, nbComp3);
        System.out.println(nbComp4.equals(nbComp5));
        System.out.println(nbComp4.equals(nbComp6));
    }
}