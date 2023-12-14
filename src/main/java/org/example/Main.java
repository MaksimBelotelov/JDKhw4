package org.example;
/*
    Создать класс справочник сотрудников, который
    содержит внутри коллекцию сотрудников - каждый
    сотрудник должен иметь следующие атрибуты:
    ○ Табельный номер
    ○ Номер телефона
    ○ Имя
    ○ Стаж
    ● Добавить метод, который ищет сотрудника по стажу
    (может быть список)
    ● Добавить метод, который выводит номер телефона
    сотрудника по имени (может быть список)
    ● Добавить метод, который ищет сотрудника по
    табельному номеру
    ● Добавить метод добавление нового сотрудника в
    справочник
*/
public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();
        directory.addNewEmployee(new Employee(3, "Ivan Ivanov", "+79001112233", 2));
        directory.addNewEmployee(new Employee(2, "Petrova Petra", "+79012222233", 3));
        directory.addNewEmployee(new Employee(4, "Sidorova Seda", "+79003332244", 1));
        directory.addNewEmployee(new Employee(1, "Kyznetsvov Aleksey", "+79004442244", 4));
        directory.addNewEmployee(new Employee(5, "Bubnov Aleksandr", "+79005552244", 1));

        System.out.println(directory.findEmployeeByExperience(1));
        System.out.println(directory.findPhoneByName("Sidorova Seda"));
        System.out.println(directory.findById(1));
    }
}