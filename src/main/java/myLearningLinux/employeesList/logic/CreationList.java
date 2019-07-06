package myLearningLinux.employeesList.logic;

import myLearningLinux.employeesList.domain.Employee;

import java.util.ArrayList;

public class CreationList {
//    ArrayList<Employee> arrEmplooyees
    public static ArrayList creation() {
        ArrayList<Employee> arrEmployees = new ArrayList();
        arrEmployees.add(new Employee("F", "L", 160));
        arrEmployees.add(new Employee("QQ", "QQQ", 180));
        arrEmployees.add(new Employee("RR", "RRR", 120));
        arrEmployees.add(new Employee("YY", "YYY", 10));
        arrEmployees.add(new Employee("ZZ", "ZZZ", 360));
        arrEmployees.add(new Employee("XX", "XXX", 10));
        return arrEmployees;

    }
}
