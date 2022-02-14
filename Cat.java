public class Cat extends Pet {
   private Date nextVaccineDate;

   //constructer
   public Cat(String initName, Date initBirthday, Date initNextVaccineDate) {
      super(initName, "Cat", initBirthday);
      nextVaccineDate = initNextVaccineDate;
   }

   //toString
   public String toString() {
      return super.toString() + ", Next Vaccination Date: " + nextVaccineDate;
   }

   //getter
   public Date getNextVaccineDate() {
      return nextVaccineDate;
   }

   //checks if vaccine date is in the past
   public boolean dueForVaccination() {
      Date today = new Date();
      int i = today.compareTo(getNextVaccineDate());
      return i != -1;
   }

   //sets vaccine date to next year
   public void vaccinate() {
      Date today = new Date();
      today.setYear(today.getYear() + 1);
      nextVaccineDate = today;
   }
}