package Student;

import java.util.Comparator;

public class SortEng implements CompareStudent, Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return o1.getEng() - o2.getEng();
    }
}
