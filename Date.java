import java.util.Calendar;

public class Date {
   //properties
   private int year;
   private int month;
   private int day;

   //constructors
   public Date(int m, int d, int y) {
      setYear(y);
      setMonth(m);
      setDay(d);
   }
   public Date(int m, int d) {
      Calendar cal = Calendar.getInstance();
      setYear(cal.get(Calendar.YEAR));
      setMonth(m);
      setDay(d);
   }
   public Date() {
      Calendar cal = Calendar.getInstance();
      setYear(cal.get(Calendar.YEAR));
      setMonth(cal.get(Calendar.MONTH) + 1);
      setDay(cal.get(Calendar.DATE));
   }

   //getters
   public int getYear() {
      return year;
   }
   public int getMonth() {
      return month;
   }
   public int getDay() {
      return day;
   }

   //setters
   public void setYear(int newYear) {
      year = newYear;
   }
   public void setMonth(int newMonth) {
      month = newMonth;
   }
   public void setDay(int newDay) {
      day = newDay;
   }
   
   public String toString() {
      //months string array
      String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
      return months[month - 1] + " " + day + ", " + year;
   }
   public boolean equals(Date other) {
      //checks if day, month, and year are different
      return other.day == this.day && other.month == this.month && other.year == this.year;
   }
   public int compareTo(Date other) {
      //compares year, month, and day
      if (this.year < other.year) {
         return -1;
      }
      else if (this.year > other.year) {
         return 1;
      }
      else if (this.month < other.month) {
         return -1;
      }
      else if (this.month > other.month) {
         return 1;
      }
      else if (this.day < other.day) {
         return -1;
      }
      else if (this.day > other.day) {
         return 1;
      }
      return 0;
   }
   //precondition: other is not earlier than this
   public int ageAsOf(Date other) {
      if (this.compareTo(other) == 1) {
         throw new IllegalArgumentException();
      }
      int age = other.year - this.year;
      if (other.month < this.month || (other.month == this.month && other.day < this.day)) {
         age = age - 1;
      }
      return age;
   }
}