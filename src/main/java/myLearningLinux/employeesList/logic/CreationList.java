package myLearningLinux.employeesList.logic;

import myLearningLinux.employeesList.domain.EmployeesDomain;

import java.util.ArrayList;

public class CreationList {
//    ArrayList<EmployeesDomain> arrEmplooyees
    public static ArrayList creation() {
        ArrayList<EmployeesDomain> arrEmployees = new ArrayList();
        arrEmployees.add(new EmployeesDomain("F", "L", 160));
        arrEmployees.add(new EmployeesDomain("QQ", "QQQ", 180));
        arrEmployees.add(new EmployeesDomain("RR", "RRR", 120));
        arrEmployees.add(new EmployeesDomain("YY", "YYY", 10));
        arrEmployees.add(new EmployeesDomain("ZZ", "ZZZ", 360));
        arrEmployees.add(new EmployeesDomain("XX", "XXX", 10));
        return arrEmployees;

    }
}
