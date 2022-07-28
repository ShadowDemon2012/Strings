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
    }
}