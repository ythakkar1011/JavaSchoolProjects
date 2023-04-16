import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;
public class HW11b {

   // Define an interace GPAtoPrint here, with a single abstract method checkGPA

   interface GPAtoPrint {
      Boolean checkGPA(float gpa);
   }

   // Define a local class GT3_5 that implements GPAtoPrint and defines the function
   // checkGPA which takes a float argument and returns true if the argument >= 3.5
   public static class GT3_5 implements GPAtoPrint {
      @Override
      public Boolean checkGPA(float gpa) {
         if (gpa >= 3.5){
            return true;
         }
         return false;
      }
   }
   // Define a local class GT3_0 that implements GPAtoPrint and defines the function
   // checkGPA which takes a float argument and returns true if the argument >= 3.0

   public static class GT3_0 implements GPAtoPrint {
      @Override
      public Boolean checkGPA(float gpa) {
         if (gpa >= 3.0){
            return true;
         }
         return false;
      }
   }

   static void initMap(Map<Integer,Float> map, int size) {
      for (int i=0; i<size; i++) {
         int id = ThreadLocalRandom.current( ).nextInt(0, 100001);
         float gpa = (float) ThreadLocalRandom.current( ).nextDouble(0, 4.0);
         map.put(id, gpa);
      }
   }

   static void printGPA(Map<Integer,Float> map, GPAtoPrint checker) {
     for (Map.Entry<Integer,Float> student : map.entrySet( )) {
         /* 
            Use the checkGPA method defined in checker to check the Float part of the map entry 
            value, and print the student id and gpa if checker returns true.

            To access the key part of the student entry, use student.getKey( ).

            To access the value part of the student entry as a float, and not a Float, use
            student.getValue( ).floatValue( )
         */
        if (checker.checkGPA(student.getValue().floatValue())){
           System.out.println("Student: " + student.getKey() + ", GPA: " + student.getValue( ).floatValue( ) );
        }
     }
   }

   public static void main(String[ ] args) {

      Map<Integer,Float> studentData = new HashMap<Integer,Float>( );
      initMap(studentData, 35);

      // Create new GT3_5 and GT3_0 objects, and call printGPA using these objects to print
      // a list of students with GPAs >= 3.5 and GPAs >= 3.0.
      GT3_5 gpa3_5 = new GT3_5();
      GT3_0 gpa3_0 = new GT3_0();

      System.out.println("Students with a GPA > 3.5:");
      // print list of students with GPA >= 3.5
      printGPA(studentData, gpa3_5);
      System.out.println("Students with a GPA > 3:");
      // print list of students with GPA >= 3.0
      printGPA(studentData, gpa3_0);
   }
}
