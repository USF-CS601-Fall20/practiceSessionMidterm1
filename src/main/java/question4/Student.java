package question4;

public class Student extends Person {
    private double gpa;

    public Student(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + gpa;
    }

    @Override
    public boolean equals(Object other) {
        if (! (other instanceof Student)) {
            //System.out.println("~~~, other istanceof ");
            return false;
        }
        double eps = Math.abs(((Student)other).gpa - this.gpa);
        return super.equals(other) && eps < 0.0001;
    }

}