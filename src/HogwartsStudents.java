public class HogwartsStudents {
    private String name;
    private String surname;
    private int magic;
    private int moving;
    public HogwartsStudents(String name, String surname, int magic, int moving) {
        this.name=name;
        this.surname=surname;
        this.magic=magic;
        this.moving=moving;
    }



    public String getName() {
        return this.name;
    }
    public void setName( String getName) {
        this.name=name;
    }
    public String getSurname (){
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMagic(){
        return this.magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }
    public int getMoving (){
        return this.moving;
    }

    public void setMoving(int moving) {
        this.moving = moving;
    }

    @Override
    public String toString() {
        return "HogwartsStudents name=" + name + " " + ", surname=" + surname + " " + ", magic=" + magic + ", moving=" + moving ;
    }
    public int ability (){
        return getMagic()+getMoving();
    }
    public static void  bestStudentHogwarts (HogwartsStudents student1,HogwartsStudents student2){
        if (student1.ability()>student2.ability()){
            System.out.println( student1.getName()+" "+student1.getSurname()+" обладает бОльшей мощностью магии, чем  "+student2.getName()+" "+student2.getSurname());
        }else if(student1.ability()<student2.ability()){
            System.out.println(student2.getName()+" "+student2.getSurname()+" обладает бОльшей мощностью магии, чем  "+student1.getName()+" "+student1.getSurname());
        }else{
            System.out.println(student2.getName()+" "+student2.getSurname()+ " и " +student1.getName()+" "+student1.getSurname() + "имеют одинаковое количество баллов");
        }
    }
    public void printStudent(){
        System.out.println(this.toString());
    }

}
