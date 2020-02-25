class Employee{
    String name;
    Integer age;
    String city;
    Employee(String name, Integer age, String city)   {
        this.name=name;
        this.age=age;
        this.city=city;
    }
    Employee getObject(){
        return this;
    }
    public String toString(){
        return "Employee name: "+name+"\nEmployee Age: "+age+"\nEmployee city: "+city;
    }
}
interface employeeDetails{
    Employee empDetails();
}
public class q4_constructor_reference {
    public static void main(String[] args) {

        employeeDetails empdetails=new Employee("Shivam", 23,"Noida")::getObject;
        System.out.println(empdetails.empDetails());

    }
}