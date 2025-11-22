package _25427.q2;

class Course extends Student {
    private String courseName;
    private String courseCode;
    private int creditHours;

    public Course(int id, String createdDate, String updatedDate, String schoolName,
                  String address, String phoneNumber, String email, String studentName,
                  int rollNumber, String grade, String contactNumber, String courseName,
                  String courseCode, int creditHours) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                studentName, rollNumber, grade, contactNumber);
        if (courseName == null || courseName.trim().isEmpty()) throw new SchoolDataException("Course name required");
        if (courseCode == null || courseCode.trim().isEmpty()) throw new SchoolDataException("Course code required");
        if (creditHours <= 0) throw new SchoolDataException("Credit hours must be > 0");
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
    }

    public String getCourseName() { return courseName; }
    public String getCourseCode() { return courseCode; }
    public int getCreditHours() { return creditHours; }
}
