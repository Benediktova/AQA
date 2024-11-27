/*
Написать программу(-ы), позволяющую(-ие) выполнить следуюющее:

1. Для любого набора случайно-сгенерированных чисел нужно определить количество чётных чисел.

2. Задана коллекция, состоящая из строк: «Highload», «High», «Load», «Highload». Нужно с ней выполнить следующие манипуляции:
2.1. Посчитать, сколько раз объект «High» встречается в коллекции;
2.2. Определить, какой элемент в коллекции находится на первом месте. Если мы получили пустую коллекцию, то пусть возвращается 0;
2.3. Необходимо вернуть последний элемент, если получили пустую коллекцию, то пусть возвращается 0;

3. Задана коллекция, содержащая элементы "f10", "f15", "f2", "f4", "f4". Необходимо отсортировать строки по возрастанию и добавить их в массив;

4. Создай класс со следующим содержимым:
4.1. Необходимо узнать средний возраст студентов мужского пола;
4.2. Кому из студентов грозит получение повестки в этом году при условии, что призывной возраст установлен в диапазоне от 18 до 27 лет;

5. Нужно написать программу, которая будет принимать от пользователя ввод различных логинов.
Как только пользователь введет пустую строку - программа должна прекратить приём данных от пользователя и вывести в консоль логины, начинающиеся на букву f (строчную).
*/

import java.util.*;

      public class Lesson_9 {
//ЗАДАНИЕ 1:
          public static int countEvenNumbers(int[] numbers) {
            int count = 0;
            for (int number : numbers) {
                if (number % 2 == 0) {
                    count++;
                }
            }
            return count;
        }
//ЗАДАНИЕ 2:
        public static void collectionManipulations() {
            List<String> collection = Arrays.asList("Highload", "High", "Load", "Highload");

            int countHigh = Collections.frequency(collection, "High");
            System.out.println("Cколько раз объект «High» встречается в коллекции: " + countHigh);

            String firstElement = collection.isEmpty() ? "0" : collection.get(0);
            System.out.println("Какой элемент в коллекции находится на первом месте: " + firstElement);

            String lastElement = collection.isEmpty() ? "0" : collection.get(collection.size() - 1);
            System.out.println("Какой элемент в коллекции находится на последнем месте: " + lastElement);
        }

//ЗАДАНИЕ 3:
        public static String[] sortAndAddToArray() {
            List<String> items = Arrays.asList("f10", "f15", "f2", "f4", "f4");
            Collections.sort(items);
            return items.toArray(new String[0]);
        }

// ЗАДАНИЕ 4:
          private enum Gender {
              MAN,
              WOMAN
          }
          private static class Student {
                  private final String name;
                  private final Integer age;
                  private final Gender gender;

              public Student(String name, int age, Gender gender) {
                      this.name = name;
                      this.age = age;
                      this.gender = gender;
                  }

                  public String getName() {
                      return name;
                  }

                  public int getAge() {
                      return age;
                  }

                  public Gender getGender() {
                      return gender;
                  }

                  @Override
                  public String toString() {
                      return "{" +
                              "name='" + name + '\'' +
                              ", age=" + age +
                              ", gender=" + gender +
                              '}';
                  }

                  @Override
                  public boolean equals(Object o) {
                      if (this == o) return true;
                      if (!(o instanceof Student)) return false;
                      Student student = (Student) o;
                      return Objects.equals(name, student.name) &&
                              Objects.equals(age, student.age) &&
                              gender == student.gender;
                  }

                  @Override
                  public int hashCode() {
                      return Objects.hash(name, age, gender);
                  }
              }

              public static void studentManipulations() {
                  Student[] students = {
                          new Student("Дмитрий", 17, Gender.MAN),
                          new Student("Максим", 20, Gender.MAN),
                          new Student("Екатерина", 20, Gender.WOMAN),
                          new Student("Михаил", 28, Gender.MAN)
                  };

                  int averageAge = (int) Arrays.stream(students)
                          .filter(student -> student.getGender() == Gender.MAN)
                          .mapToInt(Student::getAge)
                          .average()
                          .orElse(0);

                  System.out.println("Средний возраст студентов мужского пола: " + averageAge);

                  int minAgeLimit = 18;
                  int maxAgeLimit = 27;

                  System.out.println("Студенты, которым грозит получение повестки:");
                  for (Student student : students) {
                      if (student.getGender() == Gender.MAN &&
                              student.getAge() >= minAgeLimit &&
                              student.getAge() <= maxAgeLimit) {
                          System.out.println(student);
                      }
                  }
              }
//ЗАДАНИЕ 5:
        public static void collectLogins() {
            Scanner scanner = new Scanner(System.in);
            List<String> logins = new ArrayList<>();
            System.out.println("Введение логинов (пустая строка для завершения):");

            while (true) {
                String input = scanner.nextLine();
                if (input.isEmpty()) break;
                logins.add(input);
            }

            System.out.println("Логины, начинающиеся на букву f:");
            logins.stream()
                    .filter(login -> login.startsWith("f"))
                    .forEach(System.out::println);
        }


        public static void main(String[] args) {

            System.out.println("Количество чётных чисел: " + countEvenNumbers(new int[]{1, 2, 3, 4, 5, 6}));

            collectionManipulations();

            String[] sortedArray = sortAndAddToArray();
            System.out.println("Сортировка массива: " + Arrays.toString(sortedArray));

           studentManipulations();

            collectLogins();
        }
      }
