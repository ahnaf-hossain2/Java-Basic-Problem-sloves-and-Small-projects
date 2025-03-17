public class Employee
{
    private String name;
    private int id;
    private int monthlySalary;

    // Empty Constructor section:
    public Employee()
    {

    }

    // Parameterized Constructor section:
    public Employee(String name, int id, int monthlySalary)
    {
        setName(name);
        setId(id);
        setMonthlySalary(monthlySalary);
    }

    // Setter section:
    public void setName( String name)
    {
        this.name = name;
    }

    public void setId( int id)
    {
        this.id = id;
    }

    public void setMonthlySalary( int monthlySalary)
    {
        this.monthlySalary = monthlySalary;
    }

    // Getter section:
    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public int getMonthlySalary()
    {
        return monthlySalary;
    }

    // Yearly Salary calculation section:
    public int yearlySalary()
    {
        return getMonthlySalary() * 12;
    }

    // Yearly salary with bonus section:
    public double yearlySalaryWithBonus()
    {
        return yearlySalary() + ((getMonthlySalary() * 0.3) * 2);
    }

    // Display section:
    public void display()
    {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Monthly salary: " + getMonthlySalary() + " TAKA");
        System.out.println("yearly Salary: " + yearlySalary() + " TAKA");
        System.out.println("Yearly Salary with bonus: " + yearlySalaryWithBonus() + " TAKA");
    }
}
