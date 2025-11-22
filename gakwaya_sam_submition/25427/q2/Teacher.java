package _25427.q2;

class Teacher extends Department {
    private String teacherName;
    private String subject;
    private String teacherEmail;
    private String phone;

    public Teacher(int id, String createdDate, String updatedDate, String schoolName,
                   String address, String phoneNumber, String email, String departmentName,
                   String departmentCode, String teacherName, String subject,
                   String teacherEmail, String phone) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode);
        if (teacherName == null || teacherName.trim().isEmpty()) throw new SchoolDataException("Teacher name required");
        if (subject == null || subject.trim().isEmpty()) throw new SchoolDataException("Subject required");
        if (!teacherEmail.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) throw new SchoolDataException("Invalid teacher email");
        if (!phone.matches("\\d{10}")) throw new SchoolDataException("Teacher phone must be 10 digits");
        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherEmail = teacherEmail;
        this.phone = phone;
    }

    public String getTeacherName() { return teacherName; }
    public String getSubject() { return subject; }
}
