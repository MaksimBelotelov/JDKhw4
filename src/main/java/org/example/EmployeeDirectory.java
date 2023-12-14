package org.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private List<Employee> list;

    public EmployeeDirectory() {
        this.list = new ArrayList<>();
    }

    public void addNewEmployee(Employee employee) {
        list.add(employee);
    }

    public List<Employee> findEmployeeByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for(Employee item : list) {
            if(item.getExperience() == experience)
                result.add(item);
        }
        return result;
    }

    public Employee findById(int id) {
        for(Employee item : list) {
            if(item.getId() == id)
                return item;
        }
        return null;
    }

    public List<String> findPhoneByName(String name) {
        List<String> result = new ArrayList<>();
        for(Employee item : list) {
            if(item.getName().equals(name))
                result.add(item.getPhone());
        }
        return result;
    }
}
