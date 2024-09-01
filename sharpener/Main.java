package sharpener;

public class Main{
    public static void main(String args[]) {
        Employee t=new Employee("ram",1992,"Bangalore");
        t.print_details();
        
        Employee x=new Employee("shyam",2010,"Lucknow");
        x.print_details();
        
        Employee y=new Employee("babu_rao",2015,"Delhi");
        y.print_details();
    }
}

class Employee
{
    //Write the code here
    String name;
    int year_of_joining;
    String address;
    Employee(String name,int year_of_joining,String address){
         this.name = name;
         this.year_of_joining = year_of_joining;
         this.address = address;
    }

    public void print_details(){
        System.out.println(name + " "+year_of_joining+" "+ address);
    }

    
}
