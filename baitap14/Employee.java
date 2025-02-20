package baitap14;

public class Employee
{
    private int id;
    private String Firstname;
    private String Lastname;
    private int Salary;
    public Employee(int id, String Firstname, String Lastname, int Salary)
    {
        this.id = id;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Salary = Salary;
    }
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstname()
    {
        return Firstname;
    }

    public void setFirstname(String firstname)
    {
        Firstname = firstname;
    }

    public String getLastname()
    {
        return Lastname;
    }

    public void setLastname(String lastname)
    {
        Lastname = lastname;
    }

    public int getSalary()
    {
        return Salary;
    }

    public void setSalary(int salary)
    {
        Salary = salary;
    }
    public String toString()
    {
        return "Employee["+"id="+id+" ,name= "+Firstname+" "+Lastname+ ", Salary="+Salary+"]";
    }
    public int getAnnualSalary()
    {
        return Salary * 12;
    }
    public int raiseSalary(int percent)
    {
        return this.Salary=this.Salary*10/100+this.Salary;
    }
    public String getName()
    {
        return Firstname+" "+Lastname;
    }
}
