public class Student1 {

    String name;
    int age;
    private int marks;

    // Constructor
    Student1(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Marks : " + marks);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Creating 2 student objects
        Student1 s1 = new Student1("Aman", 18, 85);
        Student1 s2 = new Student1("Rahul", 19, 92);

        // Displaying details
        s1.displayDetails();
        s2.displayDetails();
    }
}