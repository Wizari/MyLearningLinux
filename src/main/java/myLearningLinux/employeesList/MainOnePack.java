package myLearningLinux.employeesList;

import myLearningLinux.employeesList.domain.Employee;

import java.util.ArrayList;

public class MainOnePack {
    public static void main(String[] args) {
        ArrayList<Employee> arrEmployees = new ArrayList();
        arrEmployees.add(new Employee("F", "L", 160));
        arrEmployees.add(new Employee("QQ", "QQQ", 180));
        arrEmployees.add(new Employee("RR", "RRR", 120));
        arrEmployees.add(new Employee("YY", "YYY", 10));
        arrEmployees.add(new Employee("ZZ", "ZZZ", 360));
        arrEmployees.add(new Employee("XX", "XXX", 10));


        int x = 0;
        String result = new String();
        for (int i = 0; i < arrEmployees.size(); i++) {

            int temp = arrEmployees.get(i).getAge();
            if (x < temp) {
                x = temp;
                result = arrEmployees.get(i).toString();
            }
        }

        System.out.println(result);

    }
}
