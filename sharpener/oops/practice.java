package sharpener.oops;
public class practice {
     public static void main(String[] args) {
        Animal a = new Animal("pavelian",6);
          Dog d = new Dog("pitbull",3);
          d.makeSounds();
          
     }
   

}
class Animal{
    String name;
    int age;
    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void makeSounds(){
        System.out.println("bull make a sound horrible");
    }
 }
 class Dog extends Animal{
    Dog(String name,int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println(name+age);
    }
   
 }
