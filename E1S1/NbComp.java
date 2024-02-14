public class NbComp {
    private int partieReelle;
    private int partieImaginaire;

    public NbComp(int partieReelle, int partieImaginaire) {
        this.partieReelle = partieReelle;
        this.partieImaginaire = partieImaginaire;
    }

    public int getPartieReelle() {
        return partieReelle;
    }

    public int getPartieImaginaire() {
        return partieImaginaire;
    }

    public void setPartieReelle(int partieReelle) {
        this.partieReelle = partieReelle;
    }

    public void setPartieImaginaire(int partieImaginaire) {
        this.partieImaginaire = partieImaginaire;
    }

    public static NbComp addition(NbComp nbComp1, NbComp nbComp2) {
        int partieReelle = nbComp1.getPartieReelle() + nbComp2.getPartieReelle();
        int partieImaginaire = nbComp1.getPartieImaginaire() + nbComp2.getPartieImaginaire();
        NbComp nbComp = new NbComp(partieReelle, partieImaginaire);
        return nbComp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        NbComp other = (NbComp) obj;
        return partieReelle == other.partieReelle && partieImaginaire == other.partieImaginaire;
    }
}
