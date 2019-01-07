
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Department {

    String departmentname;
    List<Student> students = new ArrayList<>();

    List<Student> createStudent() throws IOException, ParseException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            Student student = new Student();
            System.out.println("Enter Student Name");
            while (true) {
                student.studentname = in.readLine();
                if (student.studentname.length() <= 15) {
                    break;
                } else {
                    System.out.println("enter valid studentname:");
                }
            }
            System.out.println("Enter DoB like dd/mm/yyyy");
            String dob;
            dob = in.readLine();
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
            student.dob = date;
            System.out.println("enter Email");
            student.email = in.readLine();
            students.add(student);

        }
        return students;

    }
}
