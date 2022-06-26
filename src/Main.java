public class Main {
    public static void main(String[] args) {

        GryffindorStudents harry = new GryffindorStudents("Гарри", "Поттер", 11, 12, 13, 14, 15);
        GryffindorStudents hermione = new GryffindorStudents("Гермиона", "Грейнджер", 16, 17, 18, 19, 20);
        GryffindorStudents ron = new GryffindorStudents("Рон", "Уизли", 21, 22, 23, 24, 25);
        SlytherinStudents draco = new SlytherinStudents("Драко", "Малфой", 26, 27, 28, 29, 30, 31, 32);
        SlytherinStudents graham = new SlytherinStudents("Грэхэм", "Монтегю", 33, 34, 35, 36, 37, 38, 39);
        SlytherinStudents gregory = new SlytherinStudents("Грегори", "Гойл", 40, 41, 42, 43, 44, 45, 46);
        HufflepuffStudents zechariah = new HufflepuffStudents("Захария", "Смит", 47, 48, 49, 50, 51);
        HufflepuffStudents cedric = new HufflepuffStudents("Седрик", " Дигори", 52, 53, 54, 55, 56);
        HufflepuffStudents justin = new HufflepuffStudents("Джастин", "Финч-Флетчли", 57, 58, 59, 60, 61);
        RavenclawStudents zhou = new RavenclawStudents("Чжоу", "Чанг", 62, 63, 64, 65, 66, 67);
        RavenclawStudents padma = new RavenclawStudents("Падма", "Патил", 68, 69, 70, 71, 72, 73);
        RavenclawStudents marcus = new RavenclawStudents("Маркус", "Белби", 74, 75, 76, 77, 78, 79);

    GryffindorStudents.bestGryffindor(harry, hermione);
    SlytherinStudents.bestSlytherin(draco,graham);
    RavenclawStudents.bestRavenclaw(zhou,marcus);
    HufflepuffStudents.bestHufflepuff(zechariah, justin);
    HogwartsStudents.bestStudentHogwarts(padma,cedric);

        System.out.println(ron);
        System.out.println(padma);
        gregory.printStudent();







    }
}










