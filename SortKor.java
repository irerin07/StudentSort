package Student;

import java.util.Comparator;

public class SortKor implements CompareStudent, Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return o1.getKor() - o2.getKor();
    }
}
