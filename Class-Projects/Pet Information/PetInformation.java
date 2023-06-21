//John Gill, CS-496, Feb 16th
import java.util.Scanner;

public class PetInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Pet myPet = new Pet();
      Cat myCat = new Cat();
      
      String petName, catName, catBreed;
      int petAge, catAge;

      petName = scnr.nextLine();
      petAge = scnr.nextInt();
      scnr.nextLine();
      catName = scnr.nextLine();
      catAge = scnr.nextInt();
      scnr.nextLine();
      catBreed = scnr.nextLine();
      
      // TODO: Create generic pet (using petName, petAge) and then call printInfo   
      Pet genPet = new Pet();
      genPet.setName(petName);
      genPet.setAge(petAge);
      genPet.printInfo();
      
      // TODO: Create cat pet (using catName, catAge, catBreed) and then call printInfo
      Cat newCat = new Cat();
      newCat.setName(catName);
      newCat.setAge(catAge);
      newCat.setBreed(catBreed);
      // TODO: Use getBreed(), to output the breed of the cat
      newCat.printInfo();
      System.out.println("   Breed: " + newCat.getBreed());
   }
}