package Lesson_4;
/*
Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 */
public class Employee {
    private String Name;
    private String Position;
    private String Email;
    private String PhoneNumber;
    private int Salary;
    public int Age;

    public Employee(String Name, String Position, String Email, String PhoneNumber, int Salary, int Age) {
        this.Name = Name;
        this.Position = Position;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Salary = Salary;
        this.Age = Age;
    }

    public void displayInformation() {
        System.out.println("Name: " + this.Name);
        System.out.println("Position: " + this.Position);
        System.out.println("Email: " + this.Email);
        System.out.println("PhoneNumber: " + this.PhoneNumber);
        System.out.println("Salary: " + this.Salary);
        System.out.println("Age: " + this.Age);
    }
}