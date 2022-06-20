public class Hufflepuff extends HogwartsStudents {
    private int industrious;
    private int loyal;
    private int honest;
    public Hufflepuff (String name, String surname, int magic, int moving, int industrious, int loyal,int honest) {
        super(name,surname,magic,moving);
        this.industrious=industrious;
        this.loyal=loyal;
        this.honest=honest;
    }

    public int getIndustrious() {
        return industrious;
    }

    public void setIndustrious(int industrious) {
        this.industrious = industrious;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
    public int sumH(){
        return getMoving()+getMagic()+getIndustrious()+getLoyal()+getHonest();
    }

    @Override
    public String toString() {
        return super.toString()+ ", " + "industrious=" + industrious + ", loyal=" + loyal + ", honest=" + honest;
    }
    public static void  bestHufflepuff (Hufflepuff student1,Hufflepuff student2){
        if (student1.sumH()>student2.sumH()){
            System.out.println( student1.getName()+" "+student1.getSurname()+" лучший Пуфендуец, чем "+student2.getName()+" "+student2.getSurname());
        }else if(student1.sumH()<student2.sumH()){
            System.out.println(student2.getName()+" "+student2.getSurname()+" лучший Пуфендуец, чем "+student1.getName()+" "+student1.getSurname());
        }else{
            System.out.println(student2.getName()+" "+student2.getSurname()+ " и " + student1.getName()+" "+student1.getSurname() + "имеют одинаковое количество баллов");
        }
    }
}
