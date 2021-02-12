import java.util.Scanner;

public class Validate
{
   public static void main( String[] args ) 
   {
      System.out.println(firstName("Pranil"));
      System.out.println(lastName("kakade"));
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your Email: ");
      String phone = sc.next();
      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
      boolean result = phone.matches(regex);
      if(result) 
      {
         System.out.println("Given email-id is valid");
      } else 
      {
         System.out.println("Given email-id is not valid");
      }
   }
   
   public static boolean firstName( String firstName ) 
   {
      return firstName.matches( "[A-Z][a-z]*" );
      
   }
   public static boolean lastName( String lastName ) 
   {
	      return lastName.matches( "[A-Z]+([ '-][a-zA-Z]+)*" );
   }
}