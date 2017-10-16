package ACO;

/**
 * Created by serhii on 03.09.17.
 */
public class StudentGroup {

    public static void main(String[] args) {
        testStudents();
        testGroup();
    }

    private static void testGroup() {
        testAddStudent();
        testFindStudent();
        testShowAll();
    }

    private static void testStudents() {
        ACO.Student student = new ACO.Student();
        student.name = "Ivan";
        student.age = 25;

        System.out.printf("testStudent %s\n", student.name.equals("Ivan") && student.age == 25);
    }

    private static void testShowAll() {
        ACO.Group group = new ACO.Group();

        ACO.Student student = new ACO.Student();
        student.init("Ivan", 23);
        ACO.Student student1 = new ACO.Student();
        student1.init("Kolia",30);

        group.addStudent(student);
        group.addStudent(student1);

        group.showAll();
    }

    private static void testFindStudent() {
        ACO.Group group = new ACO.Group();
        group.addStudent(new ACO.Student());
        ACO.Student found = group.findStudent("Ivan");

        System.out.printf("testFindStudent %s\n", found == null);
    }

    private static void testAddStudent() {
        ACO.Group group = new ACO.Group();
        ACO.Student student = new ACO.Student();
        student.init("Ivan" ,23);
        group.addStudent(student);


        System.out.printf("testAddStudent %s\n", group.getSize() == 1 && group.getStudentsList()[0] == student);
        //group.addStudent(new Student().init("Ivan" ,23));
    }
}
