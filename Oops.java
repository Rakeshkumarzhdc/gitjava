// Java Program to Demonstrate
// Class Method and Method Passing
import java.io.*;

class Student{
  
      // Properties Declared
      int id;
      String name;
  
      // Printing Student
      public void printStudent(){
          System.out.println("Id:"+id);
          System.out.println("Name:"+name);
    }
}


class GFG {
    public static void main (String[] args) {
          Student obj = new Student();
          
          obj.id=1;
          obj.name="ABC";
      
          obj.printStudent();
    }
}