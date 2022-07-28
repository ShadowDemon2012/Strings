public class Main {
    public static void main(String[] args) {
//        Задание 1
        String firstName = "Семён";
        String secondName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + secondName;
        System.out.println("ФИО сотрудника — " + fullName);
//        Задание 2
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);
//        Задание 3
        String fullNameReplace = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullNameReplace);
//      Задание 4
        String removingSpace = fullName.trim();
        int firstSpace = removingSpace.indexOf(' ');
        int check = removingSpace.lastIndexOf(' ');
        String lastNameExtraction = removingSpace.substring(0, firstSpace);
        System.out.println("Фамилия " + lastNameExtraction);
        String firstNameExtraction = removingSpace.substring(firstSpace, check);
        System.out.println("Имя " + firstNameExtraction);
        String secondNameExtraction = removingSpace.substring(check, removingSpace.length());
        System.out.println("Отчество " + secondNameExtraction);
    }
}