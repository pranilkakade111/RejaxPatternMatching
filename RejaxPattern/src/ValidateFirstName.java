public class ValidateFirstName
{
   public static void main( String[] args ) 
   {
      System.out.println(firstName("Pranil"));
   }
   
   public static boolean firstName( String firstName ) 
   {
      return firstName.matches( "[A-Z][a-z]*" );
   }
   
}