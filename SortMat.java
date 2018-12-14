package Student;

import java.util.Comparator;

public class SortMat implements CompareStudent, Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return o1.getMat() - o2.getMat();
    }
}

