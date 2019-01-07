
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

class College {

    String collegename;
    List<Department> departments = new ArrayList<>();

    public List<Department> createDepartment() throws IOException, ParseException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            Department department = new Department();
            System.out.println("enter Department");
            while (true) {
                department.departmentname = in.readLine();
                if (department.departmentname.length() <= 50) {
                    departments.add(department);
                    department.createStudent();
                    break;
                } else {
                    System.out.println("Enter valid department");
                }

                break;

            }
        }

        return departments;
    }

    public static void main(String as[]) throws IOException, ParseException {
        List<Department> department1 = new ArrayList<>();
        College college = new College();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter College name");
        while (true) {
            college.collegename = in.readLine();

            if (college.collegename.length() <= 50) {
                department1 = college.createDepartment();
                break;
            } else {
                System.out.println("enter valid Collegename:");
            }

        }
    }

}
