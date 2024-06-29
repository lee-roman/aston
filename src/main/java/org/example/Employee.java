package org.example;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;


    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        // Создаем массив объектов Employee
        Employee[] employees = new Employee[5];

        // Заполняем массив сотрудниками
        employees[0] = new Employee("Иванов Иван Иванович", "Инженер", "ivanov@mail.com", "+7-999-123-45-67", 75000.0, 35);
        employees[1] = new Employee("Петров Петр Петрович", "Программист", "petrov@mail.com", "+7-999-987-65-43", 90000.0, 28);
        employees[2] = new Employee("Сидоров Алексей Васильевич", "Техник", "sidorov@mail.com", "+7-999-456-78-90", 60000.0, 40);
        employees[3] = new Employee("Козлова Ольга Петровна", "Аналитик", "kozlova@mail.com", "+7-999-234-56-78", 80000.0, 32);
        employees[4] = new Employee("Николаева Екатерина Игоревна", "Менеджер", "nikolaeva@mail.com", "+7-999-876-54-32", 70000.0, 29);

        // Выводим информацию о сотрудниках из массива
        for (int i = 0; i < employees.length; i++) {
            employees[i].printInfo();
        }
    }
}
