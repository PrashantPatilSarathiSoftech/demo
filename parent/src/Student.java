public class Student {
    private Integer roll_number;
    private String name;
    private Integer marks;

    public Student(Integer roll_number, String name, Integer marks) {
        this.roll_number = roll_number;
        this.name = name;
        this.marks = marks;
    }

    public Integer getRoll_number() {
        return roll_number;
    }

    public String getName() {
        return name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setRoll_number(Integer roll_number) {
        this.roll_number = roll_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "Student{" +
                "roll_number=" + roll_number +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
