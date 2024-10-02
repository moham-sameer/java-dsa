package sharpener.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class comparator {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("Mehwish",599));
        emp.add(new Employee("Rumi",1000));
        emp.add(new Employee("Md Ayan",1200));
        emp.add(new Employee("Abu Ubayda",2300));
        emp.add(new Employee("Rahim",1500));
        // Comparator<Employee> com = new Comparator<Employee>() {
        //     public int compare(Employee e1, Employee e2) {
        //         if(e1.getSalary()>e2.getSalary()){
        //             return 1;
        //         }else{
        //             return -1;
        //         }
        //     }
 
        // };
        Collections.sort(emp,(e1,e2)->{
            return e1.Salary>e2.Salary?-1:e1.Salary<e2.Salary?1:0;
        });
        for(Employee empl: emp){
            System.out.println(empl);
        }
    }

}
class Employee{
    String Name;
    int Salary;
    Employee(String Name, int Salary){
       this.Name = Name;
       this.Salary = Salary;
    }
  
   public String toString(){
        return Name+" : "+Salary;
    }
}
