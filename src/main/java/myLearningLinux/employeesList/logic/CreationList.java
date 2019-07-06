package myLearningLinux.employeesList.logic;

import myLearningLinux.employeesList.domain.EmployeesDomain;

import java.util.ArrayList;

public class CreationList {
//    ArrayList<EmployeesDomain> arrEmplooyees
    public static ArrayList creation() {
        ArrayList<EmployeesDomain> arrEmplooyees = new ArrayList();
        arrEmplooyees.add(new EmployeesDomain("F", "L", 160));
        arrEmplooyees.add(new EmployeesDomain("QQ", "QQQ", 180));
        arrEmplooyees.add(new EmployeesDomain("RR", "RRR", 120));
        arrEmplooyees.add(new EmployeesDomain("YY", "YYY", 10));
        arrEmplooyees.add(new EmployeesDomain("ZZ", "ZZZ", 360));
        arrEmplooyees.add(new EmployeesDomain("XX", "XXX", 10));
        return arrEmplooyees;

    }
}
