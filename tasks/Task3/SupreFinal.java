package tasks.Task3;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void eat() {
        super.eat(); // Using 'super' to call the eat method of the parent class
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal {
    final void meow() {
        System.out.println("Cat is meowing");
    }
}

// class Kitten extends Cat {
//     void meow() {
//         System.out.println("This is kitten class");
//     } // This will cause a  error because of final key word
// }

public class SupreFinal {
     public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();

        Cat myCat = new Cat();
        myCat.meow();

        // Kitten myKitten = new Kitten();  //Creating object for kitten class
        // myKitten.meow();
  }   
}
