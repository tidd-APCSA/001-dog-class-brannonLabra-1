public class Main {
  public static void main(String[] args) {
    // test your code here by creating a three different dogs from the Dog class. Be sure you give each dog different characteristics. 
  Dog baxter = new Dog("Baxter	🐶", "Poodle", 20, "brown", true);
  Dog Leila = new Dog("Leila", "Chiwaua", 12.5, "White", false);
  Dog silas = new Dog("Silas", "Golden Doodle", 30, "Tan", true);

  System.out.println(baxter.getName());
  System.out.println(baxter.getBreed());
  System.out.println(baxter.getWeight());
  System.out.println(baxter.getColor());
  System.out.println(baxter.getHouseTrained());




  }
}