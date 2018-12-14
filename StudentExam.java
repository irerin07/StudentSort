package Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentExam {
    public static void main(String[] args) {
        Student s1 = new Student("가", 100,100,100);
        Student s2 = new Student("나", 80,57,68);
        Student s3 = new Student("다", 45,38,100);
        Student s4 = new Student("라", 70,83,68);
        Student s5 = new Student("마", 40,75,27);
        Student s6 = new Student("바", 56,93,6);

        List<Student> studentList = new ArrayList<>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);

        System.out.println("\n---------------국어성적순 정렬---------------\n");
        //sort(List<T> list, Comparator<? super T> c)
        //주어진 Comparator를 사용하여 정렬
        //국어 성적순으로 정렬을 한다.
        Collections.sort(studentList, new SortKor());
        for(Student korS : studentList){
            System.out.println(korS);
        }

        System.out.println("\n---------------영어성적순 정렬---------------\n");
        //주어진 Comparator를 사용하여 정렬
        //영어 성적순으로 정렬을 한다.
        Collections.sort(studentList, new SortEng());
        for(Student EngS : studentList){
            System.out.println(EngS);
        }

        System.out.println("\n---------------수학성적순 정렬---------------\n");
        //주어진 Comparator를 사용하여 정렬
        //수학 성적순으로 정렬을 한다.
        Collections.sort(studentList, new SortMat());
        for(Student MatS : studentList){
            System.out.println(MatS);
        }

        System.out.println("\n---------------이름순 정렬---------------\n");
        //sort(List<T> list)
        //이름순으로 정렬.
        Collections.sort(studentList);
        for(Student name : studentList){
            System.out.println(name);
        }

    }
}
