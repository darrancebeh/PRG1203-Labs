public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 5, "BCS");
        Student student2 = new Student("Mindy", 2, "BIT");

        student1.setName("Johnson");

        student1.checkEligibility();
        student2.checkEligibility();

        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}
