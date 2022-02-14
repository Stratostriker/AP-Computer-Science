public class Pet {
   private String name;
   private String type;
   private Date birthday;
   
   //constuctors (part a)
   public Pet(String initName, String initType, Date initBirthday) {
      this.setName(initName);
      this.type = initType;
      this.birthday = initBirthday;
   }
   public Pet(String initName, String initType, int initMonth, int initDay, int initYear) {
      this(initName, initType, new Date(initMonth, initDay, initYear));
   }
   
   //getters and setters (part b)
   public String getName() {
      return name;
   }
   public String getType() {
      return type;
   }
   public Date getBirthday() {
      return birthday;
   }
   public void setName(String newName) {
      name = newName;
   }
   
   public String toString() {
      return "Name: " + name + ", Type: " + type + ", Birthday: " + birthday;
   }
   
   //other methods (parts c and d)
   public boolean isBirthday() {
      //compares month and day
      Date today = new Date();
      Date bday = birthday;
      bday.setYear(today.getYear());
      return today.compareTo(this.getBirthday()) == 0;
   }
   public int getAge() {
      //subtract this year from birthday year to get age
      Date today = new Date();
      int age = today.getYear() - birthday.getYear();
      //subtract 1 from age if birthday has not occured this year
      if (today.getMonth() < birthday.getMonth() || (today.getMonth() == birthday.getMonth() && today.getDay() < birthday.getDay())) {
         age--;
      }
      return age;
   }
}