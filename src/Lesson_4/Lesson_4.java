/*Создать массив из 5 сотрудников.
Пример:
// вначале объявляем массив объектов
Person[] persArray = new Person[5];
// потом для каждой ячейки массива задаем объект
persArray[0] = new Person("Ivanov Ivan", "Engineer",
               "ivivan@mailbox.com", "892312312", 30000, 30);
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
*/
package Lesson_4;

public class Lesson_4 {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Belyakova TO", "QA", "Belyakova@gmail.com", "+79541214568", 100000, 40);
        employeesArray[1] = new Employee("Ivanov EL", "QC", "Ivanov@gmail.com", "+79216547896", 110000, 39);
        employeesArray[2] = new Employee("Petrov PT", "TO", "Petrov@gmail.com", "+79541236574", 120000, 45);
        employeesArray[3] = new Employee("Sidorov IA", "BA", "Sidorov@gmail.com", "+7954748596", 130000, 56);
        employeesArray[4] = new Employee("Stepanova AC", "Dev", "Stepanova@gmail.com", "+79201247586", 140000, 27);

              for (Employee employee : employeesArray) {
                if (employee.Age > 40) {
                    employee.displayInformation();
                }
            }
        }
}
