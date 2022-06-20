public class Main {
    public static void main(String[] args) {

        Gryffindor Harry = new Gryffindor("Гарри", "Поттер", 11, 12, 13, 14, 15);
        Gryffindor Hermione = new Gryffindor("Гермиона", "Грейнджер", 16, 17, 18, 19, 20);
        Gryffindor Ron = new Gryffindor("Рон", "Уизли", 21, 22, 23, 24, 25);
        Slytherin Draco = new Slytherin("Драко", "Малфой", 26, 27, 28, 29, 30, 31, 32);
        Slytherin Graham = new Slytherin("Грэхэм", "Монтегю", 33, 34, 35, 36, 37, 38, 39);
        Slytherin Gregory = new Slytherin("Грегори", "Гойл", 40, 41, 42, 43, 44, 45, 46);
        Hufflepuff Zechariah = new Hufflepuff("Захария", "Смит", 47, 48, 49, 50, 51);
        Hufflepuff Cedric = new Hufflepuff("Седрик", " Дигори", 52, 53, 54, 55, 56);
        Hufflepuff Justin = new Hufflepuff("Джастин", "Финч-Флетчли", 57, 58, 59, 60, 61);
        Ravenclaw Zhou = new Ravenclaw("Чжоу", "Чанг", 62, 63, 64, 65, 66, 67);
        Ravenclaw Padma = new Ravenclaw("Падма", "Патил", 68, 69, 70, 71, 72, 73);
        Ravenclaw Marcus = new Ravenclaw("Маркус", "Белби", 74, 75, 76, 77, 78, 79);

    bestGryffindor(Harry, Hermione);
    Slytherin.bestSlytherin(Draco,Graham);
    Ravenclaw.bestRavenclaw(Zhou,Marcus);
    Hufflepuff.bestHufflepuff(Zechariah, Justin);
    HogwartsStudents.bestStudentHogwarts(Padma,Cedric);

        System.out.println(Ron);



}

    private static void  bestGryffindor (Gryffindor student1,Gryffindor student2){
        if (student1.sumG()>student2.sumG()){
            System.out.println( student1.getName()+" "+student1.getSurname()+" лучший Гриффиндорец, чем "+student2.getName()+" "+student2.getSurname());
        }else if(student1.sumG()<student2.sumG()){
            System.out.println(student2.getName()+" "+student2.getSurname()+" лучший Гриффиндорец, чем "+student1.getName()+" "+student1.getSurname());
        }else{
            System.out.println(student2.getName()+" "+student2.getSurname()+" лучший Гриффиндорец, чем" +student1.getName()+" "+student1.getSurname() + "имеют одинаковое количество баллов");
        }
        }
    }










