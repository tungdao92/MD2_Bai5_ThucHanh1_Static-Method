public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Chinh");
        Student s2 = new Student(222, "Toàn");
        Student s3 = new Student(333, "Dũng");
        s1.display();
        s2.display();
        s3.display();
    }
}
