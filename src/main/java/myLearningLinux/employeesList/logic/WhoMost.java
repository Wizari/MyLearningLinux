package myLearningLinux.employeesList.logic;

import myLearningLinux.employeesList.domain.EmployeesDomain;

import java.util.ArrayList;

public class WhoMost {

    public static String oldest(ArrayList<EmployeesDomain> list) {
        int x = 0;
        String result = new String();
        for (int i = 0; i < list.size(); i++) {

            int temp = list.get(i).getAge();
            if (x < temp) {
                x = temp;
                result = list.get(i).toString();
            }
        }
        return result;
    }

}
