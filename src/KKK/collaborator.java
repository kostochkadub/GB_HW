package KKK;

public class collaborator {
    //Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    String secondName;
    String firsName;
    String patronymic;
    String position;
    String email;
    String phoneNumber;
    int theSalary;
    int age;

    public collaborator(String secondName, String firsName, String patronymic, String position, String email, String phoneNumber, int theSalary, int age) {
        this.secondName = secondName;
        this.firsName = firsName;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.theSalary = theSalary;
        this.age = age;
    }

    public void showCollaborator(){
        System.out.println(secondName + ' ' + firsName + ' ' + patronymic + ' ' + position +
                ' ' + email + ' ' + phoneNumber + ' ' + theSalary + ' ' + age);
    }


}
