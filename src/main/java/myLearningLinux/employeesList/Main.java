package myLearningLinux.employeesList;

import myLearningLinux.employeesList.logic.CreationList;
import myLearningLinux.employeesList.logic.WhoMost;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Employee> arr = CreationList.creation();
        System.out.println(WhoMost.oldest(CreationList.creation()));
    }
}
