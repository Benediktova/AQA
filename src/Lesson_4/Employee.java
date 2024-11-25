/*
Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 */

package Lesson_4;
public class Employee {
    private String Name;
    private String Position;
    private String Email;
    private String PhoneNumber;
    private Integer Salary;
    Integer Age;

    public Employee(String Name, String Position, String Email, String PhoneNumber, Integer Salary, Integer Age) {
        this.Name = Name;
        this.Position = Position;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Salary = Salary;
        this.Age = Age;
    }
    public void displayInformation () {
        System.out.println("Name: " + Name);
        System.out.println("Position: " + Position);
        System.out.println("Email: " + Email);
        System.out.println("PhoneNumber: " + PhoneNumber);
        System.out.println("Salary: " + Salary);
        System.out.println("Age: " + Age);
    }
}
