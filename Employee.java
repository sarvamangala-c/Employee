//package Employee;

public class Employee {
String name;
int id;
double salary;
int age;
public Employee(String name ,int id, double salary,int age){
    this.name= name;
    this.id= id;
    this.salary=salary;
    this.age=age;
}
    public void displayInfo(){
        System.out.println("employee id: " +id);
        System.out.println("name: " +name);
        System.out.println("salary: " +salary);
        System.out.println("age: "+age);
    }
    public static void main(String[] args) {
        Employee emp1 =new Employee("xyz",101,50000.0,20);
        emp1.displayInfo();
    }
}