public class GryffindorStudents extends HogwartsStudents {
    private int nobility;
    private int honour;
    private int bravery;


     public GryffindorStudents(String name, String surname, int magic, int moving, int nobility, int honour, int bravery) {
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
         return getNobility()+getHonour()+getBravery();
    }

    @Override
    public String toString() {
        return super.toString()+", " + "nobility=" + nobility + ", honour=" + honour + ", bravery=" + bravery ;
    }


    public static void  bestGryffindor (GryffindorStudents student1, GryffindorStudents student2){
        if (student1.sumG()>student2.sumG()){
            System.out.println( student1.getName()+" "+student1.getSurname()+" лучший Гриффиндорец, чем "+student2.getName()+" "+student2.getSurname());
        }else if(student1.sumG()<student2.sumG()){
            System.out.println(student2.getName()+" "+student2.getSurname()+" лучший Гриффиндорец, чем "+student1.getName()+" "+student1.getSurname());
        }else{
            System.out.println(student2.getName()+" "+student2.getSurname()+" лучший Гриффиндорец, чем" +student1.getName()+" "+student1.getSurname() + "имеют одинаковое количество баллов");
        }
    }

}
