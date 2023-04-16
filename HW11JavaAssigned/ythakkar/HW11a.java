import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;
public class HW11a {

   // Define an interface GPAtoPrint here, with a single abstract method checkGPA.
   interface GPAtoPrint {
      boolean checkGPA(float gpa);
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
            Use the lambda function checker to check the Float part of the map entry
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

      // Define two lambda functions gt3_5 and gt3 that take a float and return true if
      // the float is >= 3.5f and >= 3.0f, respectively.
      GPAtoPrint gt3_5 = (gpa) -> {
        w if (gpa >= 3.5f){
            return true;
         }
         return false;
      };
      //GPAtoPrint gt3_5b = gpa -> gpa >= 3.5f;

      GPAtoPrint gt3 = (gpa) -> {
         if (gpa >= 3.0f){
            return true;
         }
         return false;
      };


      System.out.println("Students with a GPA > 3.5:");
      // print list of students with GPA >= 3.5 by calling the printGPA function
      printGPA(studentData, gt3_5);
      System.out.println("Students with a GPA > 3:");
      // print list of students with GPA >= 3.5
      printGPA(studentData, gt3);
   }
}
