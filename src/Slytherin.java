public class Slytherin extends HogwartsStudents {
    private  int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;
    public Slytherin ( String name, String surname, int magic, int moving,int cunning,int determination,int ambition,int resourcefulness,int lustForPower) {
        super( name,surname,magic,moving);
        this.cunning=cunning;
        this.determination=determination;
        this.ambition=ambition;
        this.resourcefulness=resourcefulness;
        this.lustForPower=lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    public int sumS(){
        return super.ability()+getCunning()+getDetermination()+getAmbition()+getResourcefulness()+getLustForPower();
    }

    @Override
    public String toString() {
        return  super.toString()+", " + "cunning=" + cunning + ", determination=" + determination + ", ambition=" + ambition + ", resourcefulness=" + resourcefulness + ", lustForPower=" + lustForPower;
    }

    public static void  bestSlytherin (Slytherin student1,Slytherin student2){
        if (student1.sumS()>student2.sumS()){
            System.out.println( student1.getName()+" "+student1.getSurname()+" лучший Слизеринец, чем "+student2.getName()+" "+student2.getSurname());
        }else if(student1.sumS()<student2.sumS()){
            System.out.println(student2.getName()+" "+student2.getSurname()+" лучший Слизеринец, чем "+ student1.getName()+" "+student1.getSurname());
        }else{
            System.out.println(student2.getName()+" "+student2.getSurname()+ " и " + student1.getName()+" "+student1.getSurname()+ "имеют одинаковое количество баллов");
        }
    }
}
