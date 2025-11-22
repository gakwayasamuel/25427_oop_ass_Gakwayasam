package _25427.q2;

class Exam extends Course {
    private String examName;
    private double maxMarks;
    private String examDate;

    public Exam(int id, String createdDate, String updatedDate, String schoolName,
                String address, String phoneNumber, String email, String studentName,
                int rollNumber, String grade, String contactNumber, String courseName,
                String courseCode, int creditHours, String examName,
                double maxMarks, String examDate) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours);
        if (examName == null || examName.trim().isEmpty()) throw new SchoolDataException("Exam name required");
        if (maxMarks <= 0) throw new SchoolDataException("Max marks must be > 0");
        if (examDate == null || examDate.trim().isEmpty()) throw new SchoolDataException("Exam date required");
        this.examName = examName;
        this.maxMarks = maxMarks;
        this.examDate = examDate;
    }

    public double getMaxMarks() { return maxMarks; }
    public String getExamName() { return examName; }
    public String getExamDate() { return examDate; }
}
