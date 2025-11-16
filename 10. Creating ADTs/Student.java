public class Student {

	// NOT GOOD! (name should NOT be static!)
    private static String name;
    private int studentID;
    
    public Student(String studentName, int studentID) {
        name = studentName;
        this.studentID = studentID;
    }
    
    public String getName() {
        return name;
    }

    public String toString() {
        return "Student Name: " + name + "\nStudent ID: " + studentID;
    }
    
    public static void main(String[] args) {
			Student student1 = new Student("Alice", 12345);
			Student student2 = new Student("Bob", 67890);
        System.out.println(student1);
        System.out.println(student2);
    }
}
