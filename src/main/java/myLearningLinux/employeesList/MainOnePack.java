package myLearningLinux.employeesList;

import myLearningLinux.employeesList.domain.Employee;

import java.util.ArrayList;
import java.util.List;


public class MainOnePack {
    public static void main(String[] args) {
        List<Employee> arrEmployees = new ArrayList<>();
        arrEmployees.add(new Employee("Ян", "Петров", 160));
        arrEmployees.add(new Employee("Гадя", "Хренова", 1200));
        arrEmployees.add(new Employee("Aадя", "Хренова", 120));
        arrEmployees.add(new Employee("Ган", "Джоу", 20));
        arrEmployees.add(new Employee("Ган", "Джоу", 20));
        arrEmployees.add(new Employee("Ган", "Джоу", 20));
        arrEmployees.add(new Employee("Ван", "Джоу", 20));
        arrEmployees.add(new Employee("Лю", "Зайцева", 360));
        arrEmployees.add(new Employee("Аня", "Сидоров", 180));
        arrEmployees.add(new Employee("Владимир", "Путин", 148));


        MainOnePack mainOnePack = new MainOnePack();
        mainOnePack.sortByLastName(arrEmployees);
        mainOnePack.findOldest(arrEmployees);

        System.out.println(arrEmployees);
        System.out.println(mainOnePack.findOldest(arrEmployees));

    }

    /**
     * Отсортировать сотрудников по фамилии в алфавитном порядке(A-Z)
     */

    public List<Employee> sortByLastName(List<Employee> employees) {
        int a = 0;
        while (a < 1) {
            a = 1;
            int t = 1;
            for (int i = 0; i < employees.size() - 1; i++, t++) {

                int x = compareEmployeesByLastName(employees.get(i), employees.get(t));
                if (x < 0) {
                    Employee temp = employees.get(i);
                    employees.set(i, employees.get(t));
                    employees.set(t, temp);
                    a = 0;
                }

            }
        }
        return employees;


    }

    /**
     * Определяет у какого из сотрудников фамилия выше по алфавиту
     *
     * @param first  первый сотрудник
     * @param second второй сотрудник
     */
    public int compareEmployeesByLastName(Employee first, Employee second) {
        String lastName1 = first.getLastName();
        String lastName2 = second.getLastName();
        int i = compareStrings(lastName1, lastName2);
        if (i == 0) {
            String name1 = first.getFirstName();
            String name2 = second.getFirstName();
            i = compareStrings(name1, name2);
        }
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        return 0;
    }

    /**
     * Метод ставнивает строки лексографически
     *
     * @param a строка 1
     * @param b и соответственно 2
     * @return 0 - равны(s1=s2); Если положительное значение то строка a > b; Если отрицательное то a < b
     */
    public int compareStrings(String a, String b) {
        return b.compareTo(a);
    }


    public Employee findOldest(List<Employee> arrEmployees) {
        int x = 0;
        Employee result = null;

        for (int i = 0; i < arrEmployees.size(); i++) {
            int temp = arrEmployees.get(i).getAge();
            if (x < temp) {
                x = temp;
                result = arrEmployees.get(i);
            }
        }

        return result;
    }
}
