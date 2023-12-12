public class Course {
    private Integer courseId;
    private Integer courseDurationInMonth;
    private String courseName;

    public Course(Integer courseId, Integer courseDurationInMonth, String courseName) {
        this.courseId = courseId;
        this.courseDurationInMonth = courseDurationInMonth;
        this.courseName = courseName;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getCourseDurationInMonth() {
        return courseDurationInMonth;
    }

    public void setCourseDurationInMonth(Integer courseDurationInMonth) {
        this.courseDurationInMonth = courseDurationInMonth;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseDurationInMonth=" + courseDurationInMonth +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
