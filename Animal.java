
package zms;


public class Animal {
    //Fields
    String name;
    int age;
    

    // constructor
    public Animal( String name,int age){
        this.name=name;
        this.age=age;
    }
 
    
    //Method 1- making sound
    public void makeSound(){
        System.out.println(name + " is making a sound.");
    
    }
        // Overloaded method to make a sound of an animal multiple times
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(name + " is making a sound.");
        }
        
    }
    
     //Method 2-  eat
    public void eat(){
         System.out.println(name + " is eating.");
    }
     

 // Overloaded method to eat a specific type of food
    public void eat(String foodType) {
        System.out.println(name + " is eating " + foodType + ".");
    }
    
}



// Creating subclasses

//1st - Lion
class Lion extends Animal{
    
 // constructor
    public Lion(String name, int age) {
    super(name, age);
    }

    @Override
      public void makeSound(){
          super.makeSound();
          System.out.println("Roar");
    }
      
    @Override
          public void eat(){
                super.eat();
               System.out.println("Eating meat");
              
    }
}

//2nd - Elephant
class Elephant extends Animal{
    
     // constructor
    public Elephant(String name, int age) {
    super(name, age);
    }
  
    @Override
      public void makeSound(){
          super.makeSound();
          System.out.println("Trumpet");
    }
      
    @Override
          public void eat(){
                super.eat();
                System.out.println("Eating grass");
              
    }
}

//3rd - Monkey
class Monkey extends Animal{
    
         // constructor
    public Monkey(String name, int age) {
    super(name, age);
    }

    @Override
      public void makeSound(int times){
          super.makeSound(times);
          System.out.println("Chatter");
    }
      
    @Override
          public void eat(String foodType){
            super.eat(foodType);
            System.out.println("Eating bananas");
              
    }
}
