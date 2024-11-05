package company;

public class Main {
    public static void main(String[] args) {
        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern abdullah = new Intern("Abdullah", "Marketing", 2000, "Colorado State University");
        Engineer meshal = new Engineer("Meshal", "Engineering", 5000, new String[] {"Java Programming", "MATLAB", "Microprocessor Decoding"});
        Director nora = new Director("Nora", "Human Resources", 50000, 2500000);
        SalesPerson yousef = new SalesPerson("Yousef", "Car Sales", 7500, 35);

        System.out.println(emily);
        System.out.println(john);
        System.out.println(abdullah);
        System.out.println(meshal);
        System.out.println(nora);
        System.out.println(yousef);
    }
}