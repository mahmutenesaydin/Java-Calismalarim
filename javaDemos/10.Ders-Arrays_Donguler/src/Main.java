import java.util.Optional;

public class Main {

    public static void main(String[] args)
    {
        String student1 = "Mahmut";
        String student2 = "Enes";
        String student3 = "Aydın";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("-------------");


        String[] _students = new String[3];
        _students[0] = "Cenk";
        _students[1] = "Rachid";
        _students[2] = "Mesut";

        for (int i=0; i<_students.length;i++)
        {
            System.out.println(_students[i]);
        }

        System.out.println("-----------------");

        for (String _student:_students)
        {
            System.out.println(_student);
        }
    }
}
