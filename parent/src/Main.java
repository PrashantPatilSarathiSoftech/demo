public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student student=new Student(1,"prashant", 40);
        System.out.println(student);
        System.out.println("\n\n\n\n");
        Course course = new Course(1, 3, "full stack");
        System.out.println(course);
        Trainer trainer=new Trainer(1, "raghav");
        System.out.println(trainer);


    }
}