public class Student {

    private String firstName;
    private String lastName;
    private int studentID;
    private double GPA;

    public Student(String first, String last, int ID, double GPA) {
        this.firstName = first;
        this.lastName = last;
        this.studentID = ID;
        this.GPA = GPA;
    }

    public Student() {
        this.firstName = "David";
        this.lastName = "Amiel";
        this.studentID = 238573;
        this.GPA = 0;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getStudentID() {
        return this.studentID;
    }
    public double getGPA() {
        return this.GPA;
    }
    public void setGPA(int newGPA) {
        this.GPA = newGPA;
    }
    public boolean deansList() {
        return (this.GPA >= 3.5);
    }
    public String toString() {
        return this.firstName + " " + this.lastName + " (" + this.studentID + ")";
    }
    public boolean equals(Student otherStudent) {
        boolean sameFirstName = this.firstName.equals(otherStudent.getFirstName());
        boolean sameLastName = this.lastName.equals(otherStudent.getLastName());
        boolean sameID = this.studentID == otherStudent.getStudentID();
        boolean sameGPA = Double.compare(this.GPA, otherStudent.getGPA()) == 0;
        return sameFirstName && sameLastName && sameID && sameGPA;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Harry", "Potter", 347583, 2.95);
        Student s2 = new Student("Ginny", "Weasley", 347693, 3.95);
        Student[] arr = new Student[5];
        System.out.println("arr[0] = " + arr[0]);
        arr[1] = s1;
        arr[2] = s2;
        arr[3] = new Student("Draco", "Malfoy", 123456, 5.0);
        arr[4] = new Student("Hagrid", "Smith", 0000000, 0.2);
        arr[0] = new Student();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].deansList()) {
                count ++;
            }
        }
        System.out.println("Students on Dean's List: " + count);
    }


    
}
