public class Main {
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Ahnaf Hossain", 24573702, 150000);
        Employee employee2 = new Employee();
        employee2.setName("Sakib Al Hasan");
        employee2.setId(24573703);
        employee2.setMonthlySalary(200000);

        System.out.println("Employee 1:");
        employee1.display();
        System.out.println("\nEmployee 2:");
        employee2.display();
    }
}
