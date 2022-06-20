public class Gryffindor extends HogwartsStudents {
    private int nobility;
    private int honour;
    private int bravery;


     public Gryffindor (String name, String surname, int magic, int moving, int nobility, int honour, int bravery) {
         super(name,surname,magic,moving);
         this.nobility=nobility;
         this.honour=honour;
         this.bravery=bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public int sumG (){
         return super.ability()+getNobility()+getHonour()+getBravery();
    }

    @Override
    public String toString() {
        return super.toString()+", " + "nobility=" + nobility + ", honour=" + honour + ", bravery=" + bravery ;
    }

}
