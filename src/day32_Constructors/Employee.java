package day32_Constructors;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;


    public Employee(String name){
        this.name = name;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
