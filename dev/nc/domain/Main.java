package dev.nc.domain;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(20003, "Deniss", 2020),
                new Employee(20005, "Andre", 2016),
                new Employee(20031, "Anna", 2013),
                new Employee(23185, "Heisi", 2022),
                new Employee(30080, "Indrek", 2012) ));
        employees.sort(new Employee.EmployeeComparator<>("yearStarted"));
        for (Employee e : employees) {
            System.out.println(e);
        }

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Ekaterina", 2019, "Lidl"),
                new StoreEmployee(10515, "Uno", 2021, "Maxima"),
                new StoreEmployee(10105, "Marek", 2020,
                        "Rimi"),
                new StoreEmployee(10215, "Marko", 2018, "Maxima"),
                new StoreEmployee(10322, "Aleksander", 2016, "Lidl")));
        var genericEmployee = new StoreEmployee();
        var comparator = genericEmployee.new StoreComparator<>();
        storeEmployees.sort(comparator);
        for (StoreEmployee e : storeEmployees) {
            System.out.println(e);
        }

        addPigLatinName(storeEmployees);

    }
    public static void addPigLatinName(List<? extends StoreEmployee> list) {
        String lastName = "Piggy";
        class DecoratedEmployee extends StoreEmployee implements Comparable<DecoratedEmployee>  {
            private String pigLatinName;
            private Employee originalInstance;
            public DecoratedEmployee(String pigLatinName, Employee originalInstance) {
                this.pigLatinName = pigLatinName + " " + lastName;
                this.originalInstance = originalInstance;
            }
            @Override
            public String toString() {
                return originalInstance.toString() + " " + pigLatinName;
            }
            @Override
            public int compareTo(DecoratedEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }
        }

        List<DecoratedEmployee> newList = new ArrayList<>(list.size());
        for (var employee : list) {
            String name = employee.getName();
            String pigLatin = name.substring(1) + name.charAt(0) + "ay";
            newList.add(new DecoratedEmployee(pigLatin, employee));
            newList.sort(null);
        }
        for (var dEmployee : newList) {
            System.out.println(dEmployee.originalInstance.getName() + " " + dEmployee.pigLatinName);
        }

    }

}
