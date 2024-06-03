
package zms;

public class Zoo {
    public static void main(String[] args) {
        // Create instances of Lion, Elephant, and Monkey
          // object for the class Lion
            Lion myLion = new Lion("Lion", 2);
             System.out.println("Animal Lion Details");
              System.out.println("===============================================================");
              myLion.makeSound();
              myLion.eat();
              
       // object for the class Elephant
            Elephant myElephant = new Elephant("Elephant", 6);
            System.out.println("Animal Elephant Details");
            System.out.println("===============================================================");
            myElephant .makeSound();
            myElephant .eat();
              
              
        // object for the class Monkey
           Monkey myMonkey = new Monkey("Monkey", 4);
           System.out.println("Animal Monkey Details");
           System.out.println("===============================================================");
           myMonkey .makeSound();
           myMonkey .eat();
              
    
    }
}
