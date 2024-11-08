//It changed the String that getName() returned by attaching "The Mighty" to the front
//Since getName is overwritten, speak() now uses the new name

//an animal class could not be a bird because Bird is an extension of the animal class.
//Animal is the overarching class that gets more specific to become a bird. Thus, if we were to write another subclass for Animal, you couldn't make it a bird and then generalize it again.

public class Driver{

  public static void main(String[] args){
    Animal a1 = new Animal("Squack", 3, "Robin");
    a1.speak();
    Bird b1 = new Bird("Squakkkkkkk", 7, "Fido", 5.0, "yellow");
    b1.speak();
    //Bird b2 = new Animal("Squack", 3, "bluejay");
    Animal a2 = new Bird("Squakkkkkkk", 7, "Fido", 5.0, "yellow");
    //b2.speak();
    a2.speak();
  }

}
