abstract class Animal{
     public abstract void makeSound();

     public void sleep(){
        System.out.println("Zzzz...");
     }
}
  class Dog extends Animal{
    public void makeSound(){
        System.out.println("hoof");
    }
  }   
  class Bird extends Animal{
    public void makeSound(){
        System.out.println("tweet");
    }
  }
  public class AbstractionDemo{
    public static void main(String[] args){
    Dog d1 = new Dog();
    

    Bird b1 = new Bird();
    b1.makeSound();
    b1.sleep();
    d1.makeSound();
    d1.sleep();

    }


  }