public class RavenclawStudents extends HogwartsStudents {
    private  int smart;
    private int wise;
    private int witty;
    private int creative;
    public RavenclawStudents(String name, String surname, int magic, int moving, int smart, int wise, int witty, int creative) {
        super(name,surname,magic,moving);
        this.smart=smart;
        this.wise=wise;
        this.witty=witty;
        this.creative=creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
    public int sumR(){
        return getSmart()+getWise()+getWitty()+getCreative();
    }

    @Override
    public String toString() {
        return super.toString()+", " + "smart=" + smart + ", wise=" + wise + ", witty=" + witty + ", creative=" + creative;
    }
    public static void  bestRavenclaw (RavenclawStudents student1, RavenclawStudents student2){
        if (student1.sumR()>student2.sumR()){
            System.out.println( student1.getName()+" "+student1.getSurname()+" лучший Когтевранец, чем "+student2.getName()+" "+student2.getSurname());
        }else if(student1.sumR()<student2.sumR()){
            System.out.println(student2.getName()+" "+student2.getSurname()+" лучший Когтевранец, чем "+student1.getName()+" "+student1.getSurname());
        }else{
            System.out.println(student2.getName()+" "+student2.getSurname()+" и " +student1.getName()+" "+student1.getSurname()+ "имеют одинаковое количество баллов");
        }
    }
}
