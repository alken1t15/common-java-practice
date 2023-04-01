package lamda;

import java.util.ArrayList;

public class Test {

}

class  Student{
    int age;
    int weight;
    String name;
    int course;
    char pol;
    Student(String name, int age, int weight, int course, char pol){
         this.age =age;
         this.weight =weight;
        this.name =name;
         this.course =course;
        this.pol =pol;
    }
}

class StudentInfo{
   void printStudent(Student st){
       System.out.printf("Имя студента : %s его вес %d, его возраст %d, его курс %d, его пол %s\n",st.name,st.weight,st.age,st.course,st.pol);
   }

   void printStudentsOverGrade(ArrayList<Student> al, int age){
       for(Student s : al){
           if(s.age > age){
               printStudent(s);
           }
       }
   }


    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student("Максим", 24, 90, 2, 'м');
        Student student1 = new Student("Алина", 20, 120, 1, 'ж');
        Student student2 = new Student("Дамир", 18, 70, 3, 'м');
        Student student3 = new Student("Андрей", 34, 40, 2, 'м');
        Student student4 = new Student("Даня", 17, 50, 4, 'м');
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.printStudentsOverGrade(students, 20);
    }
}


