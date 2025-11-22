package _25427.q2;

class Student extends School {
    private String studentName;
    private int rollNumber;
    private String grade;
    private String contactNumber;

    public Student(int id, String createdDate, String updatedDate, String schoolName,
                   String address, String phoneNumber, String email, String studentName,
                   int rollNumber, String grade, String contactNumber) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);
        if (studentName == null || studentName.trim().isEmpty()) throw new SchoolDataException("Student name required");
        if (rollNumber <= 0) throw new SchoolDataException("Roll number must be > 0");
        if (grade == null || grade.trim().isEmpty()) throw new SchoolDataException("Grade required");
        if (!contactNumber.matches("\\d{10}")) throw new SchoolDataException("Contact number must be 10 digits");
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.contactNumber = contactNumber;
    }

    public String getStudentName() { return studentName; }
    public int getRollNumber() { return rollNumber; }
    public String getGrade() { return grade; }
}
