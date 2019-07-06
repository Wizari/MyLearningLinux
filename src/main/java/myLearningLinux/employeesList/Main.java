package myLearningLinux.employeesList;

import myLearningLinux.employeesList.domain.EmployeesDomain;
import myLearningLinux.employeesList.logic.CreationList;
import myLearningLinux.employeesList.logic.WhoMost;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<EmployeesDomain> arr = CreationList.creation();
        System.out.println(WhoMost.oldest(CreationList.creation()));
    }
}
