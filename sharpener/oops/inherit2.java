package sharpener.oops;

public class inherit2 {
    public static void main(String args[]) {
        Employee obj = new Employee("Ram",25,"7003","Bangalore",1000,"cse");
        obj.print_details();
        
        Employee obj1 = new Employee("Shyam",250,"8098","Chennai",2000,"civil");
        obj1.print_details();
        
        Manager obj_Man = new Manager("babu",100,"1234","Bangalore",1000,"JP");
        obj_Man.print_details();
        
        Manager obj1_Man = new Manager("Rao",250,"456","Kerala",3000,"GC");
        obj1_Man.print_details();
    }


}

class Member{
    String Name;
    int Age;
    String Phone_number;
    String Address;
    int Salary;
    public void printSalary(){
        System.out.println(Salary);
    }
 }
 class Employee extends Member{
    String specialization;
      Employee(String Name, int Age, String Phone_number, String Address, int Salary,String specialization){
       this.Name = Name;
       this.Age = Age;
       this.Phone_number = Phone_number;
       this.Address = Address;
       this.Salary = Salary;
       this.specialization = specialization;

    }
     public void print_details(){
           System.out.println(Name);
           System.out.println(specialization);
           printSalary();
     }
 }
 class Manager extends Member{
     String department;
    Manager(String Name, int Age, String Phone_number, String Address, int Salary,String department){
       this.Name = Name;
       this.Age = Age;
       this.Phone_number = Phone_number;
       this.Address = Address;
       this.Salary = Salary;
       this.department = department;

    }
     public void print_details(){
           System.out.println(Name);
           System.out.println(department);
           printSalary();
     }
 }
