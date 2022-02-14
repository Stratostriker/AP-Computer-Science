public class Dog extends Pet {
   private String breed;

   //constructers
   public Dog(String initName, Date initBirthday, String initBreed) {
      super(initName, "Dog", initBirthday);
      this.setBreed(initBreed);
   }
   public Dog(String initName, Date initBirthday)  {
      this(initName, initBirthday, "unknown");
   }

   //toString
   public String toString() {
      return super.toString() + " , Breed: " + getBreed();
   }

   //getter and setter
   public String getBreed() {
      return breed;
   }
   public void setBreed(String newBreed) {
      breed = newBreed;
   }
}