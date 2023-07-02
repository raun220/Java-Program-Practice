public class Animal {
     String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

 class Dog extends Animal {
     String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

   // @Override
    public void makeSound() {
      //  System.out.println("The dog barks.");
        super.makeSound();
    }
}

class Call2{
    public static void main(String[] args){
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        System.out.println(dog.getName() + " is a " + dog.getBreed() + " who is " + dog.getAge() + " years old.");
        dog.makeSound();
        Animal animal = dog;
        animal.makeSound();
        animal.name="hi";
        dog.name="hello";

    }
}

