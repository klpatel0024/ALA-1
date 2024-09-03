public class Employee extends Person
{
    public String position; 
    public double salary; 
    public Employee()
    {
        super(0, "none", "none", "none", "none");
        position = "none";
        salary = 0;
    }
    public Employee(int id, String name, String address, String phone, String email, String position, double salary)
    {
        super(id, name, address, phone, email);
        this.position = position;
        this.salary = salary;
    }

    //returns current job position
    public String getPosition()
    {
        return position;
    }

    //returns current salary
    public double getSalary()
    {
        return salary;
    }

    // sets a new job position 
    public void setPosition(String position)
    {
        this.position = position;
    }

    //sets a new salary
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    //prints employee's info by using the super class and string.format 
    @Override
    public String toString()
    {
       
        // String superStr = super.toString();
        // String str = String.format("Position: %s\nSalary: %d\n", 
        //                            position, salary);
        // String str = super.toString() + String.format("Position: %s\nSalary: %f\n", 
        //                                              position, salary);
        String str = super.toString() + "Position: " + getPosition() + 
        "\nSalary: " + getSalary() + "\n"; 
        return str;
    }
}