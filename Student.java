public class Student extends Person
{
    public String major; 
    public Student(){}
    public Student(int id, String name, String address, String phone, String email, String major)
    {
        super(id, name, address, phone, email);
        this.major = major;
    }

    //returns current major
    public String getMajor()
    {
        return major;
    } 
    //sets a new major 
    public void setMajor(String major)
    {
        this.major = major;
    }

    // returns a string using the superclass and adds the student's major
    @Override
    public String toString()
    {
        String str = super.toString() + "Major: " + major + "\n"; 
        return str;

    }
}