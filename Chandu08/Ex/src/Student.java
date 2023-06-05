import java.util.HashSet;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return age; // only using age for hashcode
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age;
    }

    public static void main(String[] args) {
        HashSet<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Alice", 21));
        studentSet.add(new Student("Bob", 22));
        studentSet.add(new Student("Charlie", 23));

        int ageToCheck = 22;
        boolean containsAge = false;

        for (Student student : studentSet) {
            if (student.getAge() == ageToCheck) {
                containsAge = true;
                break;
            }
        }

        System.out.println("The set contains age " + ageToCheck + ": " + containsAge);
    }
}
