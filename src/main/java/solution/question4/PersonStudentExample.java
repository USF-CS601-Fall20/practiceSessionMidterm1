package solution.question4;

import question4.Person;
import question4.Student;

/** Solution to question 4 */
public class PersonStudentExample {
    public static void main(String[] args) {
        Person person = new Person("Hanks");
        Person student = new Student("Hanks", 3.9);
        System.out.println(person.equals(student)); // true
        System.out.println(student.equals(person)); // false
        // This implementation breaks symmetry!

    }
}
